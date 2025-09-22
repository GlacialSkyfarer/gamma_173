package io.github.GlacialSkyfarer.gamma173.block;

import io.github.GlacialSkyfarer.gamma173.Util;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.block.BlockState;
import net.modificationstation.stationapi.api.item.ItemPlacementContext;
import net.modificationstation.stationapi.api.state.StateManager;
import net.modificationstation.stationapi.api.state.property.EnumProperty;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.util.StringIdentifiable;
import net.modificationstation.stationapi.api.util.math.Direction;

import java.util.List;
import java.util.random.RandomGenerator;

import static io.github.GlacialSkyfarer.gamma173.Gamma173.NAMESPACE;

public class TemplateSlabBlock extends TemplateBlock {

    public static final EnumProperty<SlabType> TYPE = EnumProperty.of("type", SlabType.class);

    private int doubleSlabId = 0;

    public TemplateSlabBlock(Identifier identifier, Material material) {
        super(identifier, material);
    }

    public TemplateSlabBlock setDoubleSlabId(int id) {

        this.doubleSlabId = id;
        return this;

    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        SlabType type;
        assert context.getPlayer() != null;
        if (Util.isPlayerLookingAtTopHalfOfBlock(context.getPlayer(), context.getBlockPos().y)) type = SlabType.TOP;
        else type = SlabType.BOTTOM;
        return getDefaultState().with(TYPE, type);
    }

    public void updateBoundingBox(World world, int x, int y, int z) {

        if (world.getBlockId(x,y,z)!=id) { setBoundingBox(0, 0, 0, 1, 2, 1); return; }
        BlockState state = world.getBlockState(x,y,z);
        switch (state.get(TYPE)) {

            case TOP -> setBoundingBox(0,0.5f,0,1,1,1);
            case BOTTOM -> setBoundingBox(0,0,0,1,0.5f,1);
            case DOUBLE -> setBoundingBox(0,0,0,1,1,1);

        }

    }

    @Override
    public Box getBoundingBox(World world, int x, int y, int z) {
        updateBoundingBox(world,x,y,z);
        return super.getBoundingBox(world, x, y, z);
    }

    @Override
    public Box getCollisionShape(World world, int x, int y, int z) {
        updateBoundingBox(world,x,y,z);
        return super.getCollisionShape(world, x, y, z);
    }

    @Override
    public HitResult raycast(World world, int x, int y, int z, Vec3d startPos, Vec3d endPos) {
        updateBoundingBox(world,x,y,z);
        return super.raycast(world, x, y, z, startPos, endPos);
    }

    @Override
    public List<ItemStack> getDropList(World world, int x, int y, int z, BlockState state, int meta) {
        if (world.getBlockId(x,y,z) != this.id) return null;
        if (world.getBlockState(x,y,z).get(TYPE) == SlabType.DOUBLE) {
            return  List.of(new ItemStack(asItem()), new ItemStack(asItem()));
        }

        return super.getDropList(world, x, y, z, state, meta);
    }

    @Override
    public boolean isFullCube() {
        return false;
    }

    @Override
    public boolean isOpaque() {
        return false;
    }

    @Override
    public void appendProperties(StateManager.Builder<Block, BlockState> builder) {

        builder.add(TYPE);
        super.appendProperties(builder);

    }

    @Override
    public boolean onUse(World world, int x, int y, int z, PlayerEntity player) {
        int side = player.raycast(5.0,1).side;
        NAMESPACE.getLogger().info(side);
        //NOT up or down
        if (side > 1) {
            return super.onUse(world,x,y,z,player);
        }
        ItemStack hand = player.getHand();
        if (hand == null || hand.itemId != this.asItem().id) return super.onUse(world,x,y,z,player);
        if (side == 1) {

            BlockState state = world.getBlockState(x,y,z);
            if (state.get(TYPE) == SlabType.BOTTOM) {

                world.setBlock(x,y,z,doubleSlabId);
                hand.count -= 1;
                world.playSound(x,y,z, WOOD_SOUND_GROUP.getSound(),1, 1f + world.random.nextFloat()/2f);
                //world.setBlockState(x, y - 1, z, state.with(TYPE, SlabType.DOUBLE));
                return true;

            } else {

                return super.onUse(world,x,y,z,player);

            }

        }

        if (side == 0) {

            BlockState state = world.getBlockState(x,y,z);
            if (state.get(TYPE) == SlabType.TOP) {

                world.setBlock(x,y,z,doubleSlabId);
                hand.count -= 1;
                world.playSound(x,y,z, WOOD_SOUND_GROUP.getSound(),1, 1f + world.random.nextFloat()/2f);
                //world.setBlockState(x, y + 1, z, state.with(TYPE, SlabType.DOUBLE));
                return true;

            } else {

                return super.onUse(world,x,y,z,player);

            }

        }

        return super.onUse(world,x,y,z,player);
    }

    @Override
    public void onPlaced(World world, int x, int y, int z, LivingEntity placer) {


    }

}

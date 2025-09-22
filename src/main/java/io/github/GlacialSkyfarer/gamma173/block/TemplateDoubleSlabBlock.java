package io.github.GlacialSkyfarer.gamma173.block;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.block.BlockState;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.List;
import java.util.Random;

public class TemplateDoubleSlabBlock extends TemplateBlock {

    private int itemId = 0;

    public TemplateDoubleSlabBlock(Identifier identifier, Material material) {
        super(identifier, material);
    }

    public TemplateDoubleSlabBlock setItemId(int id) {

        this.itemId = id;
        return this;

    }

    @Override
    public List<ItemStack> getDropList(World world, int x, int y, int z, BlockState state, int meta) {
        return List.of(new ItemStack(this.itemId,2,0));
    }

    @Override
    public int getDroppedItemId(int blockMeta, Random random) {
        return this.itemId;
    }
}

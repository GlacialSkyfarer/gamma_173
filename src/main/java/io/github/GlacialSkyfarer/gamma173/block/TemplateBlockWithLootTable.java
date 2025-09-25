package io.github.GlacialSkyfarer.gamma173.block;

import io.github.GlacialSkyfarer.gamma173.interfaces.IGetSetBlockLootTable;
import io.github.GlacialSkyfarer.gamma173.loot_table.BlockLootTable;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.block.BlockState;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.List;

public class TemplateBlockWithLootTable extends TemplateBlock {

    public TemplateBlockWithLootTable(Identifier identifier, Material material) {
        super(identifier, material);
    }
    @Override
    public List<ItemStack> getDropList(World world, int x, int y, int z, BlockState state, int meta) {
        IGetSetBlockLootTable self = (IGetSetBlockLootTable)this;
        return (self.gamma_173$getLootTable().getDrops(world.random, world, state, x,y,z));
    }
    public BlockLootTable getLootTable() {
        return ((IGetSetBlockLootTable)this).gamma_173$getLootTable();
    }
    public Block setLootTable(BlockLootTable table) {
        return ((IGetSetBlockLootTable)this).gamma_173$setLootTable(table);
    }

}

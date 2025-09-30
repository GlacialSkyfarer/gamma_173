package io.github.GlacialSkyfarer.gamma173.interfaces;

import io.github.GlacialSkyfarer.gamma173.loot_table.BlockLootTable;
import net.minecraft.block.Block;

public interface IGetSetBlockLootTable {

    default BlockLootTable gamma_173$getLootTable() { return new BlockLootTable(); }
    default Block gamma_173$setLootTable(BlockLootTable table) {return null;}

}

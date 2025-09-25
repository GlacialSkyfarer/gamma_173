package io.github.GlacialSkyfarer.gamma173.mixin.block;

import io.github.GlacialSkyfarer.gamma173.interfaces.IGetSetBlockLootTable;
import io.github.GlacialSkyfarer.gamma173.loot_table.BlockLootTable;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(Block.class)
public class BlockMixin implements IGetSetBlockLootTable {

    @Unique
    public BlockLootTable lootTable;

    @Override
    public Block gamma_173$setLootTable(BlockLootTable table) {
        this.lootTable = table;
        return ((Block)(Object)this);
    }

    public BlockLootTable gamma_173$getLootTable() {
        return lootTable;
    }

}

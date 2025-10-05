package io.github.GlacialSkyfarer.gamma173.loot_table;

import net.minecraft.block.Block;

public class BlockLootTableJson {

    public BlockLootTableJson(String identifier, BlockLootTable table) {

        this.identifier = identifier;
        this.table = table;

    }

    public String identifier = "";
    public BlockLootTable table;

}

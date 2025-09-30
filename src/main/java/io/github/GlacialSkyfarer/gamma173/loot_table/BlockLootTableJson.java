package io.github.GlacialSkyfarer.gamma173.loot_table;

import net.modificationstation.stationapi.api.util.Identifier;

public class BlockLootTableJson {

    public BlockLootTableJson(Identifier id, BlockLootTable table) {
        this.id = id.toString();
        this.table = table;
    }

    public String id;
    public BlockLootTable table;

}

package io.github.GlacialSkyfarer.gamma173.loot_table;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.block.BlockState;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlockLootTable {

    public BlockLootTable() {
        this.entries = new ArrayList<>();
    }

    protected List<BlockLootEntry> entries;

    public BlockLootTable addEntry(BlockLootEntry entry) {
        this.entries.add(entry);
        return this;
    }

    public List<ItemStack> getDrops(Random random, World world, BlockState state, int x, int y, int z) {

        List<ItemStack> drops = new ArrayList<ItemStack>();
        for (BlockLootEntry e : entries) {
            ItemStack i = e.getDrop(random, world, state, x,y,z);
            if (i != null) {
                drops.add(i);
            }
        }

        return drops;
    }

    public String serialize() {
        GsonBuilder builder = new GsonBuilder().setPrettyPrinting();
        Gson gson = builder.create();
        return gson.toJson(this);
    }

    public static BlockLootTable deSerialize(String json) {
        GsonBuilder builder = new GsonBuilder().setPrettyPrinting();
        Gson gson = builder.create();
        return gson.fromJson(json, BlockLootTable.class);
    }

}

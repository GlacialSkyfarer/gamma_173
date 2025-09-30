package io.github.GlacialSkyfarer.gamma173.loot_table;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.GlacialSkyfarer.gamma173.loot_table.predicates.IBlockLootPredicate;
import net.glasslauncher.mods.alwaysmoreitems.gui.widget.ingredients.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.block.BlockState;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.*;

public class BlockLootEntry {

    protected Identifier itemId;
    protected int minCount;
    protected int maxCount;
    protected int minDamage;
    protected int maxDamage;
    protected List<IBlockLootPredicate> predicates;

    public BlockLootEntry(Identifier id, int minC, int maxC, int minD, int maxD) {
        itemId = id;
        minCount = minC;
        maxCount = maxC;
        minDamage = minD;
        maxDamage = maxD;
        predicates = new ArrayList<>();
    }
    public BlockLootEntry(Identifier id, int minC, int maxC) {
        this(id, minC, maxC, 0, 0);
    }
    public BlockLootEntry(Identifier id) {
        this(id,1,1,0,0);
    }

    public BlockLootEntry addPredicate(IBlockLootPredicate predicate) {

        this.predicates.add(predicate);
        return this;

    }

    public ItemStack getDrop(Random random, World world, BlockState state, int x, int y, int z) {
        for(IBlockLootPredicate p : predicates) {
            if (!p.isFulfilled(state, random)) return null;
        }
        int count = minCount >= maxCount ? minCount : random.nextInt(minCount, maxCount);
        int damage = minDamage >= maxDamage ? minDamage : random.nextInt(minDamage, maxDamage);
        return null;
    }

}

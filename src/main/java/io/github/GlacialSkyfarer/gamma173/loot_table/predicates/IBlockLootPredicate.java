package io.github.GlacialSkyfarer.gamma173.loot_table.predicates;

import net.modificationstation.stationapi.api.block.BlockState;

import java.util.Random;

public interface IBlockLootPredicate {

    public boolean isFulfilled(BlockState state, Random random);

}



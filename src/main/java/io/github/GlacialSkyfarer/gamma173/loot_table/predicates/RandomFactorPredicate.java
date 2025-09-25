package io.github.GlacialSkyfarer.gamma173.loot_table.predicates;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.modificationstation.stationapi.api.block.BlockState;
import net.modificationstation.stationapi.api.state.property.Property;

import java.util.Random;

public class RandomFactorPredicate implements IBlockLootPredicate {

    private double factor = 0;

    public RandomFactorPredicate(double factor) {
        this.factor = factor;
    }

    @Override
    public boolean isFulfilled(BlockState state, Random random) {

        if(state.isAir()) return false;
        return random.nextDouble(0, 1) < factor;

    }
}

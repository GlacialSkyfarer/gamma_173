package io.github.GlacialSkyfarer.gamma173.events.init;

import com.google.gson.Gson;
import io.github.GlacialSkyfarer.gamma173.Gamma173;
import io.github.GlacialSkyfarer.gamma173.loot_table.BlockLootEntry;
import io.github.GlacialSkyfarer.gamma173.loot_table.BlockLootTable;
import io.github.GlacialSkyfarer.gamma173.loot_table.predicates.RandomFactorPredicate;
import io.github.GlacialSkyfarer.gamma173.loot_table.predicates.StatePropertyPredicate;
import io.github.GlacialSkyfarer.gamma173.reef_biome.events.init.BlockListener;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.event.registry.AfterBlockAndItemRegisterEvent;
import net.modificationstation.stationapi.api.util.Identifier;

public class AfterBlockAndItemListener {

    @EventListener
    public static void afterBlockAndItemRegister(AfterBlockAndItemRegisterEvent event) {

        BlockListener.ReefwoodDoor.asItem().setMaxCount(1);

        BlockLootTable t = new BlockLootTable().addEntry(new BlockLootEntry(Gamma173.NAMESPACE.id("reefwood_door"))
                .addPredicate(new StatePropertyPredicate<>("open", true))
                .addPredicate(new RandomFactorPredicate(0.5)));
        Identifier id = Gamma173.NAMESPACE.id("agwah");


    }

}

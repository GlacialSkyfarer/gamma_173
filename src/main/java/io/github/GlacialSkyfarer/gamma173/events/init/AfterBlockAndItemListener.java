package io.github.GlacialSkyfarer.gamma173.events.init;

import io.github.GlacialSkyfarer.gamma173.reef_biome.events.init.BlockListener;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.event.registry.AfterBlockAndItemRegisterEvent;

public class AfterBlockAndItemListener {

    @EventListener
    public static void afterBlockAndItemRegister(AfterBlockAndItemRegisterEvent event) {

        BlockListener.ReefwoodDoor.asItem().setMaxCount(1);

    }

}

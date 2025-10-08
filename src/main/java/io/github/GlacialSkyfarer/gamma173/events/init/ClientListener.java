package io.github.GlacialSkyfarer.gamma173.events.init;

import io.github.GlacialSkyfarer.gamma173.Gamma173;
import io.github.GlacialSkyfarer.gamma173.block.entity.AnvilBlockEntity;
import io.github.GlacialSkyfarer.gamma173.gui.AnvilScreen;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.modificationstation.stationapi.api.client.gui.screen.GuiHandler;
import net.modificationstation.stationapi.api.event.registry.GuiHandlerRegistryEvent;

@Environment(EnvType.CLIENT)
public class ClientListener {

    @EventListener
    public void registerScreenHandlers(GuiHandlerRegistryEvent event) {
        event.register(Gamma173.NAMESPACE.id("anvil"), new GuiHandler((GuiHandler.ScreenFactoryNoMessage) this::openAnvil, AnvilBlockEntity::new));
    }

    private Screen openAnvil(PlayerEntity player, Inventory inventory) {
        return new AnvilScreen(player, (AnvilBlockEntity) inventory);
    }

}

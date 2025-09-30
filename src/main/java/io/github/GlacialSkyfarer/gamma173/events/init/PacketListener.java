package io.github.GlacialSkyfarer.gamma173.events.init;

import io.github.GlacialSkyfarer.gamma173.packet.SoundPacket;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.event.network.packet.PacketRegisterEvent;
import net.modificationstation.stationapi.api.registry.PacketTypeRegistry;
import net.modificationstation.stationapi.api.registry.Registry;

import static io.github.GlacialSkyfarer.gamma173.Gamma173.NAMESPACE;

public class PacketListener {

    @EventListener
    public void registerPackets(PacketRegisterEvent event) {

        //Registry.register(PacketTypeRegistry.INSTANCE, NAMESPACE.id("play_sound"), SoundPacket.TYPE);

    }

}

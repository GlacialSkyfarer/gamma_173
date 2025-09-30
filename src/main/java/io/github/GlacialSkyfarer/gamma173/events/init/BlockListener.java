package io.github.GlacialSkyfarer.gamma173.events.init;

import io.github.GlacialSkyfarer.gamma173.block.TemplateBlockWithLootTable;
import io.github.GlacialSkyfarer.gamma173.block.TemplateDoorBlock;
import io.github.GlacialSkyfarer.gamma173.block.TemplateSlabBlock;
import io.github.GlacialSkyfarer.gamma173.block.TemplateTrapdoorBlock;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;

import static io.github.GlacialSkyfarer.gamma173.Gamma173.NAMESPACE;

public class BlockListener {

    //Vanilla replacements
    public static Block OakLog;
    public static Block OakDoor;
    public static Block OakTrapdoor;
    public static Block OakSlab;

    @EventListener
    public static void registerBlocks(BlockRegistryEvent event) {

        //Vanilla replacements
        OakLog = new TemplateBlock(NAMESPACE.id("oak_log"), Material.WOOD)
                .setTranslationKey(NAMESPACE.id("oak_log"))
                .setSoundGroup(Block.WOOD_SOUND_GROUP)
                .setHardness(2.0f);
        OakDoor = new TemplateDoorBlock(NAMESPACE.id("oak_door"), Material.WOOD)
                .setTranslationKey(NAMESPACE.id("oak_door"))
                .setSoundGroup(Block.WOOD_SOUND_GROUP)
                .setHardness(3.0f)
                .disableTrackingStatistics();
        OakTrapdoor = new TemplateTrapdoorBlock(NAMESPACE.id("oak_trapdoor"), Material.WOOD)
                .setTranslationKey(NAMESPACE.id("oak_trapdoor"))
                .setSoundGroup(Block.WOOD_SOUND_GROUP)
                .setHardness(3.0f);
        OakSlab = new TemplateSlabBlock(NAMESPACE.id("oak_slab"), Material.WOOD)
                .setTranslationKey(NAMESPACE.id("oak_slab"))
                .setSoundGroup(Block.WOOD_SOUND_GROUP)
                .setHardness(2.0f);

    }
}

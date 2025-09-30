package io.github.GlacialSkyfarer.gamma173.reef_biome.events.init;

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

    public static Block ReefwoodLog;
    public static Block ReefwoodPlanks;
    public static Block ReefwoodDoor;
    public static Block ReefwoodTrapdoor;
    public static Block ReefwoodSlab;

    @EventListener
    public static void registerBlocks(BlockRegistryEvent event) {

        ReefwoodLog = new TemplateBlockWithLootTable(NAMESPACE.id("reefwood_log"), Material.WOOD)
                .setTranslationKey(NAMESPACE.id("reefwood_log"))
                .setSoundGroup(Block.WOOD_SOUND_GROUP)
                .setHardness(2.0f);
        ReefwoodPlanks = new TemplateBlock(NAMESPACE.id("reefwood_planks"), Material.WOOD)
                .setTranslationKey(NAMESPACE.id("reefwood_planks"))
                .setSoundGroup(Block.WOOD_SOUND_GROUP)
                .setHardness(2.0f)
                .setResistance(5.0f);
        ReefwoodDoor = new TemplateDoorBlock(NAMESPACE.id("reefwood_door"), Material.WOOD)
                .setTranslationKey(NAMESPACE.id("reefwood_door"))
                .setSoundGroup(Block.WOOD_SOUND_GROUP)
                .setHardness(3.0f)
                .disableTrackingStatistics();
        ReefwoodTrapdoor = new TemplateTrapdoorBlock(NAMESPACE.id("reefwood_trapdoor"), Material.WOOD)
                .setTranslationKey(NAMESPACE.id("reefwood_trapdoor"))
                .setSoundGroup(Block.WOOD_SOUND_GROUP)
                .setHardness(3.0f)
                .disableTrackingStatistics();
        ReefwoodSlab = new TemplateSlabBlock(NAMESPACE.id("reefwood_slab"), Material.WOOD)
                .setTranslationKey(NAMESPACE.id("reefwood_slab"))
                .setSoundGroup(Block.WOOD_SOUND_GROUP)
                .setHardness(2.0f);

    }
}

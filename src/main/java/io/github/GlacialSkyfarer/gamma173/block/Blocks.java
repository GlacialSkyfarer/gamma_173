package io.github.GlacialSkyfarer.gamma173.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;

import static io.github.GlacialSkyfarer.gamma173.Gamma173.NAMESPACE;

public class Blocks {

    //Vanilla replacements
    public static Block OAK_LOG,
            SPRUCE_LOG,
            BIRCH_LOG,
            OAK_DOOR,
            OAK_TRAPDOOR,
            OAK_SLAB,
            STONE_SLAB,
            COBBLESTONE_SLAB,
            SANDSTONE_SLAB;
    //Gamma
    public static Block COPPER_BLOCK,
            COPPER_ORE,
            COPPER_TILES,
            COAL_BLOCK,
            REDSTONE_BLOCK;

    public static void registerBlocks(BlockRegistryEvent event) {

        //Vanilla replacements
        OAK_LOG = new TemplateBlock(NAMESPACE.id("oak_log"), Material.WOOD)
                .setTranslationKey(NAMESPACE.id("oak_log"))
                .setSoundGroup(Block.WOOD_SOUND_GROUP)
                .setHardness(2.0f);
        SPRUCE_LOG = new TemplateBlock(NAMESPACE.id("spruce_log"), Material.WOOD)
                .setTranslationKey(NAMESPACE.id("spruce_log"))
                .setSoundGroup(Block.WOOD_SOUND_GROUP)
                .setHardness(2.0f);
        BIRCH_LOG = new TemplateBlock(NAMESPACE.id("birch_log"), Material.WOOD)
                .setTranslationKey(NAMESPACE.id("birch_log"))
                .setSoundGroup(Block.WOOD_SOUND_GROUP)
                .setHardness(2.0f);
        OAK_DOOR = new TemplateDoorBlock(NAMESPACE.id("oak_door"), Material.WOOD)
                .setTranslationKey(NAMESPACE.id("oak_door"))
                .setSoundGroup(Block.WOOD_SOUND_GROUP)
                .setHardness(3.0f)
                .disableTrackingStatistics();
        OAK_TRAPDOOR = new TemplateTrapdoorBlock(NAMESPACE.id("oak_trapdoor"), Material.WOOD)
                .setTranslationKey(NAMESPACE.id("oak_trapdoor"))
                .setSoundGroup(Block.WOOD_SOUND_GROUP)
                .setHardness(3.0f);
        OAK_SLAB = new TemplateSlabBlock(NAMESPACE.id("oak_slab"), Material.WOOD)
                .setTranslationKey(NAMESPACE.id("oak_slab"))
                .setSoundGroup(Block.WOOD_SOUND_GROUP)
                .setHardness(2.0f);
        STONE_SLAB = new TemplateSlabBlock(NAMESPACE.id("stone_slab"), Material.STONE)
                .setTranslationKey(NAMESPACE.id("stone_slab"))
                .setSoundGroup(Block.STONE_SOUND_GROUP)
                .setHardness(1.5f);
        COBBLESTONE_SLAB = new TemplateSlabBlock(NAMESPACE.id("cobblestone_slab"), Material.STONE)
                .setTranslationKey(NAMESPACE.id("cobblestone_slab"))
                .setSoundGroup(Block.STONE_SOUND_GROUP)
                .setHardness(2.0f);
        SANDSTONE_SLAB = new TemplateSlabBlock(NAMESPACE.id("sandstone_slab"), Material.STONE)
                .setTranslationKey(NAMESPACE.id("sandstone_slab"))
                .setSoundGroup(Block.STONE_SOUND_GROUP)
                .setHardness(0.8f);
        //Gamma
        COPPER_BLOCK = new TemplateBlock(NAMESPACE.id("copper_block"), Material.METAL)
                .setTranslationKey(NAMESPACE.id("copper_block"))
                .setSoundGroup(Block.METAL_SOUND_GROUP)
                .setHardness(3.0f)
                .setResistance(10.0f);
        COPPER_TILES = new TemplateBlock(NAMESPACE.id("copper_tiles"), Material.METAL)
                .setTranslationKey(NAMESPACE.id("copper_tiles"))
                .setSoundGroup(Block.METAL_SOUND_GROUP)
                .setHardness(3.0f)
                .setResistance(7.0f);
        COPPER_ORE = new TemplateBlock(NAMESPACE.id("copper_ore"), Material.STONE)
                .setTranslationKey(NAMESPACE.id("copper_ore"))
                .setSoundGroup(Block.STONE_SOUND_GROUP)
                .setHardness(3.0f)
                .setResistance(5.0f);
        COAL_BLOCK = new TemplateBlock(NAMESPACE.id("coal_block"), Material.STONE)
                .setTranslationKey(NAMESPACE.id("coal_block"))
                .setSoundGroup(Block.STONE_SOUND_GROUP)
                .setHardness(2.5f)
                .setResistance(7.0f);
        REDSTONE_BLOCK = new RedstoneBlock(NAMESPACE.id("redstone_block"), Material.STONE)
                .setTranslationKey(NAMESPACE.id("redstone_block"))
                .setSoundGroup(Block.STONE_SOUND_GROUP)
                .setHardness(3.0f)
                .setResistance(7.0f);

    }
}

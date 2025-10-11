package io.github.GlacialSkyfarer.gamma173.events.init;

import io.github.DanyGames2014.CraftingHelper;
import io.github.GlacialSkyfarer.gamma173.Gamma173;
import io.github.GlacialSkyfarer.gamma173.block.Blocks;
import io.github.GlacialSkyfarer.gamma173.block.entity.AnvilBlockEntity;
import io.github.GlacialSkyfarer.gamma173.item.Items;
import io.github.GlacialSkyfarer.gamma173.packet.SoundPacket;
import io.github.GlacialSkyfarer.gamma173.reef_biome.block.ReefBiomeBlocks;
import io.github.recipe.AnvilRecipe;
import io.github.recipe.AnvilRecipeHandler;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.event.block.entity.BlockEntityRegisterEvent;
import net.modificationstation.stationapi.api.event.mod.InitEvent;
import net.modificationstation.stationapi.api.event.network.packet.PacketRegisterEvent;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.event.registry.AfterBlockAndItemRegisterEvent;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.registry.PacketTypeRegistry;
import net.modificationstation.stationapi.api.registry.Registry;

import static io.github.GlacialSkyfarer.gamma173.Gamma173.NAMESPACE;
import static io.github.GlacialSkyfarer.gamma173.Util.setRepairMaterial;

public class CommonListener {

    @EventListener
    public static void serverInit(InitEvent event) {
        Gamma173.LOGGER.info("Successfully loaded {}", NAMESPACE);
    }

    @EventListener
    public static void registerBlocks(BlockRegistryEvent event) {
        Blocks.registerBlocks(event);
        ReefBiomeBlocks.registerBlocks(event);
    }

    @EventListener
    public static void registerItems(ItemRegistryEvent event) {
        Items.registerItems(event);
    }

    @EventListener
    public static void afterBlockItemInit(AfterBlockAndItemRegisterEvent event) {
        ReefBiomeBlocks.ReefwoodDoor.asItem().setMaxCount(1);

        //Vanilla repair materials

        setRepairMaterial(Item.WOODEN_SWORD, Block.PLANKS.asItem());
        setRepairMaterial(Item.WOODEN_PICKAXE, Block.PLANKS.asItem());
        setRepairMaterial(Item.WOODEN_AXE, Block.PLANKS.asItem());
        setRepairMaterial(Item.WOODEN_SHOVEL, Block.PLANKS.asItem());
        setRepairMaterial(Item.WOODEN_HOE, Block.PLANKS.asItem());

        setRepairMaterial(Item.LEATHER_HELMET, Item.LEATHER);
        setRepairMaterial(Item.LEATHER_CHESTPLATE, Item.LEATHER);
        setRepairMaterial(Item.LEATHER_LEGGINGS, Item.LEATHER);
        setRepairMaterial(Item.LEATHER_BOOTS, Item.LEATHER);

        setRepairMaterial(Item.STONE_SWORD, Block.COBBLESTONE.asItem());
        setRepairMaterial(Item.STONE_PICKAXE, Block.COBBLESTONE.asItem());
        setRepairMaterial(Item.STONE_AXE, Block.COBBLESTONE.asItem());
        setRepairMaterial(Item.STONE_SHOVEL, Block.COBBLESTONE.asItem());
        setRepairMaterial(Item.STONE_HOE, Block.COBBLESTONE.asItem());

        setRepairMaterial(Item.CHAIN_HELMET, Block.FIRE.asItem());
        setRepairMaterial(Item.CHAIN_CHESTPLATE, Block.FIRE.asItem());
        setRepairMaterial(Item.CHAIN_LEGGINGS, Block.FIRE.asItem());
        setRepairMaterial(Item.CHAIN_BOOTS, Block.FIRE.asItem());

        setRepairMaterial(Item.IRON_SWORD, Item.IRON_INGOT);
        setRepairMaterial(Item.IRON_PICKAXE, Item.IRON_INGOT);
        setRepairMaterial(Item.IRON_AXE, Item.IRON_INGOT);
        setRepairMaterial(Item.IRON_SHOVEL, Item.IRON_INGOT);
        setRepairMaterial(Item.IRON_HOE, Item.IRON_INGOT);

        setRepairMaterial(Item.IRON_HELMET, Item.IRON_INGOT);
        setRepairMaterial(Item.IRON_CHESTPLATE, Item.IRON_INGOT);
        setRepairMaterial(Item.IRON_LEGGINGS, Item.IRON_INGOT);
        setRepairMaterial(Item.IRON_BOOTS, Item.IRON_INGOT);

        setRepairMaterial(Item.GOLDEN_SWORD, Item.GOLD_INGOT);
        setRepairMaterial(Item.GOLDEN_PICKAXE, Item.GOLD_INGOT);
        setRepairMaterial(Item.GOLDEN_AXE, Item.GOLD_INGOT);
        setRepairMaterial(Item.GOLDEN_SHOVEL, Item.GOLD_INGOT);
        setRepairMaterial(Item.GOLDEN_HOE, Item.GOLD_INGOT);

        setRepairMaterial(Item.GOLDEN_HELMET, Item.GOLD_INGOT);
        setRepairMaterial(Item.GOLDEN_CHESTPLATE, Item.GOLD_INGOT);
        setRepairMaterial(Item.GOLDEN_LEGGINGS, Item.GOLD_INGOT);
        setRepairMaterial(Item.GOLDEN_BOOTS, Item.GOLD_INGOT);

        setRepairMaterial(Item.DIAMOND_SWORD, Item.DIAMOND);
        setRepairMaterial(Item.DIAMOND_PICKAXE, Item.DIAMOND);
        setRepairMaterial(Item.DIAMOND_AXE, Item.DIAMOND);
        setRepairMaterial(Item.DIAMOND_SHOVEL, Item.DIAMOND);
        setRepairMaterial(Item.DIAMOND_HOE, Item.DIAMOND);

        setRepairMaterial(Item.DIAMOND_HELMET, Item.DIAMOND);
        setRepairMaterial(Item.DIAMOND_CHESTPLATE, Item.DIAMOND);
        setRepairMaterial(Item.DIAMOND_LEGGINGS, Item.DIAMOND);
        setRepairMaterial(Item.DIAMOND_BOOTS, Item.DIAMOND);

        setRepairMaterial(Item.SHEARS, Item.IRON_INGOT);
        setRepairMaterial(Item.FISHING_ROD, Item.STRING);
        setRepairMaterial(Item.FLINT_AND_STEEL, Item.FLINT);

    }

    @EventListener
    public static void registerPackets(PacketRegisterEvent event) {
        Registry.register(PacketTypeRegistry.INSTANCE, NAMESPACE.id("play_sound"), SoundPacket.TYPE);
    }

    @EventListener
    public static void registerRecipes(RecipeRegisterEvent event) {
        CraftingHelper.removeRecipe(Item.WOODEN_DOOR);
        CraftingHelper.removeRecipe(Block.TRAPDOOR);
        CraftingHelper.removeRecipe(Block.SLAB);
        CraftingHelper.removeRecipe(Block.FENCE);
        CraftingHelper.removeRecipe(Block.STONE_PRESSURE_PLATE);
        CraftingHelper.removeRecipe(Block.WOODEN_PRESSURE_PLATE);
        CraftingHelper.removeRecipe(Block.COBBLESTONE_STAIRS);
        CraftingHelper.removeRecipe(Block.WOODEN_STAIRS);
        CraftingHelper.removeRecipe(Block.WOOL);

        AnvilRecipeHandler.register(new AnvilRecipe(Item.GOLDEN_SWORD, Items.COPPER_INGOT, new ItemStack(Items.ROSE_GOLD_SWORD)));
        AnvilRecipeHandler.register(new AnvilRecipe(Item.GOLDEN_PICKAXE, Items.COPPER_INGOT, new ItemStack(Items.ROSE_GOLD_PICKAXE)));
        AnvilRecipeHandler.register(new AnvilRecipe(Item.GOLDEN_AXE, Items.COPPER_INGOT, new ItemStack(Items.ROSE_GOLD_AXE)));
        AnvilRecipeHandler.register(new AnvilRecipe(Item.GOLDEN_SHOVEL, Items.COPPER_INGOT, new ItemStack(Items.ROSE_GOLD_SHOVEL)));
        AnvilRecipeHandler.register(new AnvilRecipe(Item.GOLDEN_HOE, Items.COPPER_INGOT, new ItemStack(Items.ROSE_GOLD_HOE)));

        AnvilRecipeHandler.register(new AnvilRecipe(Item.GOLDEN_HELMET, Items.COPPER_INGOT, new ItemStack(Items.ROSE_GOLD_HELMET)));
        AnvilRecipeHandler.register(new AnvilRecipe(Item.GOLDEN_CHESTPLATE, Items.COPPER_INGOT, new ItemStack(Items.ROSE_GOLD_CHESTPLATE)));
        AnvilRecipeHandler.register(new AnvilRecipe(Item.GOLDEN_LEGGINGS, Items.COPPER_INGOT, new ItemStack(Items.ROSE_GOLD_LEGGINGS)));
        AnvilRecipeHandler.register(new AnvilRecipe(Item.GOLDEN_BOOTS, Items.COPPER_INGOT, new ItemStack(Items.ROSE_GOLD_BOOTS)));
    }

    @EventListener
    public static void registerBlockEntities(BlockEntityRegisterEvent event) {
        event.register(AnvilBlockEntity.class, NAMESPACE.id("anvil").toString());
    }

}

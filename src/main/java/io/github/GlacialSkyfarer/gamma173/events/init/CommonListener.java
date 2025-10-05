package io.github.GlacialSkyfarer.gamma173.events.init;

import com.google.gson.Gson;
import io.github.DanyGames2014.CraftingHelper;
import io.github.GlacialSkyfarer.gamma173.Gamma173;
import io.github.GlacialSkyfarer.gamma173.block.Blocks;
import io.github.GlacialSkyfarer.gamma173.item.Items;
import io.github.GlacialSkyfarer.gamma173.loot_table.BlockLootEntry;
import io.github.GlacialSkyfarer.gamma173.loot_table.BlockLootTable;
import io.github.GlacialSkyfarer.gamma173.loot_table.BlockLootTableJson;
import io.github.GlacialSkyfarer.gamma173.loot_table.predicates.RandomFactorPredicate;
import io.github.GlacialSkyfarer.gamma173.loot_table.predicates.StatePropertyPredicate;
import io.github.GlacialSkyfarer.gamma173.packet.SoundPacket;
import io.github.GlacialSkyfarer.gamma173.reef_biome.block.ReefBiomeBlocks;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.modificationstation.stationapi.api.event.mod.InitEvent;
import net.modificationstation.stationapi.api.event.network.packet.PacketRegisterEvent;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.event.registry.AfterBlockAndItemRegisterEvent;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.registry.PacketTypeRegistry;
import net.modificationstation.stationapi.api.registry.Registry;
import net.modificationstation.stationapi.api.util.Identifier;

import static io.github.GlacialSkyfarer.gamma173.Gamma173.NAMESPACE;

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

        BlockLootTable t = new BlockLootTable().addEntry(new BlockLootEntry("gamma173:reefwood_door")
                .addPredicate(new StatePropertyPredicate<>("open", true))
                .addPredicate(new RandomFactorPredicate(0.5)));
        Identifier id = Gamma173.NAMESPACE.id("agwah");

        Gamma173.LOGGER.info(new Gson().toJson(new BlockLootTableJson("gamma173:agwah", t)));
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
    }

}

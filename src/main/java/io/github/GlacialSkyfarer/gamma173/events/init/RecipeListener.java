package io.github.GlacialSkyfarer.gamma173.events.init;

import io.github.DanyGames2014.CraftingHelper;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;

public class RecipeListener {

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

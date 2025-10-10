package io.github.recipe;

import net.glasslauncher.mods.alwaysmoreitems.util.AlwaysMoreItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public abstract class AnvilRecipeHandler {

    private static List<AnvilRecipe> recipeList = new ArrayList<>();

    public static ItemStack getItem(Item source, Item material) {
        for (AnvilRecipe recipe : recipeList) {
            if (recipe.checkRecipe(source, material)) {
                return recipe.result;
            }
        }
        return null;
    }

    public static void register(AnvilRecipe recipe) {
        recipeList.add(recipe);
        //Add to AlwaysMoreItems
    }

}

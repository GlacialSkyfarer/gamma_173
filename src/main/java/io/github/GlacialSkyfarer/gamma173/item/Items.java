package io.github.GlacialSkyfarer.gamma173.item;

import io.github.GlacialSkyfarer.gamma173.Gamma173;
import net.minecraft.item.Item;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.template.item.TemplateItem;

public class Items {

    public static Item COPPER_INGOT;

    public static void registerItems(ItemRegistryEvent event) {

        COPPER_INGOT = new TemplateItem(Gamma173.NAMESPACE.id("copper_ingot"))
                .setTranslationKey(Gamma173.NAMESPACE.id("copper_ingot"));

    }

}

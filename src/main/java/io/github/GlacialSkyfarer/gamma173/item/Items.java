package io.github.GlacialSkyfarer.gamma173.item;

import io.github.GlacialSkyfarer.gamma173.Gamma173;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.item.tool.ToolLevel;
import net.modificationstation.stationapi.api.item.tool.ToolMaterialFactory;
import net.modificationstation.stationapi.api.template.item.*;

public class Items {

    public static Item COPPER_INGOT,

        ROSE_GOLD_SWORD,
        ROSE_GOLD_PICKAXE,
        ROSE_GOLD_AXE,
        ROSE_GOLD_SHOVEL,
        ROSE_GOLD_HOE,

        ROSE_GOLD_HELMET,
        ROSE_GOLD_CHESTPLATE,
        ROSE_GOLD_LEGGINGS,
        ROSE_GOLD_BOOTS;

    public static final ToolMaterial ROSE_GOLD_MATERIAL = ToolMaterialFactory.create(
            "rose_gold",
            2,
            761,
            7.0f,
            2
    ).toolLevel(ToolLevel.getNumeric(2));

    public static void registerItems(ItemRegistryEvent event) {


        Gamma173.LOGGER.info(ROSE_GOLD_MATERIAL.getMiningLevel());

        COPPER_INGOT = new TemplateItem(Gamma173.NAMESPACE.id("copper_ingot"))
                .setTranslationKey(Gamma173.NAMESPACE.id("copper_ingot"));

        ROSE_GOLD_SWORD = new TemplateSwordItem(Gamma173.NAMESPACE.id("rose_gold_sword"), ROSE_GOLD_MATERIAL)
                .setTranslationKey(Gamma173.NAMESPACE.id("rose_gold_sword"));
        ROSE_GOLD_PICKAXE = new TemplatePickaxeItem(Gamma173.NAMESPACE.id("rose_gold_pickaxe"), ROSE_GOLD_MATERIAL)
                .setTranslationKey(Gamma173.NAMESPACE.id("rose_gold_pickaxe"));
        ROSE_GOLD_AXE = new TemplateAxeItem(Gamma173.NAMESPACE.id("rose_gold_axe"), ROSE_GOLD_MATERIAL)
                .setTranslationKey(Gamma173.NAMESPACE.id("rose_gold_axe"));
        ROSE_GOLD_SHOVEL = new TemplateShovelItem(Gamma173.NAMESPACE.id("rose_gold_shovel"), ROSE_GOLD_MATERIAL)
                .setTranslationKey(Gamma173.NAMESPACE.id("rose_gold_shovel"));
        ROSE_GOLD_HOE = new TemplateHoeItem(Gamma173.NAMESPACE.id("rose_gold_hoe"), ROSE_GOLD_MATERIAL)
                .setTranslationKey(Gamma173.NAMESPACE.id("rose_gold_hoe"));

        ROSE_GOLD_HELMET = new GammaArmorItem(Gamma173.NAMESPACE.id("rose_gold_helmet"), 20, 0, "rose_gold")
                .setTranslationKey(Gamma173.NAMESPACE.id("rose_gold_helmet"));
        ROSE_GOLD_CHESTPLATE = new GammaArmorItem(Gamma173.NAMESPACE.id("rose_gold_chestplate"), 20, 1, "rose_gold")
                .setTranslationKey(Gamma173.NAMESPACE.id("rose_gold_chestplate"));
        ROSE_GOLD_LEGGINGS = new GammaArmorItem(Gamma173.NAMESPACE.id("rose_gold_leggings"), 20, 2, "rose_gold")
                .setTranslationKey(Gamma173.NAMESPACE.id("rose_gold_leggings"));
        ROSE_GOLD_BOOTS = new GammaArmorItem(Gamma173.NAMESPACE.id("rose_gold_boots"), 20, 3, "rose_gold")
                .setTranslationKey(Gamma173.NAMESPACE.id("rose_gold_boots"));

    }

}

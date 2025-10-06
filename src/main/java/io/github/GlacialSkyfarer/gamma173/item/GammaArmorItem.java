package io.github.GlacialSkyfarer.gamma173.item;

import io.github.GlacialSkyfarer.gamma173.Gamma173;
import net.minecraft.item.ArmorItem;
import net.modificationstation.stationapi.api.client.item.ArmorTextureProvider;
import net.modificationstation.stationapi.api.template.item.TemplateArmorItem;
import net.modificationstation.stationapi.api.util.Identifier;

public class GammaArmorItem extends TemplateArmorItem implements ArmorTextureProvider {

    private final String name;

    public GammaArmorItem(Identifier identifier, int durability, int slot, String name) {
        super(identifier, 0, 0, slot);
        this.setMaxDamage(durability * ArmorItem.DURABILITY_BY_SLOT[slot]);
        this.name = name;
    }

    @Override
    public Identifier getTexture(ArmorItem armorItem) {
        return Gamma173.NAMESPACE.id(name);
    }
}

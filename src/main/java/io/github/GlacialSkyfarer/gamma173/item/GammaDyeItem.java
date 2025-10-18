package io.github.GlacialSkyfarer.gamma173.item;

import io.github.GlacialSkyfarer.gamma173.interfaces.IDyeableEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.DyeItem;
import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.template.item.TemplateItem;
import net.modificationstation.stationapi.api.util.Identifier;

public class GammaDyeItem extends TemplateItem {

    protected final int colorId;

    public GammaDyeItem(Identifier identifier, int color) {
        super(identifier);
        this.colorId = color;
    }

    public int getColorId() {
        return colorId;
    }
    public String getColorName() {
        return DyeItem.names[colorId];
    }
    public int getColor() {
        return DyeItem.colors[colorId];
    }

    @Override
    public void useOnEntity(ItemStack stack, LivingEntity entity) {
        super.useOnEntity(stack, entity);
        if (entity instanceof IDyeableEntity dyeable) {
            dyeable.gamma173$setColor(stack, entity);
        }
    }
}

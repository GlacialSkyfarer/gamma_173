package io.github.GlacialSkyfarer.gamma173.interfaces;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

public interface IDyeableEntity {
    default void gamma173$setColor(ItemStack stack, LivingEntity entity) {}
    default int gamma173$getColor() { return 0; }
}

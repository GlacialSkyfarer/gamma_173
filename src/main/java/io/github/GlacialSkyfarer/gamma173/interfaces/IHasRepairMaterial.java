package io.github.GlacialSkyfarer.gamma173.interfaces;

import net.minecraft.item.Item;

public interface IHasRepairMaterial {

    default Item gamma_173$getRepairMaterial() { return null; }
    default Item gamma_173$setRepairMaterial(Item material) {return null;}

}

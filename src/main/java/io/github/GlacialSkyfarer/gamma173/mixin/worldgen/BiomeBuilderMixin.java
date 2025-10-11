package io.github.GlacialSkyfarer.gamma173.mixin.worldgen;

import io.github.GlacialSkyfarer.gamma173.feature.Features;
import net.modificationstation.stationapi.api.worldgen.biome.BiomeBuilder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BiomeBuilder.class)
public class BiomeBuilderMixin {

    @Inject(method="overworldOres", at=@At("RETURN"))
    private void addCopperOre(CallbackInfoReturnable<BiomeBuilder> cir) {
        ((BiomeBuilder)(Object)this).feature(Features.COPPER_ORE_SCATTERED);
    }

}

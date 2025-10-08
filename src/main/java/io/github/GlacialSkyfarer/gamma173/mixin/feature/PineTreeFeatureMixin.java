package io.github.GlacialSkyfarer.gamma173.mixin.feature;

import io.github.GlacialSkyfarer.gamma173.block.Blocks;
import net.minecraft.world.gen.feature.PineTreeFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(PineTreeFeature.class)
public abstract class PineTreeFeatureMixin {

    @ModifyArg(method = "generate", at = @At(value="INVOKE", target="Lnet/minecraft/world/World;setBlockWithoutNotifyingNeighbors(IIIII)Z", ordinal=1), index=3)
    public int swapSpruceLogId(int x) {

        return Blocks.SPRUCE_LOG.id;

    }

}

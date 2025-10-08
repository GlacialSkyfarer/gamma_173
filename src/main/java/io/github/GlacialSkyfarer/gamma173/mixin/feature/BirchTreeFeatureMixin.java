package io.github.GlacialSkyfarer.gamma173.mixin.feature;

import io.github.GlacialSkyfarer.gamma173.block.Blocks;
import net.minecraft.world.gen.feature.BirchTreeFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(BirchTreeFeature.class)
public abstract class BirchTreeFeatureMixin {

    @ModifyArg(method = "generate", at = @At(value="INVOKE", target="Lnet/minecraft/world/World;setBlockWithoutNotifyingNeighbors(IIIII)Z", ordinal=1), index=3)
    public int swapBirchLogId(int x) {

        return Blocks.BIRCH_LOG.id;

    }

}

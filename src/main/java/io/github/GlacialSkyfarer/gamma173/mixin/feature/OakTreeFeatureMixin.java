package io.github.GlacialSkyfarer.gamma173.mixin.feature;

import io.github.GlacialSkyfarer.gamma173.block.Blocks;
import net.minecraft.world.gen.feature.OakTreeFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(OakTreeFeature.class)
public abstract class OakTreeFeatureMixin {

    @ModifyArg(method = "generate", at = @At(value="INVOKE", target="Lnet/minecraft/world/World;setBlockWithoutNotifyingNeighbors(IIII)Z", ordinal=2), index=3)
    public int swapOakLogId(int x) {

        return Blocks.OAK_LOG.id;

    }

}

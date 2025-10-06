package io.github.GlacialSkyfarer.gamma173.block;

import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;

public class GammaLeavesBlock extends TemplateBlock {

    protected float decayFactor = 0.2f;

    public GammaLeavesBlock(Identifier identifier, Material material) {
        super(identifier, material);
    }

    public GammaLeavesBlock setDecayFactor(float value) { this.decayFactor = value; return this; }



}

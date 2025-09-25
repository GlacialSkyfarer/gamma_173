package io.github.GlacialSkyfarer.gamma173.block;

import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;

public class TemplateLeavesBlock extends TemplateBlockWithLootTable {

    protected float decayFactor = 0.2f;

    public TemplateLeavesBlock(Identifier identifier, Material material) {
        super(identifier, material);
    }

    public TemplateLeavesBlock setDecayFactor(float value) { this.decayFactor = value; return this; }



}

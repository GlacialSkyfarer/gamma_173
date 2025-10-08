package io.github.GlacialSkyfarer.gamma173.mixin.block;

import io.github.GlacialSkyfarer.gamma173.interfaces.IGetSetBlockLootTable;
import io.github.GlacialSkyfarer.gamma173.loot_table.BlockLootTable;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(Block.class)
public class BlockMixin implements IGetSetBlockLootTable {

    @Unique
    public BlockLootTable lootTable;

    @Override
    public Block gamma_173$setLootTable(BlockLootTable table) {
        this.lootTable = table;
        return ((Block)(Object)this);
    }

    public BlockLootTable gamma_173$getLootTable() {
        return lootTable;
    }

    @ModifyArg(method="<clinit>", at=@At(value="INVOKE", target="net/minecraft/block/ObsidianBlock.setHardness (F)Lnet/minecraft/block/Block;"), index = 0)
    private static float overrideObsidianHardness(float original) {

        return 40.0f;

    }

}

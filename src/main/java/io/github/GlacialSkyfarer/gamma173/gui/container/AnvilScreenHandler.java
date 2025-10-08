package io.github.GlacialSkyfarer.gamma173.gui.container;

import io.github.GlacialSkyfarer.gamma173.Util;
import io.github.GlacialSkyfarer.gamma173.block.entity.AnvilBlockEntity;
import io.github.GlacialSkyfarer.gamma173.gui.slot.AnvilOutputSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class AnvilScreenHandler extends ScreenHandler {

    private AnvilBlockEntity anvil;

    public AnvilScreenHandler(PlayerEntity player, AnvilBlockEntity anvil) {

        this.anvil = anvil;

        this.addSlot(new Slot(anvil, 0, 56, 17));
        this.addSlot(new Slot(anvil, 1, 56, 53));
        this.addSlot(new AnvilOutputSlot(player, anvil, 2, 116, 35));

        Util.addPlayerInventory(this, player.inventory);

    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return anvil.canPlayerUse(player);
    }

}

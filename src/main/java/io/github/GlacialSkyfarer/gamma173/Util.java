package io.github.GlacialSkyfarer.gamma173;

import net.minecraft.entity.player.PlayerEntity;
import net.modificationstation.stationapi.api.item.ItemUsageContext;

public class Util {

    public static boolean isPlayerLookingAtTopHalfOfBlock(PlayerEntity player, int y) {

        return player.raycast(5.0, 1f).pos.y >= y + 0.5;

    }

}

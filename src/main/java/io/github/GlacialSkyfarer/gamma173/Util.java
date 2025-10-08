package io.github.GlacialSkyfarer.gamma173;

import net.minecraft.entity.player.PlayerEntity;

public abstract class Util {

    public static boolean isPlayerLookingAtTopHalfOfBlock(PlayerEntity player, int y) {

        return player.raycast(5.0, 1f).pos.y >= y + 0.5;

    }

    public static String[] separateLines(String string, String prefix, String suffix) {
        String[] result = string.split("\n");

        for (int i = 0; i < result.length; i++) {

            result[i] = prefix + result[i] + suffix;

        }

        return result;
    }

}

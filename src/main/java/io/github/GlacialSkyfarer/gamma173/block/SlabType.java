package io.github.GlacialSkyfarer.gamma173.block;

import net.modificationstation.stationapi.api.util.StringIdentifiable;

public enum SlabType implements StringIdentifiable {

    BOTTOM,
    TOP,
    DOUBLE;

    @Override
    public String asString() {
        return switch (this) {
            case BOTTOM -> "bottom";
            case TOP -> "top";
            case DOUBLE -> "double";
        };
    }
}

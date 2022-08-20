package earth.terrarium.chipped.common.defaults;

import earth.terrarium.chipped.api.BlockType;
import earth.terrarium.chipped.api.PaletteEntry;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public enum ColoredTypes implements BlockType {
    ;

    @Override
    public String translationKey() {
        return null;
    }

    @Override
    public Function<PaletteEntry, BlockBehaviour.Properties> properties() {
        return null;
    }

    @Override
    public String id() {
        return null;
    }
}

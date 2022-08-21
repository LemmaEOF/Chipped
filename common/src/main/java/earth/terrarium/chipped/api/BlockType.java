package earth.terrarium.chipped.api;

import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public interface BlockType {
    String translationKey();
    Function<PaletteEntry, BlockBehaviour.Properties> properties();
    String id();
}

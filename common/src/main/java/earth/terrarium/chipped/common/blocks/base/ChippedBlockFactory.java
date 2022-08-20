package earth.terrarium.chipped.common.blocks.base;

import earth.terrarium.chipped.api.BlockType;
import earth.terrarium.chipped.api.PaletteEntry;
import net.minecraft.world.level.block.Block;

@FunctionalInterface
public interface ChippedBlockFactory<T extends Block> {
    T create(BlockType block, PaletteEntry palette);
}

package earth.terrarium.chipped.common.blocks;

import earth.terrarium.chipped.api.BlockType;
import earth.terrarium.chipped.api.PaletteEntry;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.level.block.Block;

public class ChippedBlock extends Block {
    private final BlockType type;
    private final PaletteEntry paletteEntry;

    public ChippedBlock(BlockType type, PaletteEntry entry) {
        super(type.properties().apply(entry));
        this.type = type;
        this.paletteEntry = entry;
    }

    @Override
    public MutableComponent getName() {
        return Component.translatable(type.translationKey(), paletteEntry.displayName());
    }
}

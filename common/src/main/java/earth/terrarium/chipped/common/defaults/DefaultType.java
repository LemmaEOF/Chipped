package earth.terrarium.chipped.common.defaults;

import earth.terrarium.chipped.Chipped;
import earth.terrarium.chipped.api.BlockType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public enum DefaultType implements BlockType {
    STONE("stone", BlockBehaviour.Properties.copy(Blocks.STONE)),
    ANDESITE("andesite", BlockBehaviour.Properties.copy(Blocks.ANDESITE)),
    GRANITE("granite", BlockBehaviour.Properties.copy(Blocks.GRANITE))

    ;

    private final String id;
    private final BlockBehaviour.Properties properties;

    DefaultType(String id, BlockBehaviour.Properties properties) {
        this.id = id;
        this.properties = properties;
    }

    @Override
    public String translationKey() {
        return String.join(".", "block_type", Chipped.MOD_ID, id);
    }

    @Override
    public BlockBehaviour.Properties properties() {
        return properties;
    }

    @Override
    public String id() {
        return id;
    }
}

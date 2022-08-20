package earth.terrarium.chipped.api;

import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public interface BlockType {
    String translationKey();
    BlockBehaviour.Properties properties();
    String id();
}

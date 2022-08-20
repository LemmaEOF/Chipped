package earth.terrarium.chipped.common.registry.fabric;

import earth.terrarium.chipped.common.registry.ChippedBlockEntities;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ChippedBlockEntitiesImpl {

    public static <E extends BlockEntity> BlockEntityType<E> createBlockEntityType(ChippedBlockEntities.BlockEntityFactory<E> factory, Block... blocks) {
        return BlockEntityType.Builder.of(factory::create, blocks).build(null);
    }
}

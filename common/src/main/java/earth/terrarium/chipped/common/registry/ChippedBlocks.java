package earth.terrarium.chipped.common.registry;

import dev.architectury.injectables.annotations.ExpectPlatform;
import earth.terrarium.chipped.api.BlockType;
import earth.terrarium.chipped.api.PaletteType;
import earth.terrarium.chipped.common.blocks.ChippedBlock;
import earth.terrarium.chipped.common.blocks.base.ChippedBlockFactory;
import earth.terrarium.chipped.common.defaults.DefaultPalette;
import earth.terrarium.chipped.common.defaults.DefaultType;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

public class ChippedBlocks {

    public static void register() {
        registerBlockWithPalette(DefaultType.STONE, DefaultPalette.STONE, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.ANDESITE, DefaultPalette.STONE, ChippedBlock::new);
    }

    public static <T extends Block>  void registerBlockWithPalette(BlockType block, PaletteType palette, ChippedBlockFactory<T> factory) {
        registerBlockWithPalette(block, palette, factory, Set.of());
    }

    public static <T extends Block> void registerBlockWithPalette(BlockType block, PaletteType palette, ChippedBlockFactory<T> factory, Set<String> blacklisted) {
        for (int i = 0; i < palette.palette().size(); i++) {
            final var paletteEntry = palette.palette().get(i);
            if(blacklisted.contains(paletteEntry.id())) continue;
            registerBlockWithItem(String.format("%s/%d", block.id(), i), () -> factory.create(block, paletteEntry));
        }
    }

    public static <T extends Block> Supplier<T> registerBlockWithItem(String id, Supplier<T> block) {
        var tempBlock = RegistryHandlerOfChipped.register(Registry.BLOCK, id, block);
        RegistryHandlerOfChipped.register(Registry.ITEM, id, () -> new BlockItem(tempBlock.get(), new Item.Properties()));
        return tempBlock;
    }
}

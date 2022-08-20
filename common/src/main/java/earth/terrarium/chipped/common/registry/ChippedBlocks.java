package earth.terrarium.chipped.common.registry;

import earth.terrarium.chipped.api.BlockType;
import earth.terrarium.chipped.api.PaletteEntry;
import earth.terrarium.chipped.api.PaletteType;
import earth.terrarium.chipped.common.blocks.ChippedBlock;
import earth.terrarium.chipped.common.blocks.base.ChippedBlockFactory;
import earth.terrarium.chipped.common.defaults.ColoredPalette;
import earth.terrarium.chipped.common.defaults.DefaultPalette;
import earth.terrarium.chipped.common.defaults.DefaultType;
import earth.terrarium.chipped.common.items.ChippedBlockItem;
import earth.terrarium.chipped.common.utils.ModUtils;
import net.minecraft.core.Registry;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ChippedBlocks {

    public static void register() {
        registerBlockWithPalette(DefaultType.STONE, DefaultPalette.STONE, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.ANDESITE, DefaultPalette.STONE, ChippedBlock::new);
    }

    public static <T extends Block>  void registerBlockWithPalette(BlockType block, PaletteType palette, ChippedBlockFactory<T> factory) {
        registerBlockWithPalette(block, palette, factory, Set.of());
    }

    public static <T extends Block> void registerBlockWithPalette(BlockType block, PaletteType palette, ChippedBlockFactory<T> factory, Set<String> blacklisted) {
        ModUtils.forIEach(palette.palette(), (entry, i) -> {
            if(!blacklisted.contains(entry.id())) {
                String id = String.format("%s/%d", block.id(), i);
                var tempBlock = RegistryHandlerOfChipped.register(Registry.BLOCK, id, () -> factory.create(block, entry));
                RegistryHandlerOfChipped.register(Registry.ITEM, id, () -> new ChippedBlockItem(palette, tempBlock.get(), new Item.Properties()));
            }
        });
    }

    public static <T extends Block> void registerColoredBlocks(BlockType block, PaletteType palette, ChippedBlockFactory<T> factory) {
        for (DyeColor value : DyeColor.values()) {
            registerBlockWithPalette(block, ColoredPalette.of(value, palette), factory);
        }
    }

    private static <T extends Block> void registerColoredBlock(BlockType block, ColoredPalette palette, DyeColor color, ChippedBlockFactory<T> factory) {
        ModUtils.forIEach(palette.palette(), (entry, i) -> {
            String id = String.format("%s/%d/%s", block.id(), i, color.getName());
            var tempBlock = RegistryHandlerOfChipped.register(Registry.BLOCK, id, () -> factory.create(block, entry));
            RegistryHandlerOfChipped.register(Registry.ITEM, id, () -> new ChippedBlockItem(palette, tempBlock.get(), new Item.Properties()));
        });
    }
}

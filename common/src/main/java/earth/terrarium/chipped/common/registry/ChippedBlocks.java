package earth.terrarium.chipped.common.registry;

import earth.terrarium.chipped.api.BlockType;
import earth.terrarium.chipped.api.PaletteType;
import earth.terrarium.chipped.common.blocks.BlockHelper;
import earth.terrarium.chipped.common.blocks.ChippedBlock;
import earth.terrarium.chipped.common.blocks.base.ChippedBlockFactory;
import earth.terrarium.chipped.common.defaults.ColoredPalette;
import earth.terrarium.chipped.common.defaults.ColoredTypes;
import earth.terrarium.chipped.common.defaults.DefaultPalette;
import earth.terrarium.chipped.common.defaults.DefaultType;
import earth.terrarium.chipped.common.items.ChippedBlockItem;
import earth.terrarium.chipped.common.utils.ModUtils;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ChippedBlocks {

    public static void register() {
        registerBlockWithPalette(DefaultType.ACACIA_LEAVES, DefaultPalette.TEST, BlockHelper::createLeaves);
        registerBlockWithPalette(DefaultType.BIRCH_LEAVES, DefaultPalette.TEST, BlockHelper::createLeaves);
        registerBlockWithPalette(DefaultType.DARK_OAK_LEAVES, DefaultPalette.TEST, BlockHelper::createLeaves);
        registerBlockWithPalette(DefaultType.JUNGLE_LEAVES, DefaultPalette.TEST, BlockHelper::createLeaves);
        registerBlockWithPalette(DefaultType.OAK_LEAVES, DefaultPalette.TEST, BlockHelper::createLeaves);

        registerBlockWithPalette(DefaultType.ACACIA_PLANKS, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.BIRCH_PLANKS, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.CRIMSON_PLANKS, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.JUNGLE_PLANKS, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.OAK_PLANKS, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.SPRUCE_PLANKS, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.WARPED_PLANKS, DefaultPalette.TEST, ChippedBlock::new);

        //Region Metal
        registerBlockWithPalette(DefaultType.COPPER_BLOCK, DefaultPalette.METAL, ChippedBlock::new, "panels", "plated");
        registerBlockWithPalette(DefaultType.COPPER_EXPOSED_BLOCK, DefaultPalette.METAL, ChippedBlock::new, "panels", "plated");
        registerBlockWithPalette(DefaultType.COPPER_OXIDIZED_BLOCK, DefaultPalette.METAL, ChippedBlock::new, "panels", "plated");
        registerBlockWithPalette(DefaultType.COPPER_WEATHERED_BLOCK, DefaultPalette.METAL, ChippedBlock::new, "panels", "plated");

        registerBlockWithPalette(DefaultType.DIAMOND_BLOCK, DefaultPalette.METAL, ChippedBlock::new, "polished");
        registerBlockWithPalette(DefaultType.EMERALD_BLOCK, DefaultPalette.METAL, ChippedBlock::new, "pressed");
        registerBlockWithPalette(DefaultType.GOLD_BLOCK, DefaultPalette.METAL, ChippedBlock::new, "polished");
        registerBlockWithPalette(DefaultType.IRON_BLOCK, DefaultPalette.METAL, ChippedBlock::new, "embossed");
        registerBlockWithPalette(DefaultType.NETHERITE_BLOCK, DefaultPalette.METAL, ChippedBlock::new, "ancient");
        //endregion

        //region Stone
        registerBlockWithPalette(DefaultType.STONE, DefaultPalette.STONE, ChippedBlock::new);
        //endregion

        registerBlockWithPalette(DefaultType.AMETHYST_BLOCK, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.ANCIENT_DEBRIS, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.ANDESITE, DefaultPalette.TEST, ChippedBlock::new);
        //registerBlockWithPalette(DefaultType.BARREL, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.BASALT, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.BLACKSTONE, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.BLUE_ICE, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.BOOKSHELF, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.BRICKS, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.BROWN_MUSHROOM, DefaultPalette.TEST, BlockHelper.createMushroom(() -> TreeFeatures.HUGE_BROWN_MUSHROOM));
        registerBlockWithPalette(DefaultType.BROWN_MUSHROOM_BLOCK, DefaultPalette.TEST, BlockHelper::createHugeMushroom);
        registerBlockWithPalette(DefaultType.CALCITE, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.CLAY, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.COAL_BLOCK, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.COBBLESTONE, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.COBWEB, DefaultPalette.TEST, BlockHelper::createWeb);
        registerBlockWithPalette(DefaultType.CRIMSON_FUNGUS, DefaultPalette.TEST, BlockHelper.createMushroom(() -> TreeFeatures.CRIMSON_FUNGUS));
        registerBlockWithPalette(DefaultType.CRIMSON_ROOTS, DefaultPalette.TEST, BlockHelper::createRoots);
        registerBlockWithPalette(DefaultType.CRYING_OBSIDIAN, DefaultPalette.TEST, BlockHelper::createCryingObsidian);
        registerBlockWithPalette(DefaultType.DARK_PRISMARINE, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.DEEPSLATE, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.DIORITE, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.DIRT, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.DRIED_KELP_BLOCK, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.DRIPSTONE_BLOCK, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.END_STONE, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.GILDED_BLACKSTONE, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.GLASS, DefaultPalette.TEST, BlockHelper::createGlass);
        registerBlockWithPalette(DefaultType.GLASS_PANE, DefaultPalette.TEST, BlockHelper::createPane);
        registerBlockWithPalette(DefaultType.GLOWSTONE, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.GRANITE, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.GRAVEL, DefaultPalette.TEST, BlockHelper::createGravel);
        registerBlockWithPalette(DefaultType.HAY_BLOCK, DefaultPalette.TEST, BlockHelper::createHayBale);
        registerBlockWithPalette(DefaultType.ICE, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.LANTERN, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.LAPIS_BLOCK, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.LILY_PAD, DefaultPalette.TEST, BlockHelper::createWaterLily);
        registerBlockWithPalette(DefaultType.LODESTONE, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.MAGMA_BLOCK, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.MELON, DefaultPalette.TEST, BlockHelper::createMelon);
        registerBlockWithPalette(DefaultType.MOSSY_COBBLESTONE, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.MOSSY_STONE_BRICKS, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.NETHER_BRICKS, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.NETHER_SPROUTS, DefaultPalette.TEST, BlockHelper::createNetherSprouts);
        registerBlockWithPalette(DefaultType.NETHER_WART_BLOCK, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.NETHERRACK, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.OBSIDIAN, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.PACKED_ICE, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.PURPUR_BLOCK, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.QUARTZ_BLOCK, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.RAW_COPPER_BLOCK, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.RAW_GOLD_BLOCK, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.RAW_IRON_BLOCK, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.RED_MUSHROOM, DefaultPalette.TEST, BlockHelper.createMushroom(() -> TreeFeatures.HUGE_RED_MUSHROOM));
        registerBlockWithPalette(DefaultType.RED_MUSHROOM_BLOCK, DefaultPalette.TEST, BlockHelper::createHugeMushroom);
        registerBlockWithPalette(DefaultType.RED_NETHER_BRICK, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.RED_SANDSTONE, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.REDSTONE_BLOCK, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.REDSTONE_LAMP, DefaultPalette.TEST, BlockHelper::createRedstoneLamp);
        //registerBlockWithPalette(DefaultType.REDSTONE_TORCH, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.SAND, DefaultPalette.TEST, BlockHelper::createSand);
        registerBlockWithPalette(DefaultType.SANDSTONE, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.SEA_LANTERN, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.SHROOMLIGHT, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.SMOOTH_STONE, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.SNOW_BLOCK, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.SOUL_SAND, DefaultPalette.TEST, BlockHelper::createSoulSand);
        registerBlockWithPalette(DefaultType.SPRUCE_LEAVES, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.TERRACOTTA, DefaultPalette.TEST, ChippedBlock::new);
        //registerBlockWithPalette(DefaultType.TORCH, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.TUFF, DefaultPalette.TEST, ChippedBlock::new);
        registerBlockWithPalette(DefaultType.VINE, DefaultPalette.TEST, BlockHelper::createVine);
        registerBlockWithPalette(DefaultType.WARPED_FUNGUS, DefaultPalette.TEST, BlockHelper.createMushroom(() -> TreeFeatures.WARPED_FUNGUS));
        registerBlockWithPalette(DefaultType.WARPED_ROOTS, DefaultPalette.TEST, BlockHelper::createRoots);
        registerBlockWithPalette(DefaultType.WARPED_WART_BLOCK, DefaultPalette.TEST, ChippedBlock::new);

        registerColoredBlocks(ColoredTypes.CARPET, DefaultPalette.TEST, BlockHelper::createCarpet);
    }

    public static <T extends Block>  void registerBlockWithPalette(BlockType block, PaletteType palette, ChippedBlockFactory<T> factory) {
        registerBlockWithPalette(block, palette, factory, Set.of());
    }

    public static <T extends Block>  void registerBlockWithPalette(BlockType block, PaletteType palette, ChippedBlockFactory<T> factory, String... blacklisted) {
        registerBlockWithPalette(block, palette, factory, Set.of(blacklisted));
    }

    public static <T extends Block> void registerBlockWithPalette(BlockType block, PaletteType palette, ChippedBlockFactory<T> factory, Set<String> blacklisted) {
        ModUtils.forIEach(palette.palette(), (entry, i) -> {
            if(!blacklisted.contains(entry.id())) {
                String id = String.format("%s/%d", block.id(), i);
                var tempBlock = RegistryHelper.register(Registry.BLOCK, id, () -> factory.create(block, entry));
                RegistryHelper.register(Registry.ITEM, id, () -> new ChippedBlockItem(palette, tempBlock.get(), new Item.Properties()));
            }
        });
    }

    public static <T extends Block> void registerColoredBlocks(BlockType block, PaletteType palette, ChippedBlockFactory<T> factory) {
        for (DyeColor value : DyeColor.values()) {
            registerColoredBlock(block, ColoredPalette.of(value, palette), value, factory);
        }
    }

    private static <T extends Block> void registerColoredBlock(BlockType block, ColoredPalette palette, DyeColor color, ChippedBlockFactory<T> factory) {
        ModUtils.forIEach(palette.palette(), (entry, i) -> {
            String id = String.format("%s/%d/%s", block.id(), i, color.getName());
            var tempBlock = RegistryHelper.register(Registry.BLOCK, id, () -> factory.create(block, entry));
            RegistryHelper.register(Registry.ITEM, id, () -> new ChippedBlockItem(palette, tempBlock.get(), new Item.Properties()));
        });
    }
}

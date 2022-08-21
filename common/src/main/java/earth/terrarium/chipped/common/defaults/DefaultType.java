package earth.terrarium.chipped.common.defaults;

import earth.terrarium.chipped.Chipped;
import earth.terrarium.chipped.api.BlockType;
import earth.terrarium.chipped.api.PaletteEntry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.Locale;
import java.util.function.Function;

public enum DefaultType implements BlockType {
    ACACIA_LEAVES(Blocks.ACACIA_LEAVES),
    ACACIA_PLANKS(Blocks.ACACIA_PLANKS),
    AMETHYST_BLOCK(Blocks.AMETHYST_BLOCK),
    ANCIENT_DEBRIS(Blocks.ANCIENT_DEBRIS),
    ANDESITE(Blocks.ANDESITE),
    BARREL(Blocks.BARREL),
    BASALT(Blocks.BASALT),
    BIRCH_LEAVES(Blocks.BIRCH_LEAVES),
    BIRCH_PLANKS(Blocks.BIRCH_PLANKS),
    BLACK_WOOL(Blocks.BLACK_WOOL),
    BLACKSTONE(Blocks.BLACKSTONE),
    BLUE_ICE(Blocks.BLUE_ICE),
    BOOKSHELF(Blocks.BOOKSHELF),
    BRICKS(Blocks.BRICKS),
    BROWN_MUSHROOM(Blocks.BROWN_MUSHROOM),
    BROWN_MUSHROOM_BLOCK(Blocks.BROWN_MUSHROOM_BLOCK),
    CALCITE(Blocks.CALCITE),
    CLAY(Blocks.CLAY),
    COAL_BLOCK(Blocks.COAL_BLOCK),
    COBBLESTONE(Blocks.COBBLESTONE),
    COBWEB(Blocks.COBWEB),

    COPPER_BLOCK(Blocks.COPPER_BLOCK),
    COPPER_EXPOSED_BLOCK(Blocks.EXPOSED_COPPER),
    COPPER_OXIDIZED_BLOCK(Blocks.OXIDIZED_COPPER),
    COPPER_WEATHERED_BLOCK(Blocks.WEATHERED_COPPER),

    CRIMSON_FUNGUS(Blocks.CRIMSON_FUNGUS),
    CRIMSON_PLANKS(Blocks.CRIMSON_PLANKS),
    CRIMSON_ROOTS(Blocks.CRIMSON_ROOTS),
    CRYING_OBSIDIAN(Blocks.CRYING_OBSIDIAN),
    DARK_OAK_LEAVES(Blocks.DARK_OAK_LEAVES),
    DARK_PRISMARINE(Blocks.DARK_PRISMARINE),
    DEEPSLATE(Blocks.DEEPSLATE),
    DIAMOND_BLOCK(Blocks.DIAMOND_BLOCK),
    DIORITE(Blocks.DIORITE),
    DIRT(Blocks.DIRT),
    DRIED_KELP_BLOCK(Blocks.DRIED_KELP_BLOCK),
    DRIPSTONE_BLOCK(Blocks.DRIPSTONE_BLOCK),
    EMERALD_BLOCK(Blocks.EMERALD_BLOCK),
    END_STONE(Blocks.END_STONE),
    GILDED_BLACKSTONE(Blocks.GILDED_BLACKSTONE),
    GLASS(Blocks.GLASS),
    GLASS_PANE(Blocks.GLASS_PANE),
    GLOWSTONE(Blocks.GLOWSTONE),
    GOLD_BLOCK(Blocks.GOLD_BLOCK),
    GRANITE(Blocks.GRANITE),
    GRAVEL(Blocks.GRAVEL),
    HAY_BLOCK(Blocks.HAY_BLOCK),
    ICE(Blocks.ICE),
    IRON_BLOCK(Blocks.IRON_BLOCK),
    JUNGLE_LEAVES(Blocks.JUNGLE_LEAVES),
    JUNGLE_PLANKS(Blocks.JUNGLE_PLANKS),
    LANTERN(Blocks.LANTERN),
    LAPIS_BLOCK(Blocks.LAPIS_BLOCK),
    LILY_PAD(Blocks.LILY_PAD),
    LODESTONE(Blocks.LODESTONE),
    MAGMA_BLOCK(Blocks.MAGMA_BLOCK),
    MELON(Blocks.MELON),
    MOSSY_COBBLESTONE(Blocks.MOSSY_COBBLESTONE),
    MOSSY_STONE_BRICKS(Blocks.MOSSY_STONE_BRICKS),
    NETHER_BRICKS(Blocks.NETHER_BRICKS),
    NETHER_SPROUTS(Blocks.NETHER_SPROUTS),
    NETHER_WART_BLOCK(Blocks.NETHER_WART_BLOCK),
    NETHERITE_BLOCK(Blocks.NETHERITE_BLOCK),
    NETHERRACK(Blocks.NETHERRACK),
    OAK_LEAVES(Blocks.OAK_LEAVES),
    OAK_PLANKS(Blocks.OAK_PLANKS),
    OBSIDIAN(Blocks.OBSIDIAN),
    PACKED_ICE(Blocks.PACKED_ICE),
    PURPUR_BLOCK(Blocks.PURPUR_BLOCK),
    QUARTZ_BLOCK(Blocks.QUARTZ_BLOCK),
    RAW_COPPER_BLOCK(Blocks.RAW_COPPER_BLOCK),
    RAW_GOLD_BLOCK(Blocks.RAW_GOLD_BLOCK),
    RAW_IRON_BLOCK(Blocks.RAW_IRON_BLOCK),
    RED_MUSHROOM(Blocks.RED_MUSHROOM),
    RED_MUSHROOM_BLOCK(Blocks.RED_MUSHROOM_BLOCK),
    RED_NETHER_BRICK(Blocks.RED_NETHER_BRICKS),
    RED_SANDSTONE(Blocks.RED_SANDSTONE),
    REDSTONE_BLOCK(Blocks.REDSTONE_BLOCK),
    REDSTONE_LAMP(Blocks.REDSTONE_LAMP),
    REDSTONE_TORCH(Blocks.REDSTONE_TORCH),
    SAND(Blocks.SAND),
    SANDSTONE(Blocks.SANDSTONE),
    SEA_LANTERN(Blocks.SEA_LANTERN),
    SHROOMLIGHT(Blocks.SHROOMLIGHT),
    SMOOTH_STONE(Blocks.SMOOTH_STONE),
    SNOW_BLOCK(Blocks.SNOW_BLOCK),
    SOUL_SAND(Blocks.SOUL_SAND),
    SPRUCE_LEAVES(Blocks.SPRUCE_LEAVES),
    SPRUCE_PLANKS(Blocks.SPRUCE_PLANKS),
    STONE(Blocks.STONE),
    TERRACOTTA(Blocks.TERRACOTTA),
    TORCH(Blocks.TORCH),
    TUFF(Blocks.TUFF),
    VINE(Blocks.VINE),
    WARPED_FUNGUS(Blocks.WARPED_FUNGUS),
    WARPED_PLANKS(Blocks.WARPED_PLANKS),
    WARPED_ROOTS(Blocks.WARPED_ROOTS),
    WARPED_WART_BLOCK(Blocks.WARPED_WART_BLOCK),
    ;

    private final String id;
    private final BlockBehaviour.Properties properties;

    DefaultType(String id, BlockBehaviour.Properties properties) {
        this.id = id;
        this.properties = properties;
    }

    DefaultType(Block block) {
        this.id = this.name().toLowerCase(Locale.ROOT);
        this.properties = props(block);
    }

    @Override
    public String translationKey() {
        return String.join(".", "block_type", Chipped.MOD_ID, id);
    }

    @Override
    public Function<PaletteEntry, BlockBehaviour.Properties> properties() {
        return entry -> properties;
    }

    @Override
    public String id() {
        return id;
    }

    public static BlockBehaviour.Properties props(Block block) {
        return BlockBehaviour.Properties.copy(block);
    }
}

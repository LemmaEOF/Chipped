package earth.terrarium.chipped.common.blocks;

import earth.terrarium.chipped.api.BlockType;
import earth.terrarium.chipped.api.DyeableEntry;
import earth.terrarium.chipped.api.PaletteEntry;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.level.block.*;
import org.apache.commons.lang3.NotImplementedException;

public class BlockHelper {

    public static Block createCryingObsidian(BlockType block, PaletteEntry entry) {
        return new CryingObsidianBlock(block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createHayBale(BlockType block, PaletteEntry entry) {
        return new HayBlock(block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createRedstoneLamp(BlockType block, PaletteEntry entry) {
        return new RedstoneLampBlock(block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createCarpet(BlockType block, PaletteEntry entry) {
        return new CarpetBlock(block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createGlass(BlockType block, PaletteEntry entry) {
        return new GlassBlock(block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createIronBars(BlockType block, PaletteEntry entry) {
        return new IronBarsBlock(block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createStainedGlass(BlockType block, PaletteEntry entry) {
        if (!(entry instanceof DyeableEntry dyeable)) throw new IllegalArgumentException("Stained Glass entry is not dyeable");
        return new StainedGlassBlock(dyeable.color(), block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createStainedGlassPane(BlockType block, PaletteEntry entry) {
        if (!(entry instanceof DyeableEntry dyeable)) throw new IllegalArgumentException("Stained Glass entry is not dyeable");
        return new StainedGlassPaneBlock(dyeable.color(), block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createRoots(BlockType block, PaletteEntry entry) {
        return new RootsBlock(block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createNetherSprouts(BlockType block, PaletteEntry entry) {
        return new NetherSproutsBlock(block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createHugeMushroom(BlockType block, PaletteEntry entry) {
        return new HugeMushroomBlock(block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createWeb(BlockType block, PaletteEntry entry) {
        return new WebBlock(block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createVine(BlockType block, PaletteEntry entry) {
        return new VineBlock(block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createGravel(BlockType block, PaletteEntry entry) {
        return new GravelBlock(block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createSand(BlockType block, PaletteEntry entry) {
        return new SandBlock(1, block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createSoulSand(BlockType block, PaletteEntry entry) {
        return new SoulSandBlock(block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createWaterLily(BlockType block, PaletteEntry entry) {
        //TODO Requires custom block item.
        return new WaterlilyBlock(block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createLantern(BlockType block, PaletteEntry entry) {
        return new LanternBlock(block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createAdvancedLantern(BlockType block, PaletteEntry entry) {
        //TODO check entry to determine shape.
        return new LanternBlock(block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createPumpkin(BlockType block, PaletteEntry entry) {
        return new PumpkinBlock(block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createCarvedPumpkin(BlockType block, PaletteEntry entry) {
        return new CarvedPumpkinBlock(block.properties().apply(entry)) {
            @Override
            public MutableComponent getName() {
                return Component.translatable(block.translationKey(), entry.displayName());
            }
        };
    }

    public static Block createTorch(BlockType block, PaletteEntry entry) {
        throw new NotImplementedException("Torches not implemented!");
    }
}

package earth.terrarium.chipped.common.defaults;

import earth.terrarium.chipped.Chipped;
import earth.terrarium.chipped.api.PaletteEntry;
import earth.terrarium.chipped.api.PaletteType;
import earth.terrarium.chipped.common.utils.ComponentUtils;
import net.minecraft.network.chat.Component;

import java.util.Arrays;
import java.util.List;

public enum DefaultPalette implements PaletteType {
    METAL("metal", "ancient", "chipped", "embossed", "engraved", "panels", "layered", "plated", "polished", "pressed", "reinforced", "sheet", "shuttered", "stacked"),
    STONE("stone", "angry", "blank", "bordered", "brick_bordered", "carved", "checkered", "cobbled", "cracked_disordered_bricks", "cracked_flat_tiles", "cracked_bricks", "cracked_carving", "cut_blank", "cut_glad", "cut_column", "duh_carving", "edged_bricks", "engraved", "eroded", "etched", "flat_tiles", "inlaid", "inscribed", "laid_bricks", "loded", "offset_bricks", "overlapping_tiles", "pillar_bricks", "polished", "prismal_remnants", "rough", "rounded_bricks", "runic_carved", "sad_carving", "sanded", "small_bricks", "smooth_inlaid", "smooth_ringed", "smooth_column", "smoothed_double_inlaid", "spider_carving", "spiraled", "stacked_bricks", "thick_inlaid", "tiled_bordered", "tiled", "tiled_column", "tiny_layered_bricks", "tiny_layered_slabs", "tiny_bricks", "tiny_brick_bordered", "trodden", "bricks", "mini_tiles", "scales", "unamused_carving", "vertical_cut", "vertical_disordered_bricks", "weathered"),







    TEST("test", "test"),
    ;

    private final String id;
    private final List<? extends PaletteEntry> entries;

    DefaultPalette(String id, String... palette) {
        this.id = id;
        this.entries = Arrays.stream(palette).map(s -> new DefaultEntry(id, s)).toList();
    }

    @Override
    public List<? extends PaletteEntry> palette() {
        return this.entries;
    }

    @Override
    public Component groupName() {
        return ComponentUtils.makeTranslation("palette", Chipped.MOD_ID, id);
    }

    public static class DefaultEntry implements PaletteEntry {
        private final String paletteName;
        private final String name;

        public DefaultEntry(String paletteName, String entryName) {
            this.paletteName = paletteName;
            this.name = entryName;
        }

        @Override
        public String translationKey() {
            return String.join(".", "palette", Chipped.MOD_ID, paletteName, name);
        }

        @Override
        public String id() {
            return name;
        }
    }
}

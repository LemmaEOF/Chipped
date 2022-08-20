package earth.terrarium.chipped.common.defaults;

import earth.terrarium.chipped.Chipped;
import earth.terrarium.chipped.api.PaletteEntry;
import earth.terrarium.chipped.api.PaletteType;
import earth.terrarium.chipped.common.utils.ComponentUtils;
import net.minecraft.network.chat.Component;

import java.util.Arrays;
import java.util.List;

public enum DefaultPalette implements PaletteType {
    STONE("stone", "happy", "sad", "bricks", "tile", "urmom", "is", "so", "fat", "that", "she", "killed", "the", "sun"),
    TEST("test", "test")
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
        public Component displayName() {
            return ComponentUtils.makeTranslation("palette", Chipped.MOD_ID, paletteName, name);
        }

        @Override
        public String id() {
            return name;
        }
    }
}

package earth.terrarium.chipped.common.defaults;

import earth.terrarium.chipped.api.DyeableEntry;
import earth.terrarium.chipped.api.PaletteEntry;
import earth.terrarium.chipped.api.PaletteType;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.DyeColor;

import java.util.List;

public class ColoredPalette implements PaletteType {

    private final PaletteType type;
    private final List<? extends PaletteEntry> entries;

    public ColoredPalette(DyeColor color, PaletteType type) {
        this.type = type;
        this.entries = type.palette().stream().map(entry -> new ColoredEntry(color, entry)).toList();
    }

    public static ColoredPalette of(DyeColor color, PaletteType type) {
        return new ColoredPalette(color, type);
    }

    @Override
    public List<? extends PaletteEntry> palette() {
        return this.entries;
    }

    @Override
    public Component groupName() {
        return this.type.groupName();
    }

    private record ColoredEntry(DyeColor color, PaletteEntry entry) implements DyeableEntry, PaletteEntry {

        @Override
        public Component displayName() {
            return this.entry.displayName();
        }

        @Override
        public String id() {
            return this.entry.id();
        }
    }
}

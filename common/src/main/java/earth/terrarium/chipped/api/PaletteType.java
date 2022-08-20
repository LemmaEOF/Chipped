package earth.terrarium.chipped.api;

import net.minecraft.network.chat.Component;

import java.util.List;

public interface PaletteType {
    List<? extends PaletteEntry> palette();
    Component groupName();
}

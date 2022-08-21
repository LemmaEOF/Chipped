package earth.terrarium.chipped.common.utils;

import net.minecraft.network.chat.Component;

public class ComponentUtils {

    public static Component makeTranslation(String... strings) {
        return Component.translatable(String.join(".", strings));
    }
}

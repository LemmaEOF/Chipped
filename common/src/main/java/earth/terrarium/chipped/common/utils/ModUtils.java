package earth.terrarium.chipped.common.utils;

import java.util.List;
import java.util.function.BiConsumer;

public class ModUtils {

    public static <T> void forIEach(List<T> list, BiConsumer<T, Integer> consumer) {
        for (int i = 0; i < list.size(); i++) {
            consumer.accept(list.get(i), i);
        }
    }
}

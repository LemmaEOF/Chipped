package earth.terrarium.chipped.common.registry;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.core.Registry;
import org.apache.commons.lang3.NotImplementedException;

import java.util.function.Supplier;

public class RegistryHelper {

    @ExpectPlatform
    public static <V, T extends V> Supplier<T> register(Registry<V> registry, String id, Supplier<T> object) {
        throw new NotImplementedException();
    }
}

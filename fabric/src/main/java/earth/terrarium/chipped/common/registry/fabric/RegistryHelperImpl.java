package earth.terrarium.chipped.common.registry.fabric;

import earth.terrarium.chipped.Chipped;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public class RegistryHelperImpl {

    public static <V, T extends V> Supplier<T> register(Registry<V> registry, String id, Supplier<T> object) {
        var register = Registry.register(registry, new ResourceLocation(Chipped.MOD_ID, id), object.get());
        return () -> register;
    }
}

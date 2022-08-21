package earth.terrarium.chipped.common.registry.forge;

import earth.terrarium.chipped.Chipped;
import net.minecraft.core.Registry;
import net.minecraftforge.registries.DeferredRegister;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class RegistryHelperImpl {
    public static final Map<Registry<?>, DeferredRegister<?>> REGISTRIES = new HashMap<>();

    public static <V, T extends V> Supplier<T> register(Registry<V> registry, String id, Supplier<T> object) {
        return getOrCreateRegistry(registry).register(id, object);
    }

    @SuppressWarnings("unchecked")
    public static <T> DeferredRegister<T> getOrCreateRegistry(Registry<T> registry) {
        if(REGISTRIES.containsKey(registry)) return (DeferredRegister<T>) REGISTRIES.get(registry);
        DeferredRegister<T> deferredRegister = DeferredRegister.create(registry.key(), Chipped.MOD_ID);
        REGISTRIES.put(registry, deferredRegister);
        return deferredRegister;
    }
}

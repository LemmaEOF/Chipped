package earth.terrarium.chipped.forge;

import earth.terrarium.chipped.Chipped;
import earth.terrarium.chipped.common.registry.forge.RegistryHandlerOfChippedImpl;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Chipped.MOD_ID)
public class ChippedForge {
    public ChippedForge() {
        Chipped.init();
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        RegistryHandlerOfChippedImpl.REGISTRIES.values().forEach(deferredRegister -> deferredRegister.register(modEventBus));
    }
}
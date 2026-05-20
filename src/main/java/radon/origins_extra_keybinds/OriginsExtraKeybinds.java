package radon.origins_extra_keybinds;

import io.github.apace100.origins.Origins;
import io.github.apace100.origins.OriginsClient;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.lwjgl.glfw.GLFW;

@Mod("origins_extra_keybinds")
public class OriginsExtraKeybinds {
    private static final String[] KEYS = {
            "ternary",
            "quaternary",
            "quinary",
            "senary",
            "septenary",
            "octonary",
            "nonary",
            "denary",
    };

    public OriginsExtraKeybinds() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::clientSetup);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        for (String key : KEYS) {
            KeyBinding mapping = new KeyBinding(
                    String.format("key.origins.%s_active", key),
                    InputMappings.Type.KEYSYM,
                    GLFW.GLFW_KEY_UNKNOWN,
                    String.format("category.%s", Origins.MODID)
            );
            OriginsClient.registerPowerKeybinding(mapping.getName(), mapping);
            OriginsClient.registerPowerKeybinding(key, mapping);
            ClientRegistry.registerKeyBinding(mapping);
        }
    }
}
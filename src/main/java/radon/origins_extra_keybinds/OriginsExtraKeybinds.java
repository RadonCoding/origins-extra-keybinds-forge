package radon.origins_extra_keybinds;

import com.mojang.blaze3d.platform.InputConstants;
import io.github.apace100.apoli.ApoliClient;
import io.github.apace100.origins.Origins;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
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
            KeyMapping mapping = new KeyMapping(
                    String.format("key.origins.%s_active", key),
                    InputConstants.Type.KEYSYM,
                    GLFW.GLFW_KEY_UNKNOWN,
                    String.format("category.%s", Origins.MODID)
            );
            ApoliClient.registerPowerKeybinding(mapping.getName(), mapping);
            ApoliClient.registerPowerKeybinding(key, mapping);
            ClientRegistry.registerKeyBinding(mapping);
        }
    }
}
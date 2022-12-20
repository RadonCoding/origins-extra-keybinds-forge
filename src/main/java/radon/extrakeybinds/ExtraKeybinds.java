package radon.extrakeybinds;

import com.mojang.blaze3d.platform.InputConstants;
import io.github.apace100.apoli.ApoliClient;
import io.github.apace100.origins.Origins;
import io.github.apace100.origins.OriginsClient;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.lwjgl.glfw.GLFW;

@Mod("extrakeybinds")
public class ExtraKeybinds {

	public static KeyMapping useTernaryActivePowerKeybind;
	public static KeyMapping useQuaternaryActivePowerKeybind;
	public static KeyMapping useQuinaryActivePowerKeybind;
	public static KeyMapping useSenaryActivePowerKeybind;
	public static KeyMapping useSeptenaryActivePowerKeybind;
	public static KeyMapping useOctonaryActivePowerKeybind;
	public static KeyMapping useNonaryActivePowerKeybind;
	public static KeyMapping useDenaryActivePowerKeybind;

	public ExtraKeybinds() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onRegisterKeyMappings);
	}

	private void onRegisterKeyMappings(final RegisterKeyMappingsEvent event) {
		useTernaryActivePowerKeybind = new KeyMapping("key.origins.ternary_active", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.ternary_active", useTernaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("ternary", useTernaryActivePowerKeybind);
		event.register(useTernaryActivePowerKeybind);

		useQuaternaryActivePowerKeybind = new KeyMapping("key.origins.quaternary_active", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.quaternary_active", useQuaternaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("quaternary", useQuaternaryActivePowerKeybind);
		event.register(useQuaternaryActivePowerKeybind);

		useQuinaryActivePowerKeybind = new KeyMapping("key.origins.quinary_active", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.quinary_active", useQuinaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("quinary", useQuinaryActivePowerKeybind);
		event.register(useQuinaryActivePowerKeybind);

		useSenaryActivePowerKeybind = new KeyMapping("key.origins.senary_active", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.senary_active", useSenaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("senary", useSenaryActivePowerKeybind);
		event.register(useSenaryActivePowerKeybind);

		useSeptenaryActivePowerKeybind = new KeyMapping("key.origins.septenary_active", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.septenary_active", useSeptenaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("septenary", useSeptenaryActivePowerKeybind);
		event.register(useSeptenaryActivePowerKeybind);

		useOctonaryActivePowerKeybind = new KeyMapping("key.origins.octonary_active", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.octonary_active", useOctonaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("octonary", useOctonaryActivePowerKeybind);
		event.register(useOctonaryActivePowerKeybind);

		useNonaryActivePowerKeybind = new KeyMapping("key.origins.nonary_active", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.nonary_active", useNonaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("nonnary", useNonaryActivePowerKeybind);
		event.register(useNonaryActivePowerKeybind);

		useDenaryActivePowerKeybind = new KeyMapping("key.origins.denary_active", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.denary_active", useDenaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("denary", useDenaryActivePowerKeybind);
		event.register(useDenaryActivePowerKeybind);
	}
}

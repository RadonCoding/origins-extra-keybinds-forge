package radon.extrakeybinds;

import com.mojang.blaze3d.platform.InputConstants;
import io.github.apace100.apoli.ApoliClient;
import io.github.apace100.origins.Origins;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmlclient.registry.ClientRegistry;
import org.lwjgl.glfw.GLFW;

@Mod("extrakeybindes")
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
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);
	}

	private void onClientSetup(final FMLClientSetupEvent event) {
		useTernaryActivePowerKeybind = new KeyMapping("key.origins.ternary_active", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.ternary_active", useTernaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("ternary", useTernaryActivePowerKeybind);
		ClientRegistry.registerKeyBinding(useTernaryActivePowerKeybind);

		useQuaternaryActivePowerKeybind = new KeyMapping("key.origins.quaternary_active", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.quaternary_active", useQuaternaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("quaternary", useQuaternaryActivePowerKeybind);
		ClientRegistry.registerKeyBinding(useQuaternaryActivePowerKeybind);

		useQuinaryActivePowerKeybind = new KeyMapping("key.origins.quinary_active", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.quinary_active", useQuinaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("quinary", useQuinaryActivePowerKeybind);
		ClientRegistry.registerKeyBinding(useQuinaryActivePowerKeybind);

		useSenaryActivePowerKeybind = new KeyMapping("key.origins.senary_active", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.senary_active", useSenaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("senary", useSenaryActivePowerKeybind);
		ClientRegistry.registerKeyBinding(useSenaryActivePowerKeybind);

		useSeptenaryActivePowerKeybind = new KeyMapping("key.origins.septenary_active", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.septenary_active", useSeptenaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("septenary", useSeptenaryActivePowerKeybind);
		ClientRegistry.registerKeyBinding(useSeptenaryActivePowerKeybind);

		useOctonaryActivePowerKeybind = new KeyMapping("key.origins.octonary_active", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.octonary_active", useOctonaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("octonary", useOctonaryActivePowerKeybind);
		ClientRegistry.registerKeyBinding(useOctonaryActivePowerKeybind);

		useNonaryActivePowerKeybind = new KeyMapping("key.origins.nonary_active", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.nonary_active", useNonaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("nonnary", useNonaryActivePowerKeybind);
		ClientRegistry.registerKeyBinding(useNonaryActivePowerKeybind);

		useDenaryActivePowerKeybind = new KeyMapping("key.origins.denary_active", InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		ApoliClient.registerPowerKeybinding("key.origins.denary_active", useDenaryActivePowerKeybind);
		ApoliClient.registerPowerKeybinding("denary", useDenaryActivePowerKeybind);
		ClientRegistry.registerKeyBinding(useDenaryActivePowerKeybind);
	}
}

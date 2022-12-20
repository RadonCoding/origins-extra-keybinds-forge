package radon.extrakeybinds;

import io.github.apace100.origins.Origins;
import io.github.apace100.origins.OriginsClient;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.lwjgl.glfw.GLFW;

@Mod("extrakeybinds2")
public class ExtraKeybinds {

	public static KeyBinding useTernaryActivePowerKeybind;
	public static KeyBinding useQuaternaryActivePowerKeybind;
	public static KeyBinding useQuinaryActivePowerKeybind;
	public static KeyBinding useSenaryActivePowerKeybind;
	public static KeyBinding useSeptenaryActivePowerKeybind;
	public static KeyBinding useOctonaryActivePowerKeybind;
	public static KeyBinding useNonaryActivePowerKeybind;
	public static KeyBinding useDenaryActivePowerKeybind;

	public ExtraKeybinds() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);
	}

	private void onClientSetup(final FMLClientSetupEvent event) {
		useTernaryActivePowerKeybind = new KeyBinding("key.origins.ternary_active", InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		OriginsClient.registerPowerKeybinding("key.origins.ternary_active", useTernaryActivePowerKeybind);
		OriginsClient.registerPowerKeybinding("ternary", useTernaryActivePowerKeybind);
		ClientRegistry.registerKeyBinding(useTernaryActivePowerKeybind);

		useQuaternaryActivePowerKeybind = new KeyBinding("key.origins.quaternary_active", InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		OriginsClient.registerPowerKeybinding("key.origins.quaternary_active", useQuaternaryActivePowerKeybind);
		OriginsClient.registerPowerKeybinding("quaternary", useQuaternaryActivePowerKeybind);
		ClientRegistry.registerKeyBinding(useQuaternaryActivePowerKeybind);

		useQuinaryActivePowerKeybind = new KeyBinding("key.origins.quinary_active", InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		OriginsClient.registerPowerKeybinding("key.origins.quinary_active", useQuinaryActivePowerKeybind);
		OriginsClient.registerPowerKeybinding("quinary", useQuinaryActivePowerKeybind);
		ClientRegistry.registerKeyBinding(useQuinaryActivePowerKeybind);

		useSenaryActivePowerKeybind = new KeyBinding("key.origins.senary_active", InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		OriginsClient.registerPowerKeybinding("key.origins.senary_active", useSenaryActivePowerKeybind);
		OriginsClient.registerPowerKeybinding("senary", useSenaryActivePowerKeybind);
		ClientRegistry.registerKeyBinding(useSenaryActivePowerKeybind);

		useSeptenaryActivePowerKeybind = new KeyBinding("key.origins.septenary_active", InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		OriginsClient.registerPowerKeybinding("key.origins.septenary_active", useSeptenaryActivePowerKeybind);
		OriginsClient.registerPowerKeybinding("septenary", useSeptenaryActivePowerKeybind);
		ClientRegistry.registerKeyBinding(useSeptenaryActivePowerKeybind);

		useOctonaryActivePowerKeybind = new KeyBinding("key.origins.octonary_active", InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		OriginsClient.registerPowerKeybinding("key.origins.octonary_active", useOctonaryActivePowerKeybind);
		OriginsClient.registerPowerKeybinding("octonary", useOctonaryActivePowerKeybind);
		ClientRegistry.registerKeyBinding(useOctonaryActivePowerKeybind);

		useNonaryActivePowerKeybind = new KeyBinding("key.origins.nonary_active", InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		OriginsClient.registerPowerKeybinding("key.origins.nonary_active", useNonaryActivePowerKeybind);
		OriginsClient.registerPowerKeybinding("nonnary", useNonaryActivePowerKeybind);
		ClientRegistry.registerKeyBinding(useNonaryActivePowerKeybind);

		useDenaryActivePowerKeybind = new KeyBinding("key.origins.denary_active", InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "category." + Origins.MODID);
		OriginsClient.registerPowerKeybinding("key.origins.denary_active", useDenaryActivePowerKeybind);
		OriginsClient.registerPowerKeybinding("denary", useDenaryActivePowerKeybind);
		ClientRegistry.registerKeyBinding(useDenaryActivePowerKeybind);
	}
}

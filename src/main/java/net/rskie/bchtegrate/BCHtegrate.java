package net.rskie.bchtegrate;

import net.fabricmc.api.ModInitializer;
import net.rskie.bchtegrate.registry.RegistryInit;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BCHtegrate implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("modid");

    public static final String MOD_ID = "bchtegrate";
    public static final String MOD_NAME = "BCH/SmartBCH Integration";

	@Override
	public void onInitialize() {
        log(Level.INFO, "Mod Initializing");
        RegistryInit.init();
        log(Level.WARN, MOD_NAME+" Enabled!");
	}

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_ID+"] " + message);
    }
}

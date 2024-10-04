package net.superfastscyphozoa.trialbyfire;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrialByFire implements ModInitializer {
	public static final String MOD_ID = "trial-by-fire";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("You have once again entered the world of survival horror. Good luck!");
	}
}
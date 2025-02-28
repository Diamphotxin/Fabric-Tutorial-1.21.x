package net.d4n.tutorialmod.tutorialmod;

import net.d4n.tutorialmod.tutorialmod.block.ModBlocks;
import net.d4n.tutorialmod.tutorialmod.component.ModDataComponentTypes;
import net.d4n.tutorialmod.tutorialmod.item.ModItemGroups;
import net.d4n.tutorialmod.tutorialmod.item.ModItems;
import net.d4n.tutorialmod.tutorialmod.util.HammerUsageEvent;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		FuelRegistry.INSTANCE.add(ModItems.STAR_DROP,2000);
		ModDataComponentTypes.registerDataComponentTypes();
		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());

	}
}
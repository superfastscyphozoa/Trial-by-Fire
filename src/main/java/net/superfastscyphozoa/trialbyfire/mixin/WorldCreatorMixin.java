package net.superfastscyphozoa.trialbyfire.mixin;

import net.minecraft.client.gui.screen.world.WorldCreator;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WorldCreator.class)
public class WorldCreatorMixin {
}
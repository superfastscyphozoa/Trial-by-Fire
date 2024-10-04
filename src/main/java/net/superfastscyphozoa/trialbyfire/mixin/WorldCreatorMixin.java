package net.superfastscyphozoa.trialbyfire.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import net.minecraft.client.gui.screen.world.WorldCreator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(WorldCreator.class)
public abstract class WorldCreatorMixin {

//    @Shadow public abstract WorldCreator.Mode getGameMode();
//
//    @WrapMethod(
//            method = "isHardcore"
//    )
//    private boolean hardcoreGamemode(Operation<Boolean> original) {
//
//        if (getGameMode() == WorldCreator.Mode.valueOf("TRIALBYFIRE")){
//            return true;
//        } else return original.call();
//    }
}
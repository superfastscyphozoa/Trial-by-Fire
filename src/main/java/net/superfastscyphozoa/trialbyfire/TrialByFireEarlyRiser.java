package net.superfastscyphozoa.trialbyfire;

import com.chocohead.mm.api.ClassTinkerers;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.MappingResolver;
import net.minecraft.world.GameMode;

public class TrialByFireEarlyRiser implements Runnable{
    @Override
    public void run() {
        final MappingResolver mappingResolver = FabricLoader.getInstance().getMappingResolver();

        final String worldCreatorGamemode =
                mappingResolver.mapClassName("intermediary", "net.minecraft.class_8100$class_4539");

        ClassTinkerers
                .enumBuilder(worldCreatorGamemode, String.class, GameMode.class)
                .addEnum("TRIALBYFIRE","trialbyfire", GameMode.SURVIVAL)
                .build();
    }
}

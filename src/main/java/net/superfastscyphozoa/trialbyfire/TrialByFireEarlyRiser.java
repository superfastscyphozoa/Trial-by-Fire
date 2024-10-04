package net.superfastscyphozoa.trialbyfire;

import com.chocohead.mm.api.ClassTinkerers;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.MappingResolver;
import net.minecraft.world.GameMode;

public class TrialByFireEarlyRiser implements Runnable{
    @Override
    public void run() {
        /*
          I'm sorry if these explanations are terrible, I'm not the best programmer and had a hard time figuring this out,
          so I just decided to write a little tutorial on how to do it for future reference for me and others.
          If this helps you, I'm very glad :3, if not, sorry haha
        */

        //gets the mapping resolver
        final MappingResolver mappingResolver = FabricLoader.getInstance().getMappingResolver();

        //gets the enum to add your value to, represented in intermediary mappings
        final String worldCreatorGamemode =
                mappingResolver.mapClassName("intermediary", "net.minecraft.class_8100$class_4539");

        //gets the gamemode class as a string, as using minecraft classes without doing this will result in an error
        final String gameMode = 'L' + mappingResolver.mapClassName("intermediary", "net.minecraft.class_1934") + ';';

        /*
          notice how the references looks like this: "net.minecraft.class_1934" rather than this: "net.minecraft.world.GameMode"?
          that's because they're intermediary, get the intermediary reference of a class or method by checking it on the fabric docs
        */

        ClassTinkerers

                //gets the specific enum you want to add to, and specifies the type of parameters of the enum value
                .enumBuilder(worldCreatorGamemode, String.class, gameMode)

                //adds a new value to the enum, the first parameter is the name and the following ones are the parameters of the enum value
                .addEnum("TRIALBYFIRE","trialbyfire", GameMode.SURVIVAL)
                .build();
    }
}

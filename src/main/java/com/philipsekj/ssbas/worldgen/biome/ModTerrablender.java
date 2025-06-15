package com.philipsekj.ssbas.worldgen.biome;

import com.philipsekj.ssbas.Ssbas;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(Ssbas.MOD_ID, "overworld"), 2));
        Regions.register(new ModOverworldRegion1(new ResourceLocation(Ssbas.MOD_ID, "overworld1"), 2));
        Regions.register(new ModOverworldRegion2(new ResourceLocation(Ssbas.MOD_ID, "overworld2"), 2));
    }
}

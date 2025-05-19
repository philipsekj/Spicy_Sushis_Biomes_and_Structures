package com.philipsekj.ssbas.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> WARM_CORAL_PLACED = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation("ssbas", "warm_coral"));
    public static final ResourceKey<PlacedFeature> SEA_PICKLE_PLACED = ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation("ssbas", "sea_pickle"));

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        context.register(WARM_CORAL_PLACED, new PlacedFeature(configuredFeatures.getOrThrow(ModConfiguredFeatures.WARM_CORAL), List.of(RarityFilter.onAverageOnceEvery(5), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
        context.register(SEA_PICKLE_PLACED, new PlacedFeature(configuredFeatures.getOrThrow(ModConfiguredFeatures.SEA_PICKLE), List.of(CountPlacement.of(20), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    }
}

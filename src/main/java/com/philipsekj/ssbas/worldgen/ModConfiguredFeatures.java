package com.philipsekj.ssbas.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> WARM_CORAL = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation("ssbas", "warm_coral"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SEA_PICKLE = ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation("ssbas", "sea_pickle"));

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        context.register(WARM_CORAL, new ConfiguredFeature<>(Feature.CORAL_TREE, new CoralFeatureConfiguration(Blocks.BRAIN_CORAL_BLOCK.defaultBlockState(), Blocks.BRAIN_CORAL.defaultBlockState(), Blocks.BRAIN_CORAL_FAN.defaultBlockState())));
        context.register(SEA_PICKLE, new ConfiguredFeature<>(Feature.SEA_PICKLE, new NoneFeatureConfiguration()));
    }

}

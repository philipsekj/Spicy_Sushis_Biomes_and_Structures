package com.philipsekj.ssbas.worldgen.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.ParameterUtils;
import terrablender.api.Region;
import terrablender.api.RegionType;
import terrablender.api.VanillaParameterOverlayBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModOverworldRegion extends Region {
    private final List<BiomeMapping> biomeMappings;

    public ModOverworldRegion(ResourceLocation name, int weight, List<BiomeMapping> biomeMappings) {
        super(name, RegionType.OVERWORLD, weight);
        this.biomeMappings = biomeMappings;
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        VanillaParameterOverlayBuilder builder = new VanillaParameterOverlayBuilder();
        for (BiomeMapping mapping : biomeMappings) {
            mapping.parameters.build().forEach(point -> builder.add(point, mapping.biome));
        }
        builder.build().forEach(mapper::accept);
    }

    public record BiomeMapping(ParameterUtils.ParameterPointListBuilder parameters, ResourceKey<Biome> biome) {}
}

package com.philipsekj.ssbas.worldgen.biome;

import com.philipsekj.ssbas.Ssbas;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.ParameterUtils;
import terrablender.api.Regions;

import java.util.ArrayList;
import java.util.List;

public class ModTerrablender {
    public static void registerBiomes() {
        List<ModOverworldRegion.BiomeMapping> biomeMappings = new ArrayList<>();

        //Shimmering Shallows
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.WARM)
                        .humidity(ParameterUtils.Humidity.HUMID)
                        .continentalness(ParameterUtils.Continentalness.COAST)
                        .erosion(ParameterUtils.Erosion.EROSION_3)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.LOW_SLICE_VARIANT_ASCENDING),
                ModBiomes.SHIMMERING_SHALLOWS
        ));
        //Ashen Wastes
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.DRY)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.ASHEN_WASTES
        ));
        //Scorched Plateau
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.SCORCHED_PLATEAU
        ));
        //Eldertree Glade
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Eldertree_Glade
        ));
        //Gilded Marshlands
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Gilded_Marshlands
        ));
        //Frozen Abyss
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Frozen_Abyss
        ));
        //Veilwood Grove
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Veilwood_Grove
        ));
        //Lush Crater
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Lush_Crater
        ));
        //Obsidian Dunes
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Obsidian_Dunes
        ));
        //Verdant Cliffs
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Verdant_Cliffs
        ));
        //Twilight_Expanse
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Twilight_Expanse
        ));
        //Stormy Highlands
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Stormy_Highlands
        ));
        //Crystalline Hollows
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Crystalline_Hollows
        ));
        //Blighted Bog
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Blighted_Bog
        ));
        //Sanguine Thicket
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Sanguine_Thicket
        ));
        //Ethereal Steppe
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Ethereal_Steppe
        ));
        //Charred Hollow
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Charred_Hollow
        ));
        //Deep Rift
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Deep_Rift
        ));
        //Amber Glade
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Amber_Glade
        ));
        //Frostbitten Badlands
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Frostbitten_Badlands
        ));
        //Drifting Wastes
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Drifting_Wastes
        ));
        //Cursed Steppe
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Cursed_Steppe
        ));
        //Tanglewood Mire
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Tanglewood_Mire
        ));
        //Glacial Abyss
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Glacial_Abyss
        ));
        //Luminant Thicket
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Luminant_Thicket
        ));
        //Hallowed Expanse
        biomeMappings.add(new ModOverworldRegion.BiomeMapping(
                new ParameterUtils.ParameterPointListBuilder()
                        .temperature(ParameterUtils.Temperature.HOT)
                        .humidity(ParameterUtils.Humidity.ARID)
                        .continentalness(ParameterUtils.Continentalness.span(ParameterUtils.Continentalness.MID_INLAND, ParameterUtils.Continentalness.FAR_INLAND))
                        .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_2)
                        .depth(ParameterUtils.Depth.SURFACE)
                        .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_DESCENDING),
                ModBiomes.Hallowed_Expanse
        ));

        Regions.register(new ModOverworldRegion(
                new ResourceLocation(Ssbas.MOD_ID, "overworld"),
                2,
                biomeMappings
        ));
    }
}
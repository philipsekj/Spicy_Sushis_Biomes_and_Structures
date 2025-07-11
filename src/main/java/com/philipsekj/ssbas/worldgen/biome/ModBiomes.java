package com.philipsekj.ssbas.worldgen.biome;

import com.philipsekj.ssbas.Ssbas;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.Musics;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


import static net.minecraft.core.registries.Registries.PLACED_FEATURE;

public class ModBiomes {
    public static final ResourceKey<Biome> SHIMMERING_SHALLOWS = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "shimmering_shallows"));
    public static final ResourceKey<Biome> ASHEN_WASTES = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "ashen_wastes"));
    public static final ResourceKey<Biome> SCORCHED_PLATEAU = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "scorched_plateau"));
    public static final ResourceKey<Biome> Eldertree_Glade = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "eldertree_glade"));
    public static final ResourceKey<Biome> Gilded_Marshlands = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "gilded_marshlands"));
    public static final ResourceKey<Biome> Frozen_Abyss = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "frozen_abyss"));
    public static final ResourceKey<Biome> Veilwood_Grove = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "veilwood_grove"));
    public static final ResourceKey<Biome> Lush_Crater = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "lush_crater"));
    public static final ResourceKey<Biome> Obsidian_Dunes = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "obsidian_dunes"));
    public static final ResourceKey<Biome> Verdant_Cliffs = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "verdant_cliffs"));
    public static final ResourceKey<Biome> Twilight_Expanse = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "twilight_expanse"));
    public static final ResourceKey<Biome> Stormy_Highlands = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "stormy_highlands"));
    public static final ResourceKey<Biome> Crystalline_Hollows = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "crystalline_hollows"));
    public static final ResourceKey<Biome> Blighted_Bog = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "blighted_bog"));
    public static final ResourceKey<Biome> Sanguine_Thicket = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "sanguine_thicket"));
    public static final ResourceKey<Biome> Ethereal_Steppe = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "ethereal_steppe"));
    public static final ResourceKey<Biome> Charred_Hollow = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "charred_hollow"));
    public static final ResourceKey<Biome> Deep_Rift = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "deep_rift"));
    public static final ResourceKey<Biome> Amber_Glade = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "amber_glade"));
    public static final ResourceKey<Biome> Frostbitten_Badlands = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "frostbitten_badlands"));
    public static final ResourceKey<Biome> Drifting_Wastes = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "drifting_wastes"));
    public static final ResourceKey<Biome> Cursed_Steppe = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "cursed_steppe"));
    public static final ResourceKey<Biome> Tanglewood_Mire = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "tanglewood_mire"));
    public static final ResourceKey<Biome> Glacial_Abyss = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "glacial_abyss"));
    public static final ResourceKey<Biome> Luminant_Thicket = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "luminant_thicket"));
    public static final ResourceKey<Biome> Hallowed_Expanse = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(Ssbas.MOD_ID, "hallowed_expanse"));


    public static void bootstrap(BootstapContext<Biome> context) {
        context.register(SHIMMERING_SHALLOWS, shimmering_shallows(context));
        context.register(ASHEN_WASTES, ashen_wastes(context));
        context.register(SCORCHED_PLATEAU, scorched_plateau(context));
        context.register(Eldertree_Glade, eldertree_glade(context));
        context.register(Gilded_Marshlands, gilded_marshlands(context));
        context.register(Frozen_Abyss, frozen_abyss(context));
        context.register(Veilwood_Grove, veilwood_grove(context));
        context.register(Lush_Crater, lush_crater(context));
        context.register(Obsidian_Dunes, obsidian_dunes(context));
        context.register(Verdant_Cliffs, verdant_cliffs(context));
        context.register(Twilight_Expanse, twilight_expanse(context));
        context.register(Stormy_Highlands, stormy_highlands(context));
        context.register(Crystalline_Hollows, crystalline_hollows(context));
        context.register(Blighted_Bog, blighted_bog(context));
        context.register(Sanguine_Thicket, sanguine_thicket(context));
        context.register(Ethereal_Steppe, ethereal_steppe(context));
        context.register(Charred_Hollow, charred_hollow(context));
        context.register(Deep_Rift, deep_rift(context));
        context.register(Amber_Glade, amber_glade(context));
        context.register(Frostbitten_Badlands, frostbitten_badlands(context));
        context.register(Drifting_Wastes, drifting_wastes(context));
        context.register(Cursed_Steppe, cursed_steppe(context));
        context.register(Tanglewood_Mire, tanglewood_mire(context));
        context.register(Glacial_Abyss, glacial_abyss(context));
        context.register(Luminant_Thicket, luminant_thicket(context));
        context.register(Hallowed_Expanse, hallowed_expanse(context));
    }

    public static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder) {
        BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
        BiomeDefaultFeatures.addDefaultSprings(builder);
        BiomeDefaultFeatures.addSurfaceFreezing(builder);
    }

    public static Biome shimmering_shallows(BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.AXOLOTL, 5, 4, 4));

        BiomeDefaultFeatures.warmOceanSpawns(spawnBuilder, 6, 3);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultSoftDisks(biomeBuilder);
        BiomeDefaultFeatures.addWaterTrees(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultSeagrass(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .downfall(0.8f)
                .temperature(1.1f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x66CCFF)
                        .waterFogColor(0x88CCDD)
                        .skyColor(0xA6D8FF)
                        .grassColorOverride(0xA7E88D)
                        .foliageColorOverride(0x90DB6D)
                        .fogColor(0xD0F0FF)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }

    public static Biome ashen_wastes(BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x6E6E6E)
                        .waterFogColor(0x5A5A5A)
                        .skyColor(0xB0B0B0)
                        .grassColorOverride(0xAAAAAA)
                        .foliageColorOverride(0x888888)
                        .fogColor(0x999999)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }

    public static Biome scorched_plateau(BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0xCC3300)
                        .waterFogColor(0x661100)
                        .skyColor(0x662200)
                        .grassColorOverride(0x3A2C1A)
                        .foliageColorOverride(0x4A3B24)
                        .fogColor(0x552211)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome eldertree_glade (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x339999)
                        .waterFogColor(0x446666)
                        .skyColor(0x8866CC)
                        .grassColorOverride(0x66CC88)
                        .foliageColorOverride(0x55AA77)
                        .fogColor(0x8888AA)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome gilded_marshlands (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x4A3F1E)
                        .waterFogColor(0x2F2612)
                        .skyColor(0x968C5F)
                        .grassColorOverride(0x667744)
                        .foliageColorOverride(0x556633)
                        .fogColor(0x776633)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome frozen_abyss (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x336677)
                        .waterFogColor(0x224455)
                        .skyColor(0xA0D8FF)
                        .grassColorOverride(0xA0B0B0)
                        .foliageColorOverride(0x88A0A0)
                        .fogColor(0xCCE6F2)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome veilwood_grove (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x2A223D)
                        .waterFogColor(0x1E1A2C)
                        .skyColor(0x3C305C)
                        .grassColorOverride(0x324A38)
                        .foliageColorOverride(0x2E4030)
                        .fogColor(0x554466)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome lush_crater (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x3ED6B6)
                        .waterFogColor(0x2B9885)
                        .skyColor(0x8C3FF4)
                        .grassColorOverride(0x55EE88)
                        .foliageColorOverride(0x44CC77)
                        .fogColor(0x77D6C9)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome obsidian_dunes (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x3C0D0D)
                        .waterFogColor(0x1A0A0A)
                        .skyColor(0x444444)
                        .grassColorOverride(0x2C2C2C)
                        .foliageColorOverride(0x3A3A3A)
                        .fogColor(0x2B1B1B)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome verdant_cliffs (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x3AAFD9)
                        .waterFogColor(0x2F7EAA)
                        .skyColor(0x88CFFF)
                        .grassColorOverride(0x66C466)
                        .foliageColorOverride(0x4EA64E)
                        .fogColor(0xA8D8E0)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome twilight_expanse (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x5A3F75)
                        .waterFogColor(0x3A2F4D)
                        .skyColor(0x6B5C99)
                        .grassColorOverride(0x555577)
                        .foliageColorOverride(0x4C5066)
                        .fogColor(0x7866A0)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome stormy_highlands (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x3A4D66)
                        .waterFogColor(0x2C394A)
                        .skyColor(0x445566)
                        .grassColorOverride(0x556655)
                        .foliageColorOverride(0x4A5C4A)
                        .fogColor(0x667788)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome crystalline_hollows (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x4E94C2)
                        .waterFogColor(0x2A3C55)
                        .skyColor(0x2F1A40)
                        .grassColorOverride(0x3C688C)
                        .foliageColorOverride(0x446688)
                        .fogColor(0x6AB8FF)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome blighted_bog (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x5A7D33)
                        .waterFogColor(0x3E5126)
                        .skyColor(0x778855)
                        .grassColorOverride(0x6B8543)
                        .foliageColorOverride(0x567836)
                        .fogColor(0x889966)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome sanguine_thicket (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x4A1E1E)
                        .waterFogColor(0x2D1414)
                        .skyColor(0x5C2C3A)
                        .grassColorOverride(0x4E3A3A)
                        .foliageColorOverride(0x7C1E1E)
                        .fogColor(0x663344)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome ethereal_steppe (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x88DDEB)
                        .waterFogColor(0x66BBCF)
                        .skyColor(0xCCB3FF)
                        .grassColorOverride(0xA4EACD)
                        .foliageColorOverride(0xB3FFC9)
                        .fogColor(0xD9F5FF)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome charred_hollow (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x3C1E1E)
                        .waterFogColor(0x1F0E0E)
                        .skyColor(0x44332F)
                        .grassColorOverride(0x2C2C2C)
                        .foliageColorOverride(0x472A1A)
                        .fogColor(0x55332A)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome deep_rift (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x553322)
                        .waterFogColor(0x2A1A10)
                        .skyColor(0x7A4A2A)
                        .grassColorOverride(0x5C4F3E)
                        .foliageColorOverride(0x4F3C2E)
                        .fogColor(0x8C3C1A)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome amber_glade (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0xDDAA55)
                        .waterFogColor(0xBB8844)
                        .skyColor(0xFFDD99)
                        .grassColorOverride(0xBBAA66)
                        .foliageColorOverride(0xD9A03C)
                        .fogColor(0xEECF99)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome frostbitten_badlands (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x66AACC)
                        .waterFogColor(0x4B7A99)
                        .skyColor(0xA0C4E4)
                        .grassColorOverride(0xA9BAC1)
                        .foliageColorOverride(0x8FA6AD)
                        .fogColor(0xD8F1FF)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome veilwood_hollow (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x557F8A)
                        .waterFogColor(0x3B5561)
                        .skyColor(0x7A8CA9)
                        .grassColorOverride(0x6C8C7E)
                        .foliageColorOverride(0x7E9F92)
                        .fogColor(0x9CB9C5)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome drifting_wastes (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0xD9C185)
                        .waterFogColor(0xC2A96D)
                        .skyColor(0xFFE5B3)
                        .grassColorOverride(0xC2B58A)
                        .foliageColorOverride(0xA99870)
                        .fogColor(0xEAD7AA)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome cursed_steppe (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x4C5C5C)
                        .waterFogColor(0x2F3A3A)
                        .skyColor(0x7A7E74)
                        .grassColorOverride(0x6A715E)
                        .foliageColorOverride(0x5B6250)
                        .fogColor(0x888C7A)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome tanglewood_mire (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x3B4A2C)
                        .waterFogColor(0x27341F)
                        .skyColor(0x4D5A3C)
                        .grassColorOverride(0x546443)
                        .foliageColorOverride(0x3F512F)
                        .fogColor(0x5E6B50)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome glacial_abyss (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x2D4F66)
                        .waterFogColor(0x1C2F3B)
                        .skyColor(0xA8C9D9)
                        .grassColorOverride(0x8CA9B3)
                        .foliageColorOverride(0x78959F)
                        .fogColor(0xCFE6F0)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome luminant_thicket (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x2E736A)
                        .waterFogColor(0x1F4F49)
                        .skyColor(0x384E66)
                        .grassColorOverride(0x3C755A)
                        .foliageColorOverride(0x47A47C)
                        .fogColor(0x6EDFCB)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
    public static Biome hallowed_expanse (BootstapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeDefaultFeatures.desertSpawns(spawnBuilder);

        BiomeGenerationSettings.Builder biomeBuilder =
                new BiomeGenerationSettings.Builder(context.lookup(PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));
        //we need to follow the same order as vanilla biomes for the BiomeDefaultFeatures
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(false)
                .downfall(0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .mobSpawnSettings(spawnBuilder.build())
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0xD4C282)
                        .waterFogColor(0xBBA76A)
                        .skyColor(0xFFEAC2)
                        .grassColorOverride(0xD8D176)
                        .foliageColorOverride(0xC9BD63)
                        .fogColor(0xF6EED2)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .backgroundMusic(Musics.createGameMusic(SoundEvents.MUSIC_BIOME_SWAMP))
                        .build())
                .build();
    }
}

package com.philipsekj.ssbas.worldgen.biome.surface;

import com.philipsekj.ssbas.block.ModBlocks;
import com.philipsekj.ssbas.worldgen.biome.ModBiomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class ModSurfaceRules {
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource STONE = makeStateRule(Blocks.STONE);
    private static final SurfaceRules.RuleSource SHIMMERING_SAND = makeStateRule(ModBlocks.SHIMMERING_SAND.get());
    private static final SurfaceRules.RuleSource CORALSTONE = makeStateRule(ModBlocks.CORALSTONE.get());
    private static final SurfaceRules.RuleSource ASHY_DIRT = makeStateRule(ModBlocks.ASHY_DIRT.get());
    private static final SurfaceRules.RuleSource SCORCHED_DIRT = makeStateRule(ModBlocks.SCORCHED_DIRT.get());
    private static final SurfaceRules.RuleSource SCORCHED_GRASS = makeStateRule(ModBlocks.SCORCHED_GRASS.get());
    private static final SurfaceRules.RuleSource CHARRED_STONE = makeStateRule(ModBlocks.CHARRED_STONE.get());


    public static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);

        return SurfaceRules.sequence(
                // Shimmering Shallows
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.SHIMMERING_SHALLOWS),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SHIMMERING_SAND),
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, CORALSTONE),
                                SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, CORALSTONE)
                        )
                ),

                // Ashen Wastes
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.ASHEN_WASTES),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, ASHY_DIRT),
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, STONE),
                                SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, STONE)
                        )
                ),

                //Scorched Plateau
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.SCORCHED_PLATEAU),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SCORCHED_GRASS),
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, SCORCHED_DIRT),
                                SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, CHARRED_STONE),
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_CEILING, CHARRED_STONE),
                                SurfaceRules.ifTrue(SurfaceRules.DEEP_UNDER_FLOOR, CHARRED_STONE),
                                SurfaceRules.ifTrue(SurfaceRules.VERY_DEEP_UNDER_FLOOR, CHARRED_STONE)
                        )
                ),

                // Default: Grass Surface
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(isAtOrAboveWaterLevel, DIRT),
                                DIRT
                        )
                )
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}

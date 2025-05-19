package com.philipsekj.ssbas.worldgen.biome.surface;

import com.philipsekj.ssbas.block.ModBlocks;
import com.philipsekj.ssbas.worldgen.biome.ModBiomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class ModSurfaceRules {
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource SHIMMERING_SAND = makeStateRule(ModBlocks.SHIMMERING_SAND.get());
    private static final SurfaceRules.RuleSource CORALSTONE = makeStateRule(ModBlocks.CORALSTONE.get());


    public static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);

        return SurfaceRules.sequence(
                // Shimmering Shallows: Shimmering Sand on top
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.SHIMMERING_SHALLOWS),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SHIMMERING_SAND),
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, CORALSTONE),
                                SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, CORALSTONE)
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

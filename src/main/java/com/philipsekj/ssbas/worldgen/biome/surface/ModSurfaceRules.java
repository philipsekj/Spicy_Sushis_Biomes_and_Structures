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

        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, SHIMMERING_SAND), DIRT);

        return SurfaceRules.sequence(
                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.SHIMMERING_SHALLOWS),
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SHIMMERING_SAND)),
                        SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, CORALSTONE)),
                        SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, CORALSTONE),


                // Default to a grass and dirt surface
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, grassSurface)
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}

package com.philipsekj.ssbas.datagen;

import com.philipsekj.ssbas.Ssbas;
import com.philipsekj.ssbas.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Ssbas.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        saplingItem(ModBlocks.ASHEN_SHRUBS);
        saplingItem(ModBlocks.GLOWING_EMBER_MUSHROOM);
        saplingItem(ModBlocks.VIBRANT_WILDFLOWER);
        saplingItem(ModBlocks.THUNDERBLOOMS);
        saplingItem(ModBlocks.LUMINESCENT_MUSHROOM);
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Ssbas.MOD_ID,"block/" + item.getId().getPath()));
    }
}

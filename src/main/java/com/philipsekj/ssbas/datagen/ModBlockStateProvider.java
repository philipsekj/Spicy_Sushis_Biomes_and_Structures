package com.philipsekj.ssbas.datagen;

import com.philipsekj.ssbas.Ssbas;
import com.philipsekj.ssbas.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Ssbas.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.VOLCANIC_ROCK);
        blockWithItem(ModBlocks.VOLCANIC_COBBLED_ROCK);
        //blockWithItem(ModBlocks.VOLCANIC_GLASS);
        blockWithItem(ModBlocks.SHIMMERING_SAND);
        blockWithItem(ModBlocks.CORALSTONE);

        saplingBlock(ModBlocks.ASHEN_SHRUBS);
        saplingBlock(ModBlocks.GLOWING_EMBER_MUSHROOM);
        saplingBlock(ModBlocks.VIBRANT_WILDFLOWER);
        saplingBlock(ModBlocks.THUNDERBLOOMS);
        saplingBlock(ModBlocks.LUMINESCENT_MUSHROOM);

        logBlock(((RotatedPillarBlock) ModBlocks.ELDERWOOD_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.ELDERWOOD_WOOD.get()), blockTexture(ModBlocks.ELDERWOOD_LOG.get()), blockTexture(ModBlocks.ELDERWOOD_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ELDERWOOD_LOG.get()), blockTexture(ModBlocks.STRIPPED_ELDERWOOD_LOG.get()),
                new ResourceLocation(Ssbas.MOD_ID, "block/stripped_elderwood_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ELDERWOOD_WOOD.get()), blockTexture(ModBlocks.STRIPPED_ELDERWOOD_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_ELDERWOOD_LOG.get()));

        blockItem(ModBlocks.ELDERWOOD_LOG);
        blockItem(ModBlocks.ELDERWOOD_WOOD);
        blockItem(ModBlocks.STRIPPED_ELDERWOOD_WOOD);
        blockItem(ModBlocks.STRIPPED_ELDERWOOD_LOG);

        blockWithItem(ModBlocks.ELDERWOOD_PLANKS);
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(Ssbas.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}

package com.philipsekj.ssbas.block;

import com.philipsekj.ssbas.Ssbas;
import com.philipsekj.ssbas.block.custom.ModFlammableRotatedPillarBlock;
import com.philipsekj.ssbas.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Ssbas.MOD_ID);
    //Shimmering Shallows
    public static final RegistryObject<Block> SHIMMERING_SAND = registerBlock("shimmering_sand",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Block> CORALSTONE = registerBlock("coralstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    //Ashen Wastes
    public static final RegistryObject<Block> ASHEN_SHRUBS = registerBlock("ashen_shrubs",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEAD_BUSH)));
    public static final RegistryObject<Block> ASHY_DIRT = registerBlock("ashy_dirt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    //Obsidian Dunes
    public static final RegistryObject<Block> VOLCANIC_ROCK = registerBlock("volcanic_rock",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> VOLCANIC_COBBLED_ROCK = registerBlock("volcanic_cobbled_rock",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> VOLCANIC_GLASS = registerBlock("volcanic_glass",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block> CHARRED_CACTUS = registerBlock("charred_cactus",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CACTUS)));
    public static final RegistryObject<Block> GLOWING_EMBER_MUSHROOM = registerBlock("glowing_ember_mushroom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM)));

    //Verdant Cliffs
    public static final RegistryObject<Block> LUSH_MOSS = registerBlock("lush_moss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    public static final RegistryObject<Block> HANGING_MOSS = registerBlock("hanging_moss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.HANGING_ROOTS)));
    public static final RegistryObject<Block> GIANT_FERN = registerBlock("giant_fern",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LARGE_FERN)));
    public static final RegistryObject<Block> VIBRANT_WILDFLOWER = registerBlock("vibrant_wildflower",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TORCHFLOWER)));

    //Twilight Expanse
    public static final RegistryObject<Block> LUMINESCENT_MUSHROOM = registerBlock("luminescent_mushroom",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)));
    public static final RegistryObject<Block> CURSED_VINES = registerBlock("cursed_vines",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.VINE)));
    //public static final RegistryObject<Block> BLACK_OAK_LOG = registerBlock("black_oak_log",
    //() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> BLACK_OAK_PLANKS = registerBlock("black_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BLACK_OAK_leaves = registerBlock("black_oak_leaves",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    //Stormy Highlands
    public static final RegistryObject<Block> THUNDERBLOOMS = registerBlock("thunderblooms",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LILY_OF_THE_VALLEY)));
    public static final RegistryObject<Block> RESISTANT_MOSS = registerBlock("resistant_moss",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK)));
    //public static final RegistryObject<Block> WIND_BLASTED_LOG = registerBlock("wind_blasted_log",
    //() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> WIND_BLASTED_OAK_PLANKS = registerBlock("wind_blasted_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> WIND_BLASTED_OAK_LEAVES = registerBlock("wind_blasted_oak_leaves",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    //Crystalline Hollows
    public static final RegistryObject<Block> RED_GLOWING_CRYSTAL = registerBlock("red_glowing_crystal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> RED_GLOWING_CRYSTAL_BLOCK = registerBlock("red_glowing_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> ORANGE_GLOWING_CRYSTAL = registerBlock("orange_glowing_crystal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> ORANGE_GLOWING_CRYSTAL_BLOCK = registerBlock("orange_glowing_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> YELLOW_GLOWING_CRYSTAL = registerBlock("yellow_glowing_crystal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> YELLOW_GLOWING_CRYSTAL_BLOCK = registerBlock("yellow_glowing_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> GREEN_GLOWING_CRYSTAL = registerBlock("green_glowing_crystal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> GREEN_GLOWING_CRYSTAL_BLOCK = registerBlock("green_glowing_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> BLUE_GLOWING_CRYSTAL = registerBlock("blue_glowing_crystal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> BLUE_GLOWING_CRYSTAL_BLOCK = registerBlock("blue_glowing_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> PURPLE_GLOWING_CRYSTAL = registerBlock("purple_glowing_crystal",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> PURPLE_GLOWING_CRYSTAL_BLOCK = registerBlock("purple_glowing_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));

    //Eldertree Glade
    public static final RegistryObject<Block> ELDERWOOD_LOG = registerBlock("elderwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> ELDERWOOD_WOOD = registerBlock("elderwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ELDERWOOD_LOG = registerBlock("stripped_elderwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ELDERWOOD_WOOD = registerBlock("stripped_elderwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> ELDERWOOD_PLANKS = registerBlock("elderwood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    //Scorched Plateau
    public static final RegistryObject<Block> CHARRED_STONE = registerBlock("charred_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SCORCHED_DIRT = registerBlock("scorched_dirt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SCORCHED_GRASS = registerBlock("scorched_grass",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
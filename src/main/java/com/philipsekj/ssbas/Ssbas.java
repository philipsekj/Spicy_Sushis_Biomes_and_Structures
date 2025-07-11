package com.philipsekj.ssbas;

import com.mojang.logging.LogUtils;
import com.philipsekj.ssbas.block.ModBlocks;
import com.philipsekj.ssbas.item.ModItems;
import com.philipsekj.ssbas.worldgen.biome.ModBiomes;
import com.philipsekj.ssbas.worldgen.biome.ModTerrablender;
import com.philipsekj.ssbas.worldgen.biome.surface.ModSurfaceRules;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import terrablender.api.SurfaceRuleManager;

@Mod(Ssbas.MOD_ID)
public class Ssbas {
    public static final String MOD_ID = "ssbas";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Ssbas() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ModBiomes.bootstrap(context); // <-- this must run!
            ModTerrablender.registerBiomes();
        });


    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.SHIMMERING_SAND);
            event.accept(ModBlocks.CORALSTONE);
            event.accept(ModBlocks.ASHY_DIRT);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}

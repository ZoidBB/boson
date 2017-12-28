package com.zoidberg.minecraft.boson;

import com.zoidberg.minecraft.boson.blocks.GlowstoneTorch;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

@GameRegistry.ObjectHolder(Ref.MODID)
@Mod.EventBusSubscriber(modid = Ref.MODID)
public class BlockRegistrator {

    public static final GlowstoneTorch GLOWSTONE_TORCH = new GlowstoneTorch();

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {

        final IForgeRegistry<Block> registry = event.getRegistry();

        final Block[] blocks = {
                GLOWSTONE_TORCH
        };

        registry.registerAll(blocks);

    }
}

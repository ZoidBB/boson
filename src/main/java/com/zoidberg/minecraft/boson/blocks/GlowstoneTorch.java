package com.zoidberg.minecraft.boson.blocks;


import com.zoidberg.minecraft.boson.Ref;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class GlowstoneTorch extends Block {

    public GlowstoneTorch() {
        super(Material.ROCK);
        setUnlocalizedName(Ref.MODID + ".glowstone_torch");
        setRegistryName(Ref.MODID, "glowstone_torch");
        setLightLevel(15);
    }
}
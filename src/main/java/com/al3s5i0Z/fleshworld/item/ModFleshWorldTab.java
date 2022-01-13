package com.al3s5i0Z.fleshworld.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModFleshWorldTab {
    public static final CreativeModeTab FLESHWORLD_TAB = new CreativeModeTab("Flesh World Mod Tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(com.al3s5i0Z.fleshworld.block.ModBlocks.ROTTEN_BLOCK.get());
        }
    };
}
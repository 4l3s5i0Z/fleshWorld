package com.al3s5i0Z.fleshworld.item;

import com.al3s5i0Z.fleshworld.FleshWorld;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FleshWorld.MODID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

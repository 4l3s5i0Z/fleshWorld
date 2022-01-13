package com.al3s5i0Z.fleshworld.block;

import com.al3s5i0Z.fleshworld.item.ModFleshWorldTab;
import com.al3s5i0Z.fleshworld.item.ModItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import java.util.function.Supplier;

import static com.al3s5i0Z.fleshworld.FleshWorld.MODID;

public class ModBlocks {

    //Blocks
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    //Register the new rottenblock
    public static final RegistryObject<Block> ROTTEN_BLOCK = registerBlock("rotten_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).destroyTime(3)));
    public static final RegistryObject<Block> MUTTON_BLOCK = registerBlock("mutton_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).destroyTime(3)));
    public static final RegistryObject<Block> COW_BLOCK = registerBlock("cow_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).destroyTime(3)));
    public static final RegistryObject<Block> CHICKEN_BLOCK = registerBlock("chicken_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).destroyTime(3)));
    public static final RegistryObject<Block> PIG_BLOCK = registerBlock("pig_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).destroyTime(3)));

    //regoster 4 realz (in own tab)
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    //register the the "item" block (in own tab)
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItem.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ModFleshWorldTab.FLESHWORLD_TAB)));
    }

    //register Blocks
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}

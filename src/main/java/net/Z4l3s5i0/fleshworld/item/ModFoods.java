package net.Z4l3s5i0.fleshworld.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    // mine
    public static final FoodProperties RAW_MEAT_PLANT = (new FoodProperties.Builder()).fast().nutrition(1).saturationMod(0.1F).build();
    public static final FoodProperties ROTTEN_FLESH_PLANT = (new FoodProperties.Builder()).fast().nutrition(1).saturationMod(0.1F).build();

    // not mine
    public static final FoodProperties CUCUMBER = (new FoodProperties.Builder()).fast().nutrition(2).saturationMod(0.2F).build();
}

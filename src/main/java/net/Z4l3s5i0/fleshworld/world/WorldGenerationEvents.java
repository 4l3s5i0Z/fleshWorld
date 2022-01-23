package net.Z4l3s5i0.fleshworld.world;

import net.Z4l3s5i0.fleshworld.FleshWorld;
import net.Z4l3s5i0.fleshworld.world.gen.ModOreGeneration;
import net.Z4l3s5i0.fleshworld.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FleshWorld.MOD_ID)
public class WorldGenerationEvents {

    @SubscribeEvent
    public static void ModWorldGeneration(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);

        ModTreeGeneration.generateTrees(event);
        // ModFlowerGeneration.generateFlowers(event);
    }
}

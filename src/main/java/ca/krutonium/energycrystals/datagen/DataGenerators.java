package ca.krutonium.energycrystals.datagen;

import ca.krutonium.energycrystals.EnergyCrystals;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = EnergyCrystals.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if(event.includeServer()){
            generator.addProvider(new CrystalRecipes(generator));
            generator.addProvider(new CrystalDropTables(generator));
            CrystalBlockTags blockTags = new CrystalBlockTags(generator, event.getExistingFileHelper());
            generator.addProvider(blockTags);
            generator.addProvider(new CrystalItemTags(generator, blockTags, event.getExistingFileHelper()));
        }
        if(event.includeClient()){
            generator.addProvider(new CrystalBlockStates(generator, event.getExistingFileHelper()));
            generator.addProvider(new CrystalItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new CrystalLanguageProvider(generator, "en_us"));
        }
    }
}

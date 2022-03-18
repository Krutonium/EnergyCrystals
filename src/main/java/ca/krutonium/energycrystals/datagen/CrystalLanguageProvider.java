package ca.krutonium.energycrystals.datagen;

import ca.krutonium.energycrystals.EnergyCrystals;
import ca.krutonium.energycrystals.setup.ModSetup;
import ca.krutonium.energycrystals.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import ca.krutonium.energycrystals.EnergyCrystals;

import static ca.krutonium.energycrystals.EnergyCrystals.MODID;

public class CrystalLanguageProvider extends LanguageProvider {

    public CrystalLanguageProvider(DataGenerator generator, String locale){
        super(generator, MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + ModSetup.ITEM_GROUP, "Energy Crystals");

        add(Registration.EnergyCrystalOre_Overworld.get(), "Energy Crystal Ore");
        add(Registration.EnergyCrystalOre_Nether.get(), "Nether Energy Crystal Ore");
        add(Registration.EnergyCrystalOre_End.get(), "End Energy Crystal Ore");
        add(Registration.EnergyCrystalOre_Deepslate.get(), "Deep Energy Crystal Ore");
    }
}

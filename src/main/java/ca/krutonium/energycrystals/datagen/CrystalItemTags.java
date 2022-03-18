package ca.krutonium.energycrystals.datagen;

import ca.krutonium.energycrystals.EnergyCrystals;
import ca.krutonium.energycrystals.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CrystalItemTags extends ItemTagsProvider {

    public CrystalItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, EnergyCrystals.MODID, helper);
    }

    @Override
    protected void addTags(){
        tag(Tags.Items.ORES)
                .add(Registration.EnergyCrystalOre_Overworld_Item.get())
                .add(Registration.EnergyCrystalOre_Nether_Item.get())
                .add(Registration.EnergyCrystalOre_End_Item.get())
                .add(Registration.EnergyCrystalOre_Deepslate_Item.get());
    }
}

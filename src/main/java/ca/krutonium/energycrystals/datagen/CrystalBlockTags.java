package ca.krutonium.energycrystals.datagen;

import ca.krutonium.energycrystals.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import static ca.krutonium.energycrystals.EnergyCrystals.MODID;

public class CrystalBlockTags extends BlockTagsProvider {
    public CrystalBlockTags(DataGenerator generator, ExistingFileHelper helper){
        super(generator, MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(Registration.EnergyCrystalOre_Overworld.get())
                .add(Registration.EnergyCrystalOre_Nether.get())
                .add(Registration.EnergyCrystalOre_End.get())
                .add(Registration.EnergyCrystalOre_Deepslate.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(Registration.EnergyCrystalOre_Overworld.get())
                .add(Registration.EnergyCrystalOre_Nether.get())
                .add(Registration.EnergyCrystalOre_End.get())
                .add(Registration.EnergyCrystalOre_Deepslate.get());
        tag(Tags.Blocks.ORES)
                .add(Registration.EnergyCrystalOre_Overworld.get())
                .add(Registration.EnergyCrystalOre_Nether.get())
                .add(Registration.EnergyCrystalOre_End.get())
                .add(Registration.EnergyCrystalOre_Deepslate.get());
    }
    @Override
    public String getName() {
        return "Energy Crystals: Crystal Block Tags";
    }
}

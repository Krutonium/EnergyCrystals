package ca.krutonium.energycrystals.datagen;

import ca.krutonium.energycrystals.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static net.minecraftforge.versions.forge.ForgeVersion.MOD_ID;

public class CrystalBlockStates extends BlockStateProvider {
    public CrystalBlockStates(DataGenerator gen, ExistingFileHelper helper) { super( gen, MOD_ID, helper);}

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(Registration.EnergyCrystalOre_Overworld.get());
        simpleBlock(Registration.EnergyCrystalOre_Nether.get());
        simpleBlock(Registration.EnergyCrystalOre_End.get());
        simpleBlock(Registration.EnergyCrystalOre_Deepslate.get());
    }
}

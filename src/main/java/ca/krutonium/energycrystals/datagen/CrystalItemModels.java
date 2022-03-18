package ca.krutonium.energycrystals.datagen;

import ca.krutonium.energycrystals.EnergyCrystals;
import ca.krutonium.energycrystals.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CrystalItemModels extends ItemModelProvider {
    public CrystalItemModels(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, EnergyCrystals.MODID, helper);
    }
    @Override
    protected void registerModels() {
        withExistingParent(Registration.EnergyCrystalOre_Overworld_Item.get().getRegistryName().getPath(), modLoc("block/energy_crystal_ore_overworld"));
        withExistingParent(Registration.EnergyCrystalOre_Nether_Item.get().getRegistryName().getPath(), modLoc("block/energy_crystal_ore_nether"));
        withExistingParent(Registration.EnergyCrystalOre_End_Item.get().getRegistryName().getPath(), modLoc("block/energy_crystal_ore_end"));
        withExistingParent(Registration.EnergyCrystalOre_Deepslate_Item.get().getRegistryName().getPath(), modLoc("block/energy_crystal_ore_deepslate"));
    }
}

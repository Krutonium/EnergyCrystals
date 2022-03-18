package ca.krutonium.energycrystals.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import static ca.krutonium.energycrystals.EnergyCrystals.FANCY_NAME;

public class ModSetup {

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(FANCY_NAME) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.DIAMOND);
        }
    };

    public static void init(FMLCommonSetupEvent event) {

    }
}

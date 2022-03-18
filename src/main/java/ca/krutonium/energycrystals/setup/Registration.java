package ca.krutonium.energycrystals.setup;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static ca.krutonium.energycrystals.EnergyCrystals.MODID;

public class Registration
{
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    public static final BlockBehaviour.Properties ORE_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f);
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);

    public static final RegistryObject<Block> EnergyCrystalOre_Overworld = BLOCKS.register("energy_crystal_ore_overworld", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> EnergyCrystalOre_Overworld_Item = fromBlock(EnergyCrystalOre_Overworld);

    public static final RegistryObject<Block> EnergyCrystalOre_Nether = BLOCKS.register("energy_crystal_ore_nether", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> EnergyCrystalOre_Nether_Item = fromBlock(EnergyCrystalOre_Nether);

    public static final RegistryObject<Block> EnergyCrystalOre_End = BLOCKS.register("energy_crystal_ore_end", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> EnergyCrystalOre_End_Item = fromBlock(EnergyCrystalOre_End);

    public static final RegistryObject<Block> EnergyCrystalOre_Deepslate = BLOCKS.register("energy_crystal_ore_deepslate", () -> new Block(ORE_PROPERTIES));
    public static final RegistryObject<Item> EnergyCrystalOre_Deepslate_Item = fromBlock(EnergyCrystalOre_Deepslate);

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block){
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}

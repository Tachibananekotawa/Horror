package net.Tachi.horror.item;

import net.Tachi.horror.horror;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.item.CreativeModeTab.*;
import static net.minecraft.world.item.Item.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, horror.MOD_ID);

    public static final RegistryObject<Item> URANIUM = ITEMS.register("uranium",()-> new Item(new Item.Properties().tab(ModCreativeModTab.FNAF)));
    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium",()-> new Item(new Item.Properties().tab(ModCreativeModTab.FNAF)));
    public static final RegistryObject<Item> URANIUM_HELMET = ITEMS.register("uranium_helmet",()-> new Item(new Item.Properties().tab(ModCreativeModTab.FNAF)));


    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}

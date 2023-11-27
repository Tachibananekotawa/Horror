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

    public static final RegistryObject<Item> URANIUM = ITEMS.register("uranium",()-> new Item(new Item.Properties().tab(TAB_MISC)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

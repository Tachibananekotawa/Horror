package net.Tachi.horror.item;

import net.Tachi.horror.base.ModArmorMaterial;
import net.Tachi.horror.horror;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
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
    public static final RegistryObject<Item> URANIUM_HELMET = ITEMS.register("uranium_helmet",()-> new ArmorItem(ArmorTiers.Example, EquipmentSlot.HEAD,new Properties()));
    public static final RegistryObject<Item> URANIUM_CHESTPLATE = ITEMS.register("uranium_chestplate",()-> new ArmorItem(ArmorTiers.Example, EquipmentSlot.CHEST,new Properties()));
    public static final RegistryObject<Item> URANIUM_LEGGINGS = ITEMS.register("uranium_leggings",()-> new ArmorItem(ArmorTiers.Example, EquipmentSlot.LEGS,new Properties()));
    public static final RegistryObject<Item> URANIUM_BOOTS= ITEMS.register("uranium_boots",()-> new ArmorItem(ArmorTiers.Example, EquipmentSlot.FEET,new Properties()));
    public static final RegistryObject<PickaxeItem> URANIUM_PICKAXE = ITEMS.register("uranium_pickaxe",()->
            new PickaxeItem(ItemTiers.Uranium,5,3,new Properties().tab(ModCreativeModTab.FNAF)));
    static final RegistryObject<AxeItem> URANIUM_AXE = ITEMS.register("uranium_axe",()->
            new AxeItem(ItemTiers.Uranium,5,3,new Properties().tab(ModCreativeModTab.FNAF)));
    static final RegistryObject<ShovelItem> URANIUM_SHOVEL = ITEMS.register("uranium_shovel",()->
            new ShovelItem(ItemTiers.Uranium,5,3,new Properties().tab(ModCreativeModTab.FNAF)));
    static final RegistryObject<HoeItem> URANIUM_HOE = ITEMS.register("uranium_hoe",()->
            new HoeItem(ItemTiers.Uranium,5,3,new Properties().tab(ModCreativeModTab.FNAF)));
    static final RegistryObject<SwordItem> URANIUM_SWORD = ITEMS.register("uranium_sword",()->
            new SwordItem(ItemTiers.Uranium,5,3,new Properties().tab(ModCreativeModTab.FNAF)));

    public static class ArmorTiers{
        public static final ArmorMaterial Example = new ModArmorMaterial(
                "uranium",150, new int[
                        ]{20,40,50,10},
                300,
                SoundEvents.ARMOR_EQUIP_CHAIN,
                3.0f,
                3.0f,
                ()-> Ingredient.of(ItemStack.EMPTY.getItem())

        );

    }
    public static class ItemTiers{
        public static final Tier Uranium = new ForgeTier(4,1000,3.5f, 5, 400,null,()->Ingredient.of(ModItems.URANIUM.get()));
        };

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}

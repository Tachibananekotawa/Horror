package net.Tachi.horror.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab FNAF = new CreativeModeTab("horror") {
        @Override
        public ItemStack makeIcon() {
            return new  ItemStack(ModItems.URANIUM.get());
        }

    };
}

package net.Tachi.horror.block;

import net.Tachi.horror.block.custom.Radiationblock.json;
import net.Tachi.horror.horror;
import net.Tachi.horror.item.ModCreativeModTab;
import net.Tachi.horror.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, horror.MOD_ID);

    public static final RegistryObject<Block> Uranium_Ore = registerBlock("uranium_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(4,9)), ModCreativeModTab.FNAF);
    public static final RegistryObject<Block> DEEPSLATE_Uranium_Ore = registerBlock("deepslate_uranium_ore",() -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(), UniformInt.of(4,9)), ModCreativeModTab.FNAF);
    public static final RegistryObject<Block> Uranium_Block = registerBlock("uranium_block",() -> new json(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModCreativeModTab.FNAF);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T>block, CreativeModeTab tab){
        RegistryObject<T> toReturn= BLOCKS.register(name,block);
        registerBlockItem(name, toReturn, tab);

        return toReturn;
    }
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}

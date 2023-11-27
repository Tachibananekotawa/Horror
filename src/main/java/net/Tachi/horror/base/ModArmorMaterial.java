package net.Tachi.horror.base;

import net.Tachi.horror.horror;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public record ModArmorMaterial(String name, int durability, int[] protection, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial) implements ArmorMaterial {
private static final int[] DURABILITY_PER_SLOT = new int[] {13,15,16,11};

    @Override
    public int getDurabilityForSlot(EquipmentSlot equipmentSlot) {
        return DURABILITY_PER_SLOT[equipmentSlot.getIndex()]*this.durability;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot equipmentSlot) {
        return this.protection[equipmentSlot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public String getName() {
        return horror.MOD_ID + ":"+ this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}

package lunawurx.github.io.lunasmod;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class WoodArmorMaterial implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {4, 4, 4, 4};
    private static final int[] PROTECTION_AMOUNTS = new int[] {1, 4, 3, 2};
    @Override
    public int getDurability(EquipmentSlot arg0) {
    
        return BASE_DURABILITY[arg0.getEntitySlotId()]*19;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot arg0) {
        
        return PROTECTION_AMOUNTS[arg0.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        
        return 30;
    }

    @Override
    public SoundEvent getEquipSound() {
        
        return SoundEvents.ITEM_ARMOR_EQUIP_TURTLE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        
        return Ingredient.ofItems(LunaStuffMod.WOOD_SHAVING_ITEM);
    }

    @Override
    public String getName() {
        
        return "wooden";
    }

    @Override
    public float getToughness() {
       
        return 5;
    }

    @Override
    public float getKnockbackResistance() {
        
        return 10;
    }
    
}

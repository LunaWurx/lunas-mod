package lunawurx.github.io.lunasmod;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class PanelArmorMaterial implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNTS = new int[] {1, 3, 4, 2};
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
        
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        
        return Ingredient.ofItems(LunaStuffMod.METAL_SHEETING_ITEM);
    }

    @Override
    public String getName() {
        
        return "sheet";
    }

    @Override
    public float getToughness() {
       
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        
        return 0;
    }
    
}

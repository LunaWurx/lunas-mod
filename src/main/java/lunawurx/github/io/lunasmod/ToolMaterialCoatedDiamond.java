package lunawurx.github.io.lunasmod;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;


public class ToolMaterialCoatedDiamond implements ToolMaterial {

    @Override
    public float getAttackDamage() {

        return 12.0f;
    }

    @Override
    public int getDurability() {
        
        return 4096;
    }

    @Override
    public int getEnchantability() {
        
        return 31;
    }

    @Override
    public int getMiningLevel() {
        
        return 4;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        
        return 24;
    }

    @Override
    public Ingredient getRepairIngredient() {
        
        return Ingredient.ofItems(LunaStuffMod.NETHERITE_DIAMOND);
    }

    

    

}
package lunawurx.github.io.lunasmod;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;


public class ToolMaterialHeavyMetal implements ToolMaterial {

    @Override
    public float getAttackDamage() {

        return 5.0f;
    }

    @Override
    public int getDurability() {
        
        return 500;
    }

    @Override
    public int getEnchantability() {
        
        return 30;
    }

    @Override
    public int getMiningLevel() {
        
        return 2;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        
        return 11;
    }

    @Override
    public Ingredient getRepairIngredient() {
        
        return Ingredient.ofItems(LunaStuffMod.METAL_PANEL_ITEM);
    }

    

    

}
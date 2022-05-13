package lunawurx.github.io.lunasmod;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;


public class ToolMaterialFabric implements ToolMaterial {

    @Override
    public float getAttackDamage() {

        return 2.1f;
    }

    @Override
    public int getDurability() {
        
        return 196;
    }

    @Override
    public int getEnchantability() {
        
        return 30;
    }

    @Override
    public int getMiningLevel() {
        
        return 1;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        
        return 8;
    }

    @Override
    public Ingredient getRepairIngredient() {
        
        return Ingredient.ofItems(LunaStuffMod.REFINED_STONE_BLOCK);
    }

    

    

}
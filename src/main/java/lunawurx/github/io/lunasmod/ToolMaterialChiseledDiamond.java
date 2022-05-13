package lunawurx.github.io.lunasmod;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;


public class ToolMaterialChiseledDiamond implements ToolMaterial {

    @Override
    public float getAttackDamage() {

        return 8.0f;
    }

    @Override
    public int getDurability() {
        
        return 2048;
    }

    @Override
    public int getEnchantability() {
        
        return 30;
    }

    @Override
    public int getMiningLevel() {
        
        return 3;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        
        return 16;
    }

    @Override
    public Ingredient getRepairIngredient() {
        
        return Ingredient.ofItems(LunaStuffMod.BLAST_PROOF_WALL);
    }

    

    

}
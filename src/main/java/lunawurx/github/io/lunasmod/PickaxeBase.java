package lunawurx.github.io.lunasmod;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem {

    protected PickaxeBase(ToolMaterial material) {
        super(material, -1, -3, new Item.Settings().group(LunaStuffMod.LUNA_STUFF));

        
    }

   
}

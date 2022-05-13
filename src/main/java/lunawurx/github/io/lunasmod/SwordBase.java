package lunawurx.github.io.lunasmod;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SwordBase extends SwordItem {

    protected SwordBase(ToolMaterial material) {
        super(material, 1, -1, new Item.Settings().group(LunaStuffMod.LUNA_STUFF));
    }


    
}

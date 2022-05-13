package lunawurx.github.io.lunasmod;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class HoeBase extends HoeItem {

    protected HoeBase(ToolMaterial material) {
        super(material, -2, 1, new Item.Settings().group(LunaStuffMod.LUNA_STUFF));
    }


    
}

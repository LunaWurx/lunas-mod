package lunawurx.github.io.lunasmod;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class AxeBase extends AxeItem {

    protected AxeBase(ToolMaterial material) {
        super(material, 4, -3.0f, new Item.Settings().group(LunaStuffMod.LUNA_STUFF));
    }


    
}

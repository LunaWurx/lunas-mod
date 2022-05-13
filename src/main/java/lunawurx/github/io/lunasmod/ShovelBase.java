package lunawurx.github.io.lunasmod;

import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ShovelBase extends ShovelItem {

    protected ShovelBase(ToolMaterial material) {
        super(material, 0, -2, new Item.Settings().group(LunaStuffMod.LUNA_STUFF));
    }


    
}

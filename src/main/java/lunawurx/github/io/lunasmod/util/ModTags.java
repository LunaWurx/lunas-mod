package lunawurx.github.io.lunasmod.util;

import lunawurx.github.io.lunasmod.LunaStuffMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> REFINED_PLANK_BLOCKS = createTag("refined_plank_block");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(LunaStuffMod.MODID, name));
        }

        

    }



    public static class Items {

        public static final TagKey<Item> REFINED_PLANK_ITEMS = createTag("refined_plank_items");
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(LunaStuffMod.MODID, name));

        } 

    }

}

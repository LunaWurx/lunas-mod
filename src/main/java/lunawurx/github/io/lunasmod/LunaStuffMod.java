package lunawurx.github.io.lunasmod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
// import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
// import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
// import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.registry.Registry;

public class LunaStuffMod implements ModInitializer {
    public static final String MODID = "lunas-mod";

    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    public static final ItemGroup LUNA_STUFF = FabricItemGroupBuilder.build(
        new Identifier("lunas-mod", "tools"),
        () -> new ItemStack(Blocks.CRYING_OBSIDIAN));


    public static final ItemGroup FOODS_CATEG = FabricItemGroupBuilder.build(
        new Identifier("lunas-mod", "foods"),
        () -> new ItemStack(Blocks.MELON));

    
    public static final ItemGroup REFINED = FabricItemGroupBuilder.build(
        new Identifier("lunas-mod", "refined_items"),
        () -> new ItemStack(Blocks.OAK_PLANKS));
    

    public static final ItemGroup METALS_RELATED = FabricItemGroupBuilder.build(
        new Identifier("lunas-mod", "metals_related"),
        () -> new ItemStack(Blocks.IRON_BLOCK));

        
    public static final ItemGroup PEBBLES_STUFF = FabricItemGroupBuilder.build(
        new Identifier("lunas-mod", "pebbles_stuff"),
        () -> new ItemStack(Blocks.STONE_BUTTON));

    public static final ItemGroup MATERIALS = FabricItemGroupBuilder.build(
        new Identifier("lunas-mod", "materials"),
        () -> new ItemStack(Blocks.DIAMOND_ORE));


    public static final Item REFINED_PLANK_ITEM = new Item(new FabricItemSettings().group(LunaStuffMod.REFINED).maxCount(64));
    public static final Item ACACIA_REFINED_PLANK_ITEM = new Item(new FabricItemSettings().group(LunaStuffMod.REFINED).maxCount(64));
    public static final Item BIRCH_REFINED_PLANK_ITEM = new Item(new FabricItemSettings().group(LunaStuffMod.REFINED).maxCount(64));
    public static final Item SPRUCE_REFINED_PLANK_ITEM = new Item(new FabricItemSettings().group(LunaStuffMod.REFINED).maxCount(64));
    public static final Item JUNGLE_REFINED_PLANK_ITEM = new Item(new FabricItemSettings().group(LunaStuffMod.REFINED).maxCount(64));
    public static final Item DARK_OAK_REFINED_PLANK_ITEM = new Item(new FabricItemSettings().group(LunaStuffMod.REFINED).maxCount(64));
    public static final Item REFINED_STONE_ITEM = new Item(new FabricItemSettings().group(LunaStuffMod.REFINED).maxCount(64));
    public static final Item PEBBLE_ITEM = new Item(new FabricItemSettings().maxCount(64).group(LunaStuffMod.PEBBLES_STUFF));
    public static final Item WOOD_SHAVING_ITEM = new Item(new FabricItemSettings().group(LunaStuffMod.REFINED));

    public static final Item COOKED_BEETROOT_SEEDS = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).snack().build()).group(LunaStuffMod.FOODS_CATEG));
    public static final Item DRIED_SWEET_BERRIES = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(2).saturationModifier(0.75f).snack().alwaysEdible().build()).group(LunaStuffMod.FOODS_CATEG));
    public static final Item CRUSHED_BEETROOT = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(3).saturationModifier(1f).build()).group(LunaStuffMod.FOODS_CATEG));
    public static final Item BEET_SWEET_SOUP = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(1.75f).build()).group(LunaStuffMod.FOODS_CATEG));
    public static final Item BURGER_ITEM = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(5).saturationModifier(4.25f).build()).group(LunaStuffMod.FOODS_CATEG));
    public static final Item APPLE_PIE = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(9).saturationModifier(0.55f).build()).group(LunaStuffMod.FOODS_CATEG));

    public static final Item BEDROCK_CHIP = new Item(new FabricItemSettings().group(LunaStuffMod.MATERIALS));
    public static final Item BEDROCK_SHARD = new Item(new FabricItemSettings().group(LunaStuffMod.MATERIALS));
    public static final Item NETHERITE_DIAMOND = new Item(new FabricItemSettings().group(LunaStuffMod.MATERIALS));
    public static final Item NETHERITE_SCRAP_SHEETING = new Item(new FabricItemSettings().group(LunaStuffMod.MATERIALS));

    public static final Item METAL_SHEETING_ITEM = new Item(new FabricItemSettings().group(LunaStuffMod.METALS_RELATED));
    public static final Item METAL_PANEL_ITEM = new Item(new FabricItemSettings().group(LunaStuffMod.METALS_RELATED));

    public static final Item MOLD_A = new Item(new FabricItemSettings().group(LunaStuffMod.LUNA_STUFF));
    public static final Item MOLD_P = new Item(new FabricItemSettings().group(LunaStuffMod.LUNA_STUFF));
    public static final Item MOLD_H = new Item(new FabricItemSettings().group(LunaStuffMod.LUNA_STUFF));
    public static final Item MOLD_SH = new Item(new FabricItemSettings().group(LunaStuffMod.LUNA_STUFF));
    public static final Item MOLD_SW = new Item(new FabricItemSettings().group(LunaStuffMod.LUNA_STUFF));

    public static final Item COPPER_SHEETING_ITEM = new Item(new FabricItemSettings().group(LunaStuffMod.METALS_RELATED));
    public static final Item COPPER_PANEL_ITEM = new Item(new FabricItemSettings().group(LunaStuffMod.METALS_RELATED));

    public static final ArmorMaterial PANEL_ARMOR = new PanelArmorMaterial();

    public static final Block REFINED_PLANKS_BLOCK = new Block(FabricBlockSettings.of(Material.WOOD).strength(3.0f, 5.0f).requiresTool().sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_REFINED_PLANKS_BLOCK = new Block(FabricBlockSettings.of(Material.WOOD).strength(3.0f, 5.0f).requiresTool().sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_REFINED_PLANKS_BLOCK = new Block(FabricBlockSettings.of(Material.WOOD).strength(3.0f, 5.0f).requiresTool().sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_REFINED_PLANKS_BLOCK = new Block(FabricBlockSettings.of(Material.WOOD).strength(3.0f, 5.0f).requiresTool().sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_REFINED_PLANKS_BLOCK = new Block(FabricBlockSettings.of(Material.WOOD).strength(3.0f, 5.0f).requiresTool().sounds(BlockSoundGroup.WOOD));
    public static final Block DARK_OAK_REFINED_PLANKS_BLOCK = new Block(FabricBlockSettings.of(Material.WOOD).strength(3.0f, 5.0f).requiresTool().sounds(BlockSoundGroup.WOOD));
    public static final Block REFINED_STONE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f, 8.0f).requiresTool().sounds(BlockSoundGroup.STONE));

    public static final Block PEBBLE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool().sounds(BlockSoundGroup.BASALT));
    
    public static final Block FAKE_BEDROCK = new Block(FabricBlockSettings.of(Material.STONE).strength(125.0f).requiresTool().sounds(BlockSoundGroup.GLASS));

    public static final Block REINFORCED_PEBBLE_BLOCK_WOOD = new Block(FabricBlockSettings.of(Material.STONE).strength(16.5f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE));
    public static final Block REINFORCED_PEBBLE_BLOCK_STONE = new Block(FabricBlockSettings.of(Material.METAL).strength(22.25f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE));

    public static final Block COPPER_CONDUCTION_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(10.5f, 5.25f).requiresTool().sounds(BlockSoundGroup.COPPER));

    public static final Block METAL_FRAMING_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(10.5f, 15.25f).requiresTool().sounds(BlockSoundGroup.NETHERITE));
    public static final Block METAL_STRUCTURE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(18.25f, 18.50f).requiresTool().sounds(BlockSoundGroup.NETHERITE));
    public static final Block BLAST_PROOF_WALL = new Block(FabricBlockSettings.of(Material.METAL).strength(10.25f, 36.50f).requiresTool().sounds(BlockSoundGroup.NETHERITE));

    public static final Block COMPACT_IRON_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(3.25f, 8.50f).requiresTool().sounds(BlockSoundGroup.NETHERITE)); 

    public static final Block MODULE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(8.25f, 2.25f).requiresTool().sounds(BlockSoundGroup.STONE));
    public static final Block GILDED_MODULE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(13.25f, 11.50f).requiresTool().sounds(BlockSoundGroup.NETHER_GOLD_ORE));
    public static final Block POWERED_MODULE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(10.25f, 10.25f).requiresTool().sounds(BlockSoundGroup.LANTERN));
    public static final Block ENCHANTED_MODULE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(11.25f, 17.50f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK));

    public static final Identifier LEWIS_SOUND_ID = new Identifier("lunas-mod:lewis_survival_mode");
    public static SoundEvent LEWIS = new SoundEvent(LEWIS_SOUND_ID);


    // public static final CropBlock CUSTOM_CROP_BLOCK = new CustomCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
 
	// public static final Item CUSTOM_SEEDS = new AliasedBlockItem(LunaStuffMod.CUSTOM_CROP_BLOCK, new Item.Settings().group(ItemGroup.MISC));
    
    


    
    
    
    public void onInitialize() {
        DefaultedList<ItemStack> stacks = DefaultedList.ofSize(2);
        stacks.add(new ItemStack(PEBBLE_ITEM));
        stacks.add(new ItemStack(WOOD_SHAVING_ITEM));
        
        //ITEMS --------

            
            //materials
        Registry.register(Registry.ITEM, new Identifier(MODID, "bedrock_shard"), BEDROCK_SHARD);
        Registry.register(Registry.ITEM, new Identifier(MODID, "bedrock_chip"), BEDROCK_CHIP);
        Registry.register(Registry.ITEM, new Identifier(MODID, "netherite_diamond"), NETHERITE_DIAMOND);
        Registry.register(Registry.ITEM, new Identifier(MODID, "netherite_scrap_sheeting"), NETHERITE_SCRAP_SHEETING);
        
            //pebble related
        Registry.register(Registry.ITEM, new Identifier(MODID, "pebble"), PEBBLE_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MODID, "wood_shaving"), WOOD_SHAVING_ITEM);
        Registry.register(Registry.BLOCK, new Identifier(MODID, "pebble_block"), PEBBLE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MODID, "pebble_block"), new BlockItem(PEBBLE_BLOCK, new FabricItemSettings().group(LunaStuffMod.PEBBLES_STUFF)));
            
            //refined plank items
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "refined_plank"), REFINED_PLANK_ITEM);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "acacia_refined_plank"), ACACIA_REFINED_PLANK_ITEM);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "dark_oak_refined_plank"), DARK_OAK_REFINED_PLANK_ITEM);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "birch_refined_plank"), BIRCH_REFINED_PLANK_ITEM);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "spruce_refined_plank"), SPRUCE_REFINED_PLANK_ITEM);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "jungle_refined_plank"), JUNGLE_REFINED_PLANK_ITEM);        
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "refined_stone"), REFINED_STONE_ITEM);
            
            //metal sheeting related items
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "metal_sheeting"), METAL_SHEETING_ITEM);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "metal_panel"), METAL_PANEL_ITEM);

        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "heavy_mold_a"), MOLD_A);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "heavy_mold_h"), MOLD_H);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "heavy_mold_p"), MOLD_P);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "heavy_mold_sh"), MOLD_SH);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "heavy_mold_sw"), MOLD_SW);

        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "copper_sheeting"), COPPER_SHEETING_ITEM);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "copper_panel"), COPPER_PANEL_ITEM);

            //food related
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "cooked_beetroot_seeds"), COOKED_BEETROOT_SEEDS);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "dehydrated_sweet_berries"), DRIED_SWEET_BERRIES);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "crushed_beetroot"), CRUSHED_BEETROOT);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "beetroot_berry_soup"), BEET_SWEET_SOUP);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "burger"), BURGER_ITEM);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "apple_pie"), APPLE_PIE);


            //tools
        Registry.register(Registry.ITEM, new Identifier(MODID, "refined_stone_pickaxe"), new PickaxeBase(new ToolMaterialFabric()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "refined_stone_axe"), new AxeBase(new ToolMaterialFabric()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "refined_stone_sword"), new SwordBase(new ToolMaterialFabric()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "refined_stone_hoe"), new HoeBase(new ToolMaterialFabric()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "refined_stone_shovel"), new ShovelBase(new ToolMaterialFabric()));

        Registry.register(Registry.ITEM, new Identifier(MODID, "heavy_iron_pickaxe"), new PickaxeBase(new ToolMaterialHeavyMetal()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "heavy_iron_axe"), new AxeBase(new ToolMaterialHeavyMetal()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "heavy_iron_sword"), new SwordBase(new ToolMaterialHeavyMetal()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "heavy_iron_hoe"), new HoeBase(new ToolMaterialHeavyMetal()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "heavy_iron_shovel"), new ShovelBase(new ToolMaterialHeavyMetal()));

        Registry.register(Registry.ITEM, new Identifier(MODID, "chiseled_diamond_pickaxe"), new PickaxeBase(new ToolMaterialChiseledDiamond()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "chiseled_diamond_axe"), new AxeBase(new ToolMaterialChiseledDiamond()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "chiseled_diamond_sword"), new SwordBase(new ToolMaterialChiseledDiamond()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "chiseled_diamond_hoe"), new HoeBase(new ToolMaterialChiseledDiamond()));
        Registry.register(Registry.ITEM, new Identifier(MODID, "chiseled_diamond_shovel"), new ShovelBase(new ToolMaterialChiseledDiamond()));

            //armors
        Registry.register(Registry.ITEM, new Identifier(MODID, "panel_helmet"), new BaseArmor(PANEL_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(MODID, "panel_chestplate"), new BaseArmor(PANEL_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(MODID, "panel_leggings"), new BaseArmor(PANEL_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(MODID, "panel_boots"), new BaseArmor(PANEL_ARMOR, EquipmentSlot.FEET));


        //BLOCKS --------


            //refined planks blocks
        Registry.register(Registry.BLOCK, new Identifier("lunas-mod", "refined_planks_b"), REFINED_PLANKS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "refined_planks_b"), new BlockItem(REFINED_PLANKS_BLOCK, new FabricItemSettings().group(LunaStuffMod.REFINED)));
        Registry.register(Registry.BLOCK, new Identifier("lunas-mod", "acacia_refined_planks_b"), ACACIA_REFINED_PLANKS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "acacia_refined_planks_b"), new BlockItem(ACACIA_REFINED_PLANKS_BLOCK, new FabricItemSettings().group(LunaStuffMod.REFINED)));
        Registry.register(Registry.BLOCK, new Identifier("lunas-mod", "birch_refined_planks_b"), BIRCH_REFINED_PLANKS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "birch_refined_planks_b"), new BlockItem(BIRCH_REFINED_PLANKS_BLOCK, new FabricItemSettings().group(LunaStuffMod.REFINED)));
        Registry.register(Registry.BLOCK, new Identifier("lunas-mod", "jungle_refined_planks_b"), JUNGLE_REFINED_PLANKS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "jungle_refined_planks_b"), new BlockItem(JUNGLE_REFINED_PLANKS_BLOCK, new FabricItemSettings().group(LunaStuffMod.REFINED)));
        Registry.register(Registry.BLOCK, new Identifier("lunas-mod", "spruce_refined_planks_b"), SPRUCE_REFINED_PLANKS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "spruce_refined_planks_b"), new BlockItem(SPRUCE_REFINED_PLANKS_BLOCK, new FabricItemSettings().group(LunaStuffMod.REFINED)));
        Registry.register(Registry.BLOCK, new Identifier("lunas-mod", "dark_oak_refined_planks_b"), DARK_OAK_REFINED_PLANKS_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "dark_oak_refined_planks_b"), new BlockItem(DARK_OAK_REFINED_PLANKS_BLOCK, new FabricItemSettings().group(LunaStuffMod.REFINED)));

            //refined stone
        Registry.register(Registry.BLOCK, new Identifier("lunas-mod", "refined_stone_b"), REFINED_STONE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "refined_stone_b"), new BlockItem(REFINED_STONE_BLOCK, new FabricItemSettings().group(LunaStuffMod.REFINED)));

            //reinforced pebble blocks
        Registry.register(Registry.BLOCK, new Identifier("lunas-mod", "reinforced_wood_pb"), REINFORCED_PEBBLE_BLOCK_WOOD);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "reinforced_wood_pb"), new BlockItem(REINFORCED_PEBBLE_BLOCK_WOOD, new FabricItemSettings().group(LunaStuffMod.PEBBLES_STUFF)));
        Registry.register(Registry.BLOCK, new Identifier("lunas-mod", "reinforced_stone_pb"), REINFORCED_PEBBLE_BLOCK_STONE);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "reinforced_stone_pb"), new BlockItem(REINFORCED_PEBBLE_BLOCK_STONE, new FabricItemSettings().group(LunaStuffMod.PEBBLES_STUFF)));

            //metal related
        Registry.register(Registry.BLOCK, new Identifier("lunas-mod", "copper_conductor"), COPPER_CONDUCTION_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "copper_conductor"), new BlockItem(COPPER_CONDUCTION_BLOCK, new FabricItemSettings().group(LunaStuffMod.METALS_RELATED)));

        Registry.register(Registry.BLOCK, new Identifier("lunas-mod", "metal_structure"), METAL_STRUCTURE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "metal_structure"), new BlockItem(METAL_STRUCTURE_BLOCK, new FabricItemSettings().group(LunaStuffMod.METALS_RELATED)));
        Registry.register(Registry.BLOCK, new Identifier("lunas-mod", "metal_framing"), METAL_FRAMING_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "metal_framing"), new BlockItem(METAL_FRAMING_BLOCK, new FabricItemSettings().group(LunaStuffMod.METALS_RELATED)));
        Registry.register(Registry.BLOCK, new Identifier("lunas-mod", "blast_proof_wall"), BLAST_PROOF_WALL);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "blast_proof_wall"), new BlockItem(BLAST_PROOF_WALL, new FabricItemSettings().group(LunaStuffMod.METALS_RELATED)));

            //modules
        Registry.register(Registry.BLOCK, new Identifier("lunas-mod", "empty_module"), MODULE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "empty_module"), new BlockItem(MODULE_BLOCK, new FabricItemSettings().group(LunaStuffMod.METALS_RELATED)));
        Registry.register(Registry.BLOCK, new Identifier("lunas-mod", "gilded_module"), GILDED_MODULE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "gilded_module"), new BlockItem(GILDED_MODULE_BLOCK, new FabricItemSettings().group(LunaStuffMod.METALS_RELATED)));
        Registry.register(Registry.BLOCK, new Identifier("lunas-mod", "powered_module"), POWERED_MODULE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "powered_module"), new BlockItem(POWERED_MODULE_BLOCK, new FabricItemSettings().group(LunaStuffMod.METALS_RELATED)));
        Registry.register(Registry.BLOCK, new Identifier("lunas-mod", "enchanted_module"), ENCHANTED_MODULE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "enchanted_module"), new BlockItem(ENCHANTED_MODULE_BLOCK, new FabricItemSettings().group(LunaStuffMod.METALS_RELATED)));
            
            //misc
        Registry.register(Registry.BLOCK, new Identifier("lunas-mod", "compact_iron_block"), COMPACT_IRON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "compact_iron_block"), new BlockItem(COMPACT_IRON_BLOCK, new FabricItemSettings().group(LunaStuffMod.METALS_RELATED)));
        
        Registry.register(Registry.BLOCK, new Identifier("lunas-mod", "fake_bedrock"), FAKE_BEDROCK);
        Registry.register(Registry.ITEM, new Identifier("lunas-mod", "fake_bedrock"), new BlockItem(FAKE_BEDROCK, new FabricItemSettings().group(LunaStuffMod.MATERIALS)));
        
        //OTHER --------


            //fuels
        FuelRegistry.INSTANCE.add(REFINED_PLANK_ITEM, 200);
        FuelRegistry.INSTANCE.add(ACACIA_REFINED_PLANK_ITEM, 200);
        FuelRegistry.INSTANCE.add(BIRCH_REFINED_PLANK_ITEM, 200);
        FuelRegistry.INSTANCE.add(SPRUCE_REFINED_PLANK_ITEM, 200);
        FuelRegistry.INSTANCE.add(DARK_OAK_REFINED_PLANK_ITEM, 200);
        FuelRegistry.INSTANCE.add(JUNGLE_REFINED_PLANK_ITEM, 200);
        
        FuelRegistry.INSTANCE.add(REFINED_PLANKS_BLOCK, 350);
        FuelRegistry.INSTANCE.add(ACACIA_REFINED_PLANKS_BLOCK, 350);
        FuelRegistry.INSTANCE.add(BIRCH_REFINED_PLANKS_BLOCK, 350);
        FuelRegistry.INSTANCE.add(SPRUCE_REFINED_PLANKS_BLOCK, 350);
        FuelRegistry.INSTANCE.add(DARK_OAK_REFINED_PLANKS_BLOCK, 350);
        FuelRegistry.INSTANCE.add(JUNGLE_REFINED_PLANKS_BLOCK, 350);

        Registry.register(Registry.SOUND_EVENT, LunaStuffMod.LEWIS_SOUND_ID, LEWIS);

            //plants
        // Registry.register(Registry.BLOCK, new Identifier("lunas-mod","custom_crop_block"), CUSTOM_CROP_BLOCK);
        // Registry.register(Registry.ITEM, new Identifier("lunas-mod","custom_seeds"), CUSTOM_SEEDS);

    }
}
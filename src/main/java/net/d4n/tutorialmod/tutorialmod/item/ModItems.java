package net.d4n.tutorialmod.tutorialmod.item;

import net.d4n.tutorialmod.tutorialmod.TutorialMod;
import net.d4n.tutorialmod.tutorialmod.item.custom.ChiselItem;
import net.d4n.tutorialmod.tutorialmod.item.custom.HammerItem;
import net.d4n.tutorialmod.tutorialmod.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item Dimanite = registerItem("dimanite", new Item(new Item.Settings()));
    public static final Item Owenite = registerItem("owenite",new Item(new Item.Settings()));
    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));
    public static final Item BANANO = registerItem("banano", new Item(new Item.Settings().food(ModFoodComponents.BANANO)));
    public static final Item STAR_DROP = registerItem("star_drop", new Item(new Item.Settings()));
    public static final Item Dimanite_SWORD = registerItem("dimanite_sword",
    new SwordItem(ModToolMaterials.Dimanite,new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.Dimanite,3,-2.4f))));
    public static final Item Dimanite_PICKAXE = registerItem("dimanite_pickaxe",
    new PickaxeItem(ModToolMaterials.Dimanite,new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.Dimanite,1,-2.8f))));
    public static final Item Dimanite_SHOVEL = registerItem("dimanite_shovel",
    new ShovelItem(ModToolMaterials.Dimanite,new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.Dimanite,1.5f,-3.0f))));
    public static final Item Dimanite_AXE = registerItem("dimanite_axe",
    new AxeItem(ModToolMaterials.Dimanite,new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.Dimanite,8,-2.0f))));
    public static final Item Dimanite_HOE = registerItem("dimanite_hoe",
    new HoeItem(ModToolMaterials.Dimanite,new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.Dimanite,0,-3.0f))));
    public static final Item Dimanite_HAMMER = registerItem("dimanite_hammer",
            new HammerItem(ModToolMaterials.Dimanite,new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.Dimanite,7,-2.8f))));
    public static final Item Dimanite_HELMET = registerItem("dimanite_helmet",
            new ModArmorItem(ModArmorMaterials.Dimanite_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item Dimanite_CHESTPLATE = registerItem("dimanite_chestplate",
            new ArmorItem(ModArmorMaterials.Dimanite_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item Dimanite_LEGGINGS = registerItem("dimanite_leggings",
            new ArmorItem(ModArmorMaterials.Dimanite_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item Dimanite_BOOTS = registerItem("dimanite_boots",
            new ArmorItem(ModArmorMaterials.Dimanite_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));
    public static final Item Diamphy_SMITHING_TEMPLATE = registerItem("diamphy_smithing_template",
           SmithingTemplateItem.of(Identifier.of(TutorialMod.MOD_ID,"diamphy"), FeatureFlags.VANILLA));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);

    }
    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
          entries.add(Dimanite);
          entries.add(Owenite);
        } );


    }
}

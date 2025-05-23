package net.d4n.tutorialmod.tutorialmod.trim;

import net.d4n.tutorialmod.tutorialmod.TutorialMod;
import net.d4n.tutorialmod.tutorialmod.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class ModTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> Dimanite = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(TutorialMod.MOD_ID,"dimanite"));
    public static void  boostrap (Registerable<ArmorTrimMaterial>registerable){
        register(registerable,Dimanite, Registries.ITEM.getEntry(ModItems.Dimanite),
                Style.EMPTY.withColor(TextColor.parse("#b03fe0").getOrThrow()),0.8f);
    }



    private static void register  (Registerable <ArmorTrimMaterial> registerable, RegistryKey <ArmorTrimMaterial> armorTrimKey,
                                   RegistryEntry<Item> item, Style style, float itemModelIndex){
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(armorTrimKey.getValue().getPath(),item,itemModelIndex, Map.of(),
                Text.translatable(Util.createTranslationKey("trim_material",armorTrimKey.getValue())).fillStyle(style));
        registerable.register(armorTrimKey,trimMaterial);
    }

}

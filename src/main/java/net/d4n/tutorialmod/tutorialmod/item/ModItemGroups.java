package net.d4n.tutorialmod.tutorialmod.item;

import net.d4n.tutorialmod.tutorialmod.TutorialMod;
import net.d4n.tutorialmod.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup Dimanite_Items_Group = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"ore_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.Dimanite))
                    .displayName(Text.translatable("temgroup.tutorialmod.ore_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.Dimanite);
                        entries.add(ModItems.Owenite);
                        entries.add(ModItems.CHISEL);
                        entries.add(ModItems.STAR_DROP);
                        entries.add(ModItems.Dimanite_SWORD);
                        entries.add(ModItems.Dimanite_AXE);
                        entries.add(ModItems.Dimanite_PICKAXE);
                        entries.add(ModItems.Dimanite_SHOVEL);
                        entries.add(ModItems.Dimanite_HOE);
                    })
                    .build());
    public static final ItemGroup Dimanite_Tools_Group = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"tool_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.Dimanite_PICKAXE))
                    .displayName(Text.translatable("temgroup.tutorialmod.tool_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.Dimanite_SWORD);
                        entries.add(ModItems.Dimanite_AXE);
                        entries.add(ModItems.Dimanite_PICKAXE);
                        entries.add(ModItems.Dimanite_SHOVEL);
                        entries.add(ModItems.Dimanite_HOE);
                        entries.add(ModItems.Dimanite_HAMMER);
                    })
                    .build());
    public static final ItemGroup FOOD_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"food_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.BANANO))
                    .displayName(Text.translatable("temgroup.tutorialmod.food_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BANANO);

                    })
                    .build());
    public static final ItemGroup ARMOR_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"armor_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.Dimanite_CHESTPLATE))
                    .displayName(Text.translatable("temgroup.tutorialmod.armor_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.Dimanite_HELMET);
                        entries.add(ModItems.Dimanite_CHESTPLATE);
                        entries.add(ModItems.Dimanite_LEGGINGS);
                        entries.add(ModItems.Dimanite_BOOTS);
                        entries.add(ModItems.Diamphy_SMITHING_TEMPLATE);

                    })
                    .build());
    public static final ItemGroup Dimanite_Blocks_Group = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID,"ore_blocks"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModBlocks.Dimanite_BLOCK))
                    .displayName(Text.translatable("temgroup.tutorialmod.ore_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.Dimanite_BLOCK);
                        entries.add(ModBlocks.Owenite_BLOCK);
                        entries.add(ModBlocks.Raw_Dimanite_Deepslate_Ore);
                        entries.add(ModBlocks.Raw_Owenite_Deepslate_Ore);
                        entries.add(ModBlocks.Raw_Dimanite_BLOCK);
                        entries.add(ModBlocks.Raw_Owenite_BLOCK);
                        entries.add(ModBlocks.MAGIC_BLOCK);
                        entries.add(ModBlocks.Dimanite_STAIRS);
                        entries.add(ModBlocks.Dimanite_BUTTON);
                        entries.add(ModBlocks.Dimanite_FENCE);
                        entries.add(ModBlocks.Dimanite_DOOR);
                        entries.add(ModBlocks.Dimanite_GATE);
                        entries.add(ModBlocks.Dimanite_PRESSURE_PLATE);
                        entries.add(ModBlocks.Dimanite_TRAPDOOR);
                        entries.add(ModBlocks.Dimanite_WALL);
                        entries.add(ModBlocks.Dimanite_SLAB);
                        entries.add(ModBlocks.Dimanite_LAMP);


                    })

                    .build());





    public static void registerItemGroups(){
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}

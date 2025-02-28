package net.d4n.tutorialmod.tutorialmod.datagen;

import net.d4n.tutorialmod.tutorialmod.item.ModItems;
import net.d4n.tutorialmod.tutorialmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.Dimanite)
                .add(ModItems.Owenite)
                .add(Items.COAL)
                .add(Items.STICK)
                .add(Items.APPLE);
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.Dimanite_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.Dimanite_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.Dimanite_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.Dimanite_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.Dimanite_HOE);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.Dimanite_HELMET)
                .add(ModItems.Dimanite_CHESTPLATE)
                .add(ModItems.Dimanite_LEGGINGS)
                .add(ModItems.Dimanite_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.Dimanite);
        getOrCreateTagBuilder(ItemTags.TRIM_TEMPLATES)
                .add(ModItems.Diamphy_SMITHING_TEMPLATE);
    }
}

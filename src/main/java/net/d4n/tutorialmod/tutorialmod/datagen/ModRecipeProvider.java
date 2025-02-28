package net.d4n.tutorialmod.tutorialmod.datagen;

import net.d4n.tutorialmod.tutorialmod.TutorialMod;
import net.d4n.tutorialmod.tutorialmod.block.ModBlocks;
import net.d4n.tutorialmod.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.MinecartItem;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
       java.util.List <ItemConvertible> Dimanite_smeltables = List.of(
               ModBlocks.Raw_Dimanite_BLOCK,
               ModBlocks.Raw_Dimanite_Deepslate_Ore);
       java.util.List <ItemConvertible> Owenite_smeltables = List.of(
               ModBlocks.Raw_Owenite_BLOCK,
               ModBlocks.Raw_Owenite_Deepslate_Ore);

       offerSmelting(exporter, Dimanite_smeltables, RecipeCategory.MISC, ModItems.Dimanite,0.75f, 200,"dimanite");
       offerBlasting(exporter, Dimanite_smeltables, RecipeCategory.MISC, ModItems.Dimanite,0.75f, 50,"dimanite");
       offerSmelting(exporter, Owenite_smeltables, RecipeCategory.MISC, ModItems.Owenite,0.75f, 200,"owenite");
       offerBlasting(exporter, Owenite_smeltables, RecipeCategory.MISC, ModItems.Owenite,0.75f, 50,"owenite");
       offerReversibleCompactingRecipes(exporter,RecipeCategory.BUILDING_BLOCKS, ModItems.Owenite,RecipeCategory.DECORATIONS, ModBlocks.Owenite_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.Dimanite_BLOCK)
                .pattern("DDD")
                .pattern("DDD")
                .pattern("DDD")
                .input('D',ModItems.Dimanite)
                .criterion(hasItem(ModItems.Dimanite), conditionsFromItem(ModItems.Dimanite))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.Dimanite,9)
                .input(ModBlocks.Dimanite_BLOCK)
                .criterion(hasItem(ModBlocks.Dimanite_BLOCK),conditionsFromItem(ModBlocks.Dimanite_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.Dimanite,32)
                .input(ModBlocks.MAGIC_BLOCK)
                .criterion(hasItem(ModBlocks.MAGIC_BLOCK),conditionsFromItem(ModBlocks.MAGIC_BLOCK))
                .offerTo(exporter, Identifier.of(TutorialMod.MOD_ID,"dimanite_from_magic_block"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.Dimanite_SWORD)
                .pattern(" D ")
                .pattern(" D ")
                .pattern(" S ")
                .input('D',ModItems.Dimanite)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.Dimanite), conditionsFromItem(ModItems.Dimanite))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.Dimanite_PICKAXE)
                .pattern("DDD")
                .pattern(" S ")
                .pattern(" S ")
                .input('D',ModItems.Dimanite)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.Dimanite), conditionsFromItem(ModItems.Dimanite))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.Dimanite_AXE)
                .pattern("DD ")
                .pattern("DS ")
                .pattern(" S ")
                .input('D',ModItems.Dimanite)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.Dimanite), conditionsFromItem(ModItems.Dimanite))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.Dimanite_SHOVEL)
                .pattern(" D ")
                .pattern(" S ")
                .pattern(" S ")
                .input('D',ModItems.Dimanite)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.Dimanite), conditionsFromItem(ModItems.Dimanite))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.Dimanite_HOE)
                .pattern("DD ")
                .pattern(" S ")
                .pattern(" S ")
                .input('D',ModItems.Dimanite)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.Dimanite), conditionsFromItem(ModItems.Dimanite))
                .offerTo(exporter);
        offerSmithingTrimRecipe(exporter,ModItems.Diamphy_SMITHING_TEMPLATE,Identifier.of(TutorialMod.MOD_ID,"diamphy"));




    }
}

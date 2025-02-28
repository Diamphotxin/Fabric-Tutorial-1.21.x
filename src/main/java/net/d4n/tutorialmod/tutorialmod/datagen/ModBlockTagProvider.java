package net.d4n.tutorialmod.tutorialmod.datagen;

import net.d4n.tutorialmod.tutorialmod.block.ModBlocks;
import net.d4n.tutorialmod.tutorialmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.Dimanite_BLOCK)
                .add(ModBlocks.Owenite_BLOCK)
                .add(ModBlocks.Raw_Dimanite_BLOCK)
                .add(ModBlocks.Raw_Owenite_BLOCK)
                .add(ModBlocks.Raw_Dimanite_Deepslate_Ore)
                .add(ModBlocks.Raw_Owenite_Deepslate_Ore)
                .add(ModBlocks.MAGIC_BLOCK);
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.Raw_Dimanite_Deepslate_Ore)
                .add(ModBlocks.Raw_Owenite_Deepslate_Ore);
        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.Dimanite_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.Dimanite_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.Dimanite_WALL);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_DIMANITE_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

    }
}

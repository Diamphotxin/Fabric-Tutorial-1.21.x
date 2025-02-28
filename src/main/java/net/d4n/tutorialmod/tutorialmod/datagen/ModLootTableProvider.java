package net.d4n.tutorialmod.tutorialmod.datagen;

import net.d4n.tutorialmod.tutorialmod.block.ModBlocks;
import net.d4n.tutorialmod.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MAGIC_BLOCK);
        addDrop(ModBlocks.Owenite_BLOCK);
        addDrop(ModBlocks.Dimanite_BLOCK);

        addDrop(ModBlocks.Raw_Dimanite_BLOCK, oreDrops(ModBlocks.Raw_Dimanite_BLOCK, ModItems.Dimanite));
        addDrop(ModBlocks.Raw_Dimanite_Deepslate_Ore,multipleOreDrops(ModBlocks.Raw_Dimanite_Deepslate_Ore,ModItems.Dimanite,3,7) );
        addDrop(ModBlocks.Dimanite_STAIRS);
        addDrop(ModBlocks.Dimanite_BUTTON);
        addDrop(ModBlocks.Dimanite_WALL);
        addDrop(ModBlocks.Dimanite_TRAPDOOR);
        addDrop(ModBlocks.Dimanite_FENCE);
        addDrop(ModBlocks.Dimanite_GATE);
        addDrop(ModBlocks.Dimanite_PRESSURE_PLATE);
        addDrop(ModBlocks.Dimanite_DOOR, doorDrops(ModBlocks.Dimanite_DOOR));
        addDrop(ModBlocks.Dimanite_SLAB,slabDrops(ModBlocks.Dimanite_SLAB));


    }
    public LootTable.Builder multipleOreDrops (Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops,maxDrops))))
                        .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));


    }

}

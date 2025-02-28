package net.d4n.tutorialmod.tutorialmod.datagen;

import net.d4n.tutorialmod.tutorialmod.block.ModBlocks;
import net.d4n.tutorialmod.tutorialmod.block.custom.DimaniteLampBlock;
import net.d4n.tutorialmod.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool dimanite_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.Dimanite_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Owenite_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Raw_Dimanite_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Raw_Owenite_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Raw_Dimanite_Deepslate_Ore);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Raw_Owenite_Deepslate_Ore);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);
        dimanite_pool.stairs(ModBlocks.Dimanite_STAIRS);
        dimanite_pool.slab(ModBlocks.Dimanite_SLAB);
        dimanite_pool.button(ModBlocks.Dimanite_BUTTON);
        dimanite_pool.pressurePlate(ModBlocks.Dimanite_PRESSURE_PLATE);
        dimanite_pool.fence(ModBlocks.Dimanite_FENCE);
        dimanite_pool.fenceGate(ModBlocks.Dimanite_GATE);
        dimanite_pool.wall(ModBlocks.Dimanite_WALL);
       blockStateModelGenerator.registerDoor(ModBlocks.Dimanite_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.Dimanite_TRAPDOOR);
        Identifier lampoffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.Dimanite_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lamponIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.Dimanite_LAMP,"_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.Dimanite_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(DimaniteLampBlock.CLICKED,lamponIdentifier, lampoffIdentifier)));


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.Dimanite, Models.GENERATED);
        itemModelGenerator.register(ModItems.Owenite, Models.GENERATED);
        itemModelGenerator.register(ModItems.BANANO, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STAR_DROP, Models.GENERATED);
        itemModelGenerator.register(ModItems.Dimanite_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Dimanite_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Dimanite_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Dimanite_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Dimanite_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Dimanite_HAMMER, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.Dimanite_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.Dimanite_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.Dimanite_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.Dimanite_BOOTS));
        itemModelGenerator.register(ModItems.Diamphy_SMITHING_TEMPLATE,Models.GENERATED);



    }
}

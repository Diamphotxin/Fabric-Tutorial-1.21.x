package net.d4n.tutorialmod.tutorialmod.block;

import net.d4n.tutorialmod.tutorialmod.TutorialMod;
import net.d4n.tutorialmod.tutorialmod.block.custom.DimaniteLampBlock;
import net.d4n.tutorialmod.tutorialmod.block.custom.MagicBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;

public class ModBlocks {


    public static final Block MAGIC_BLOCK = registerBlock("magic_block",
            new MagicBlock(AbstractBlock.Settings
                    .create()
                    .strength(1f)
                    .requiresTool()));

    public static final Block Raw_Dimanite_BLOCK = registerBlock("raw_dimanite_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f).
                    requiresTool()));

    public static final Block Raw_Dimanite_Deepslate_Ore = registerBlock("raw_dimanite_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,6),
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block Raw_Owenite_Deepslate_Ore = registerBlock("raw_owenite_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,6),
                    AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));


    public static final Block Raw_Owenite_BLOCK = registerBlock("raw_owenite_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.NETHER_GOLD_ORE)));
    public static final Block Dimanite_BLOCK = registerBlock("dimanite_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block Dimanite_STAIRS =registerBlock("dimanite_stairs",
            new StairsBlock(ModBlocks.Dimanite_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block Dimanite_SLAB =registerBlock("dimanite_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block Dimanite_BUTTON =registerBlock("dimanite_button",
            new ButtonBlock(BlockSetType.IRON,2,
                    AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));

    public static final Block Dimanite_PRESSURE_PLATE =registerBlock("dimanite_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block Dimanite_FENCE =registerBlock("dimanite_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block Dimanite_GATE =registerBlock("dimanite_gate",
            new FenceGateBlock(WoodType.ACACIA,AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block Dimanite_WALL =registerBlock("dimanite_wall",
            new WallBlock (AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block Dimanite_DOOR = registerBlock("dimanite_door",
            new DoorBlock (BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));
    public static final Block Dimanite_TRAPDOOR = registerBlock("dimanite_trapdoor",
            new TrapdoorBlock (BlockSetType.ACACIA, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));

public static final Block Dimanite_LAMP = registerBlock("dimanite_lamp",
        new DimaniteLampBlock(AbstractBlock.Settings.create()
                .strength(1f).requiresTool().luminance(state ->state.get(DimaniteLampBlock.CLICKED)? 15 : 0)));





    public static final Block Owenite_BLOCK = registerBlock("owenite_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f)
                    .requiresTool()));

    private static Block registerBlock (String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, name), block );

    }


private static void registerBlockItem(String name, Block block) {
    Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID,name),
         new BlockItem(block, new Item.Settings()));

}



    public static void registerModBlocks(){
        TutorialMod.LOGGER.info("Registering Mod BLocks for" + TutorialMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.Dimanite_BLOCK);
            entries.add(ModBlocks.Owenite_BLOCK);
        });
    }
}

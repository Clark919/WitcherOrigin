package com.clarkster.witcherorigin.block;

import com.clarkster.witcherorigin.WitcherItemGroup;
import com.clarkster.witcherorigin.WitcherOrigin;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.sound.Sound;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WitcherBlocks {

    public static final Block CONTRACT_BOARD = registerBlock("contract_board",
            new Block(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(2.0f)), WitcherItemGroup.WITCHER);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(WitcherOrigin.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(WitcherItemGroup.WITCHER)));
    }
    public static void registerWitcherBlocks() {

    }
}

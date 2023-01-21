package com.clarkster.witcherorigin;

import com.clarkster.witcherorigin.registry.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class WitcherItemGroup {
    public static final ItemGroup WITCHER = FabricItemGroupBuilder.build(new Identifier(WitcherOrigin.MOD_ID, "witcher"),
        () -> new ItemStack(ModItems.WolfMedallion));

    public static final ItemGroup TROPHIES = FabricItemGroupBuilder.build(new Identifier(WitcherOrigin.MOD_ID, "trophies"),
            () -> new ItemStack(ModItems.ZombieTrophy));

    public static final ItemGroup CONTRACTS = FabricItemGroupBuilder.build(new Identifier(WitcherOrigin.MOD_ID, "contracts"),
            () -> new ItemStack(ModItems.CreeperContract));
}
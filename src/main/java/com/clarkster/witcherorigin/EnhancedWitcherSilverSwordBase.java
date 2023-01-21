package com.clarkster.witcherorigin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

import java.util.List;

public class EnhancedWitcherSilverSwordBase extends SwordItem {

    public EnhancedWitcherSilverSwordBase(EnhancedWitcherSwordMaterial toolMaterial) {
        super(toolMaterial, -1, -2.2f, new Settings().group(WitcherItemGroup.WITCHER).rarity(Rarity.RARE));
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.of(("\u00a7e\u00a7oBlade: Silver")));
    }
}

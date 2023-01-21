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

public class WintersBladeSwordBase extends SwordItem {

    public WintersBladeSwordBase(WintersBladeSwordMaterial toolMaterial) {
        super(toolMaterial, -1, -2.2f, new Settings().group(WitcherItemGroup.WITCHER).rarity(Rarity.RARE));
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.of(("\u00a7e\u00a7oBlade: Steel")));
        tooltip.add(Text.of(("\u00a7o\"Forged in Mahakam, tempered in dragon fire. Been in")));
        tooltip.add(Text.of(("\u00a7othe an Craite family for centuries... and now, it's yours.\"")));
    }
}

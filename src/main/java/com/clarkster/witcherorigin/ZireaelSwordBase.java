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

public class ZireaelSwordBase extends SwordItem {

    public ZireaelSwordBase(ZireaelSwordMaterial toolMaterial) {
        super(toolMaterial, -1, -2.2f, new Settings().group(WitcherItemGroup.WITCHER).rarity(Rarity.RARE));
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.of(("\u00a7e\u00a7oBlade: Silver")));
        tooltip.add(Text.of(("\u00a7o\"The flash that cuts through darkness, ")));
        tooltip.add(Text.of(("\u00a7othe light that breaks the night.\"")));
    }
}

package com.clarkster.witcherorigin;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class IrisSwordMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 2031;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6.0f;
    }

    @Override
    public float getAttackDamage() {
        return 8.0f;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 14;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(WitcherOrigin.EnrichedDimeritiumIngot);
    }
}

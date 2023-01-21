package com.clarkster.witcherorigin;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EnhancedWitcherSwordMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 1561;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6.0f;
    }

    @Override
    public float getAttackDamage() {
        return 7.0f;
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

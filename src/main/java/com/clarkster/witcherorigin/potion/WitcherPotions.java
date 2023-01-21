package com.clarkster.witcherorigin.potion;

import net.minecraft.item.FoodComponent;

public class WitcherPotions {
    public static final FoodComponent SWALLOW_POTION;
    public static final FoodComponent BLIZZARD_POTION;
    public static final FoodComponent CAT_POTION;
    public static final FoodComponent BLACKBLOOD_POTION;
    public static final FoodComponent FULLMOON_POTION;
    public static final FoodComponent THUNDERBOLT_POTION;
    public static final FoodComponent MARIBOR_POTION;
    static {
        SWALLOW_POTION = (new FoodComponent.Builder()).hunger(0).saturationModifier(0F).build();
        BLIZZARD_POTION = (new FoodComponent.Builder()).hunger(0).saturationModifier(0F).build();
        CAT_POTION = (new FoodComponent.Builder()).hunger(0).saturationModifier(0F).build();
        BLACKBLOOD_POTION = (new FoodComponent.Builder()).hunger(0).saturationModifier(0F).build();
        FULLMOON_POTION = (new FoodComponent.Builder()).hunger(0).saturationModifier(0F).build();
        THUNDERBOLT_POTION = (new FoodComponent.Builder()).hunger(0).saturationModifier(0F).build();
        MARIBOR_POTION = (new FoodComponent.Builder()).hunger(20).saturationModifier(0.1F).build();
    }
}


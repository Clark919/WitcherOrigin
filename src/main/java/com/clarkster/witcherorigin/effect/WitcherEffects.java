package com.clarkster.witcherorigin.effect;

import com.clarkster.witcherorigin.WitcherOrigin;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WitcherEffects {
    public static StatusEffect BLIZZARD;
    public static StatusEffect SWALLOW;
    public static StatusEffect BLACKBLOOD;
    public static StatusEffect FULLMOON;
    public static StatusEffect THUNDERBOLT;
    public static StatusEffect MARIBOR;
    public static StatusEffect CAT;
    public static StatusEffect WHIRL;
    public static StatusEffect REND;
    public static StatusEffect STUNNED;

    public static StatusEffect IMPEDED;

    public static StatusEffect registerBlizzard(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(WitcherOrigin.MOD_ID, name),
            new BlizzardEffect(StatusEffectCategory.BENEFICIAL, 3124687));
    }

    public static StatusEffect registerSwallow(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(WitcherOrigin.MOD_ID, name),
                new SwallowEffect(StatusEffectCategory.BENEFICIAL, 13446149));
    }

    public static StatusEffect registerBlackBlood(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(WitcherOrigin.MOD_ID, name),
                new BlackBloodEffect(StatusEffectCategory.BENEFICIAL, 1249300));
    }

    public static StatusEffect registerFullMoon(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(WitcherOrigin.MOD_ID, name),
                new FullMoonEffect(StatusEffectCategory.BENEFICIAL, 1325446));
    }

    public static StatusEffect registerThunderbolt(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(WitcherOrigin.MOD_ID, name),
                new ThunderboltEffect(StatusEffectCategory.BENEFICIAL, 3407756));
    }

    public static StatusEffect registerMaribor(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(WitcherOrigin.MOD_ID, name),
                new MariborEffect(StatusEffectCategory.BENEFICIAL, 9410192));
    }

    public static StatusEffect registerCat(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(WitcherOrigin.MOD_ID, name),
                new CatEffect(StatusEffectCategory.BENEFICIAL, 8625530));
    }

    public static StatusEffect registerWhirl(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(WitcherOrigin.MOD_ID, name),
                new WhirlEffect(StatusEffectCategory.BENEFICIAL, 13446149));
    }

    public static StatusEffect registerRend(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(WitcherOrigin.MOD_ID, name),
                new RendEffect(StatusEffectCategory.BENEFICIAL, 13446149));
    }

    public static StatusEffect registerStunned(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(WitcherOrigin.MOD_ID, name),
                new StunnedEffect(StatusEffectCategory.HARMFUL, 13446149).addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "0002f29e-4a61-4f31-ae98-416d7544df33", -1.0, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
    }

    public static StatusEffect registerImpeded(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(WitcherOrigin.MOD_ID, name),
                new ImpededEffect(StatusEffectCategory.HARMFUL, 11469053).addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "6282ca6a-b249-43fd-a868-d50416684852", -0.5, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
    }

    public static void registerEffects() {
        BLIZZARD = registerBlizzard("blizzard");
        SWALLOW = registerSwallow("swallow");
        BLACKBLOOD = registerBlackBlood("black_blood");
        FULLMOON = registerFullMoon("full_moon");
        MARIBOR = registerMaribor("maribor_forest");
        THUNDERBOLT = registerThunderbolt("thunderbolt");
        CAT = registerCat("cat");
        WHIRL = registerWhirl("whirl");
        REND = registerRend("rend");
        STUNNED = registerStunned("stunned");
        IMPEDED = registerImpeded("impeded");
    }

}

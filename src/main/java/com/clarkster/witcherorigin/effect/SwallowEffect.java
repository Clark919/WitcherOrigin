package com.clarkster.witcherorigin.effect;
import com.clarkster.witcherorigin.effect.WitcherEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;

public class SwallowEffect extends StatusEffect {
    public SwallowEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity target, int pAmplifier) {
        if (target.getHealth() < target.getMaxHealth()) {
            target.heal(1.0F);
        }
        super.applyUpdateEffect(target, pAmplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int i;
        i = 50 >> amplifier;
        if (i > 0) {
            return duration % i == 0;
        } else {
                return true;
        }
    }
}
package com.clarkster.witcherorigin.sound;

import com.clarkster.witcherorigin.WitcherOrigin;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WitcherSounds {

    public static SoundEvent AARD_SIGN = registerSoundEvent("aard_sign");
    public static SoundEvent IGNI_SIGN = registerSoundEvent("igni_sign");
    public static SoundEvent AXII_SIGN = registerSoundEvent("axii_sign");
    public static SoundEvent YRDEN_SIGN = registerSoundEvent("yrden_sign");
    public static SoundEvent QUEN_SIGN = registerSoundEvent("quen_sign");
    public static SoundEvent QUEN_SIGN_BREAK = registerSoundEvent("quen_sign_break");
    public static SoundEvent SELECT_SIGN = registerSoundEvent("select_sign");
    public static SoundEvent WITCHER_REND = registerSoundEvent("witcher_rend");
    public static SoundEvent WITCHER_POTION_REFILL = registerSoundEvent("witcher_potion_refill");
    public static SoundEvent WITCHER_DASH = registerSoundEvent("witcher_dash");
    public static SoundEvent WINTERS_BLADE = registerSoundEvent("winters_blade");
    public static SoundEvent ZIREAEL_DASH = registerSoundEvent("zireael_dash");
    public static SoundEvent AERONDIGHT_ATTACK = registerSoundEvent("aerondight_attack");
    public static SoundEvent AERONDIGHT_DEPLETE = registerSoundEvent("aerondight_deplete");
    public static SoundEvent NEW_QUEST = registerSoundEvent("new_quest");
    public static SoundEvent UPDATE_QUEST = registerSoundEvent("update_quest");
    public static SoundEvent COMPLETE_QUEST = registerSoundEvent("complete_quest");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(WitcherOrigin.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}

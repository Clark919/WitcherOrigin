package com.clarkster.witcherorigin.particle;

import com.clarkster.witcherorigin.WitcherOrigin;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModParticles {
    public static final DefaultParticleType ZIREAEL_PARTICLE = FabricParticleTypes.simple();
    public static final DefaultParticleType QUEN_PARTICLE = FabricParticleTypes.simple();
    public static final DefaultParticleType AXII_PARTICLE = FabricParticleTypes.simple();

    public static void registerParticles() {
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(WitcherOrigin.MOD_ID, "zireael_particle"),
            ZIREAEL_PARTICLE);
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(WitcherOrigin.MOD_ID, "quen_particle"),
                QUEN_PARTICLE);
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(WitcherOrigin.MOD_ID, "axii_particle"),
                AXII_PARTICLE);
    }
}

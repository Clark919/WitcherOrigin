package com.clarkster.witcherorigin;

import com.clarkster.witcherorigin.particle.ModParticles;
import com.clarkster.witcherorigin.particle.custom.AxiiParticle;
import com.clarkster.witcherorigin.particle.custom.ZireaelParticle;
import com.clarkster.witcherorigin.particle.custom.QuenParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

public class WitcherClientOrigin implements ClientModInitializer {
    @Override
    public void onInitializeClient(){
        ParticleFactoryRegistry.getInstance().register(ModParticles.ZIREAEL_PARTICLE, ZireaelParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.QUEN_PARTICLE, QuenParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.AXII_PARTICLE, AxiiParticle.Factory::new);
    }
}

package com.clarkster.witcherorigin.villager;
import com.clarkster.witcherorigin.WitcherOrigin;
import com.clarkster.witcherorigin.block.WitcherBlocks;
import com.clarkster.witcherorigin.registry.ModItems;
import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {
    public static final PointOfInterestType SENTINEL_POI = registerPOI("sentinel_poi", WitcherBlocks.CONTRACT_BOARD);
    public static final VillagerProfession SENTINEL = registerProfession("sentinel",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(WitcherOrigin.MOD_ID, "sentinel_poi")));

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(WitcherOrigin.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(WitcherOrigin.MOD_ID, name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_CARTOGRAPHER).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(WitcherOrigin.MOD_ID, name),
                1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }

    public static void registerVillagers() {
        WitcherOrigin.LOGGER.debug("Registering Villagers for " + WitcherOrigin.MOD_ID);
    }

    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(SENTINEL,1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ROTTEN_FLESH, 8),
                            new ItemStack(Items.EMERALD, 1),
                            16, 3, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BONE, 8),
                            new ItemStack(Items.EMERALD, 1),
                            16, 3, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(SENTINEL,2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SPIDER_EYE, 4),
                            new ItemStack(Items.EMERALD, 1),
                            12, 3, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GUNPOWDER, 4),
                            new ItemStack(Items.EMERALD, 1),
                            12, 3, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(SENTINEL,3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 16),
                            new ItemStack(ModItems.UncommonReport, 1),
                            3, 8, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.LEATHER, 2),
                            4, 4, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(ModItems.Chainmail, 6),
                            4, 4, 0.02f
                    )));

                });
        TradeOfferHelper.registerVillagerOffers(SENTINEL,4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 24),
                            new ItemStack(ModItems.RareReport, 1),
                            2,15, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(Items.SPYGLASS, 1),
                            2, 8, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(WitcherOrigin.DimeritiumIngot, 1),
                            4, 5, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(SENTINEL,5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(ModItems.EpicReport, 1),
                            1,20, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModItems.BladeOil, 2),
                            4, 5, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(ModItems.Alcohest, 3),
                            4, 5, 0.02f
                    )));
                });
    }
}
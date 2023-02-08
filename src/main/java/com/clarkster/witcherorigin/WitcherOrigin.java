package com.clarkster.witcherorigin;

import com.clarkster.witcherorigin.block.WitcherBlocks;
import com.clarkster.witcherorigin.particle.ModParticles;
import com.clarkster.witcherorigin.potion.*;
import com.clarkster.witcherorigin.registry.ModItems;
import com.clarkster.witcherorigin.effect.WitcherEffects;
import com.clarkster.witcherorigin.util.ModLootTableModifiers;
import com.clarkster.witcherorigin.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WitcherOrigin implements ModInitializer {

    public static final String MOD_ID = "witcheroriginaddon";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final Item DimeritiumIngot = new Item(new Item.Settings().group(WitcherItemGroup.WITCHER).rarity(Rarity.RARE).maxCount(64));
    public static final Item EnrichedDimeritiumIngot = new Item(new Item.Settings().group(WitcherItemGroup.WITCHER).rarity(Rarity.EPIC).maxCount(64));


    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "silver_sword"), new WitcherSilverSwordBase(new WitcherSwordMaterial()));
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "steel_sword"), new WitcherSteelSwordBase(new WitcherSwordMaterial()));
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "enhanced_silver_sword"), new EnhancedWitcherSilverSwordBase(new EnhancedWitcherSwordMaterial()));
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "enhanced_steel_sword"), new EnhancedWitcherSteelSwordBase(new EnhancedWitcherSwordMaterial()));
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "grandmaster_silver_sword"), new GrandmasterWitcherSilverSwordBase(new GrandmasterWitcherSwordMaterial()));
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "grandmaster_steel_sword"), new GrandmasterWitcherSteelSwordBase(new GrandmasterWitcherSwordMaterial()));
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "iris_sword"), new IrisSwordBase(new IrisSwordMaterial()));
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "aerondight_sword"), new AerondightSwordBase(new AerondightSwordMaterial()));
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "zireael_sword"), new ZireaelSwordBase(new ZireaelSwordMaterial()));
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "winters_blade"), new WintersBladeSwordBase(new WintersBladeSwordMaterial()));
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "dimeritium_ingot"), DimeritiumIngot);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "enriched_dimeritium_ingot"), EnrichedDimeritiumIngot);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "swallow_potion"), new SwallowPotion((new Item.Settings()).recipeRemainder(ModItems.EmptySwallowPotion).food(WitcherPotions.SWALLOW_POTION).group(WitcherItemGroup.WITCHER).rarity(Rarity.UNCOMMON).maxCount(3)));
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "blizzard_potion"), new BlizzardPotion((new Item.Settings()).recipeRemainder(ModItems.EmptyBlizzardPotion).food(WitcherPotions.BLIZZARD_POTION).group(WitcherItemGroup.WITCHER).rarity(Rarity.UNCOMMON).maxCount(3)));
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "cat_potion"), new CatPotion((new Item.Settings()).recipeRemainder(ModItems.EmptyCatPotion).food(WitcherPotions.CAT_POTION).group(WitcherItemGroup.WITCHER).rarity(Rarity.UNCOMMON).maxCount(3)));
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "black_blood_potion"), new BlackBloodPotion((new Item.Settings()).recipeRemainder(ModItems.EmptyBlackBloodPotion).food(WitcherPotions.BLACKBLOOD_POTION).group(WitcherItemGroup.WITCHER).rarity(Rarity.UNCOMMON).maxCount(3)));
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "thunderbolt_potion"), new ThunderboltPotion((new Item.Settings()).recipeRemainder(ModItems.EmptyThunderboltPotion).food(WitcherPotions.THUNDERBOLT_POTION).group(WitcherItemGroup.WITCHER).rarity(Rarity.UNCOMMON).maxCount(3)));
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "maribor_forest_potion"), new MariborPotion((new Item.Settings()).recipeRemainder(ModItems.EmptyMariborForestPotion).food(WitcherPotions.MARIBOR_POTION).group(WitcherItemGroup.WITCHER).rarity(Rarity.UNCOMMON).maxCount(3)));
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "full_moon_potion"), new FullMoonPotion((new Item.Settings()).recipeRemainder(ModItems.EmptyFullMoonPotion).food(WitcherPotions.FULLMOON_POTION).group(WitcherItemGroup.WITCHER).rarity(Rarity.UNCOMMON).maxCount(3)));
        ModItems.registerItems();
        WitcherBlocks.registerWitcherBlocks();
        WitcherEffects.registerEffects();
        ModParticles.registerParticles();
        ModLootTableModifiers.modifyLootTables();
        ModVillagers.registerVillagers();
        ModVillagers.registerTrades();
    }
}

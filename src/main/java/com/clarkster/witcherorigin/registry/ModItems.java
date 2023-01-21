package com.clarkster.witcherorigin.registry;

import blue.endless.jankson.annotation.Nullable;
import com.clarkster.witcherorigin.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.List;

public class ModItems {

    //Items
    public static final Item BladeOil = new Item(new Item.Settings().group(WitcherItemGroup.WITCHER).rarity(Rarity.RARE).maxCount(10));
    public static final Item Alcohest = new Item(new Item.Settings().group(WitcherItemGroup.WITCHER).rarity(Rarity.UNCOMMON).maxCount(64));
    public static final Item UncommonReport = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.UNCOMMON).maxCount(64)){
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.of(("\u00a7a\u00a7oA Sentinel's report after a scouting mission.")));
            tooltip.add(Text.of(("\u00a7a\u00a7oUse this item while playing as a Witcher origin")));
            tooltip.add(Text.of(("\u00a7a\u00a7oto generate a new \u00a7e[Uncommon Contract].")));
        }
    };
    public static final Item RareReport = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.RARE).maxCount(64)){
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.of(("\u00a7a\u00a7oA Sentinel's report after a scouting mission.")));
            tooltip.add(Text.of(("\u00a7a\u00a7oUse this item while playing as a Witcher origin")));
            tooltip.add(Text.of(("\u00a7a\u00a7oto generate a new \u00a7b[Rare Contract].")));
        }
    };
    public static final Item EpicReport = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.EPIC).maxCount(64)){
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.of(("\u00a7a\u00a7oA Sentinel's report after a scouting mission.")));
            tooltip.add(Text.of(("\u00a7a\u00a7oUse this item while playing as a Witcher origin")));
            tooltip.add(Text.of(("\u00a7a\u00a7oto generate a new \u00a7d[Epic Contract].")));
        }
    };
    public static final Item WolfMedallion = new Item(new Item.Settings().group(WitcherItemGroup.WITCHER).rarity(Rarity.EPIC).maxCount(64));
    public static final Item BearMedallion = new Item(new Item.Settings().group(WitcherItemGroup.WITCHER).rarity(Rarity.EPIC).maxCount(64));
    public static final Item UrsineChestplate = new ArmorItem(UrsineArmorMaterials.URSINE, EquipmentSlot.CHEST, new FabricItemSettings().group(WitcherItemGroup.WITCHER).rarity(Rarity.EPIC)){
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.of(("\u00a7eSet Bonus: \u00a7oWhenever an enemy")));
            tooltip.add(Text.of(("\u00a7e\u00a7oshatters your \u00a76Quen \u00a7e\u00a7oshield, there is a 30% chance")));
            tooltip.add(Text.of(("\u00a7e\u00a7oa new one will be cast at no cost.")));
        }
    };
    public static final Item UrsineGreaves = new ArmorItem(UrsineArmorMaterials.URSINE, EquipmentSlot.LEGS, new FabricItemSettings().group(WitcherItemGroup.WITCHER).rarity(Rarity.EPIC)){
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.of(("\u00a7eSet Bonus: \u00a7oWhenever an enemy")));
            tooltip.add(Text.of(("\u00a7e\u00a7oshatters your \u00a76Quen \u00a7e\u00a7oshield, there is a 30% chance")));
            tooltip.add(Text.of(("\u00a7e\u00a7oa new one will be cast at no cost.")));
        }
    };
    public static final Item UrsineBoots = new ArmorItem(UrsineArmorMaterials.URSINE, EquipmentSlot.FEET, new FabricItemSettings().group(WitcherItemGroup.WITCHER).rarity(Rarity.EPIC)){
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.of(("\u00a7eSet Bonus: \u00a7oWhenever an enemy")));
            tooltip.add(Text.of(("\u00a7e\u00a7oshatters your \u00a76Quen \u00a7e\u00a7oshield, there is a 30% chance")));
            tooltip.add(Text.of(("\u00a7e\u00a7oa new one will be cast at no cost.")));
        }
    };
    public static final Item WolvenChestplate = new ArmorItem(WolvenArmorMaterials.WOLVEN, EquipmentSlot.CHEST, new FabricItemSettings().group(WitcherItemGroup.WITCHER).rarity(Rarity.EPIC)){
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.of(("\u00a7eSet Bonus: \u00a7oWhenever you consume")));
            tooltip.add(Text.of(("\u00a7b[Blade Oil], \u00a7e\u00a7othere is a 40% chance to apply a random")));
            tooltip.add(Text.of(("\u00a7e\u00a7oWitcher potion effect, or Whirl, temporarily.")));
        }
    };
    public static final Item WolvenGreaves = new ArmorItem(WolvenArmorMaterials.WOLVEN, EquipmentSlot.LEGS, new FabricItemSettings().group(WitcherItemGroup.WITCHER).rarity(Rarity.EPIC)){
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.of(("\u00a7eSet Bonus: \u00a7oWhenever you consume")));
            tooltip.add(Text.of(("\u00a7b[Blade Oil], \u00a7e\u00a7othere is a 40% chance to apply a random")));
            tooltip.add(Text.of(("\u00a7e\u00a7oWitcher potion effect, or Whirl, temporarily.")));
        }
    };
    public static final Item WolvenBoots = new ArmorItem(WolvenArmorMaterials.WOLVEN, EquipmentSlot.FEET, new FabricItemSettings().group(WitcherItemGroup.WITCHER).rarity(Rarity.EPIC)){
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.of(("\u00a7eSet Bonus: \u00a7oWhenever you consume")));
            tooltip.add(Text.of(("\u00a7b[Blade Oil], \u00a7e\u00a7othere is a 40% chance to apply a random")));
            tooltip.add(Text.of(("\u00a7e\u00a7oWitcher potion effect, or Whirl, temporarily.")));
        }
    };
    public static final Item KaerMorhenChestplate = new ArmorItem(KaerMorhenArmorMaterials.KAER_MORHEN, EquipmentSlot.CHEST, new FabricItemSettings().group(WitcherItemGroup.WITCHER).rarity(Rarity.RARE)){
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.of(("\u00a7eSet Bonus: \u00a7oWhile holding a \u00a7aContract")));
            tooltip.add(Text.of(("\u00a7e\u00a7oor \u00a7aTrophy \u00a7e\u00a7oin your offhand,")));
            tooltip.add(Text.of(("\u00a7e\u00a7ogain additional armour and slight movement speed.")));
        }
    };
    public static final Item KaerMorhenGreaves = new ArmorItem(KaerMorhenArmorMaterials.KAER_MORHEN, EquipmentSlot.LEGS, new FabricItemSettings().group(WitcherItemGroup.WITCHER).rarity(Rarity.RARE)){
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.of(("\u00a7eSet Bonus: \u00a7oWhile holding a \u00a7aContract")));
            tooltip.add(Text.of(("\u00a7e\u00a7oor \u00a7aTrophy \u00a7e\u00a7oin your offhand,")));
            tooltip.add(Text.of(("\u00a7e\u00a7ogain additional armour and slight movement speed.")));
        }
    };
    public static final Item KaerMorhenBoots = new ArmorItem(KaerMorhenArmorMaterials.KAER_MORHEN, EquipmentSlot.FEET, new FabricItemSettings().group(WitcherItemGroup.WITCHER).rarity(Rarity.RARE)){
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.of(("\u00a7eSet Bonus: \u00a7oWhile holding a \u00a7aContract")));
            tooltip.add(Text.of(("\u00a7e\u00a7oor \u00a7aTrophy \u00a7e\u00a7oin your offhand,")));
            tooltip.add(Text.of(("\u00a7e\u00a7ogain additional armour and slight movement speed.")));
        }
    };
    public static final Item GrandmasterKaerMorhenChestplate = new ArmorItem(GrandmasterKaerMorhenArmorMaterials.GRANDMASTER_KAER_MORHEN, EquipmentSlot.CHEST, new FabricItemSettings().group(WitcherItemGroup.WITCHER).rarity(Rarity.EPIC)){
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.of(("\u00a7eSet Bonus: \u00a7oWhile holding a \u00a7aContract, \u00a7aTrophy,")));
            tooltip.add(Text.of(("\u00a7a[Crossbow], \u00a7e\u00a7oor \u00a7b[Blade Oil] \u00a7e\u00a7oin your offhand,")));
            tooltip.add(Text.of(("\u00a7e\u00a7ogain additional armour and slight movement speed.")));
        }
    };
    public static final Item GrandmasterKaerMorhenGreaves = new ArmorItem(GrandmasterKaerMorhenArmorMaterials.GRANDMASTER_KAER_MORHEN, EquipmentSlot.LEGS, new FabricItemSettings().group(WitcherItemGroup.WITCHER).rarity(Rarity.EPIC)){
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.of(("\u00a7eSet Bonus: \u00a7oWhile holding a \u00a7aContract, \u00a7aTrophy,")));
            tooltip.add(Text.of(("\u00a7a[Crossbow], \u00a7e\u00a7oor \u00a7b[Blade Oil] \u00a7e\u00a7oin your offhand,")));
            tooltip.add(Text.of(("\u00a7e\u00a7ogain additional armour and slight movement speed.")));
        }
    };
    public static final Item GrandmasterKaerMorhenBoots = new ArmorItem(GrandmasterKaerMorhenArmorMaterials.GRANDMASTER_KAER_MORHEN, EquipmentSlot.FEET, new FabricItemSettings().group(WitcherItemGroup.WITCHER).rarity(Rarity.EPIC)){
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.of(("\u00a7eSet Bonus: \u00a7oWhile holding a \u00a7aContract, \u00a7aTrophy,")));
            tooltip.add(Text.of(("\u00a7a[Crossbow], \u00a7e\u00a7oor \u00a7b[Blade Oil] \u00a7e\u00a7oin your offhand,")));
            tooltip.add(Text.of(("\u00a7e\u00a7ogain additional armour and slight movement speed.")));
        }
    };
    public static final Item VioletRose = new Item(new Item.Settings().group(WitcherItemGroup.WITCHER).maxCount(1));
    public static final Item LadysFavour = new Item(new Item.Settings().group(WitcherItemGroup.WITCHER).maxCount(1));
    public static final Item ElderBlood = new Item(new Item.Settings().group(WitcherItemGroup.WITCHER).maxCount(1));
    public static final Item TeddDeireadhSample = new Item(new Item.Settings().group(WitcherItemGroup.WITCHER).maxCount(1));
    public static final Item Chainmail = new Item(new Item.Settings().group(WitcherItemGroup.WITCHER).rarity(Rarity.UNCOMMON).maxCount(64));
    public static final Item EmptySwallowPotion = new Item(new Item.Settings().group(WitcherItemGroup.WITCHER).rarity(Rarity.UNCOMMON).maxCount(3));
    public static final Item EmptyFullMoonPotion = new Item(new Item.Settings().group(WitcherItemGroup.WITCHER).rarity(Rarity.UNCOMMON).maxCount(3));
    public static final Item EmptyMariborForestPotion = new Item(new Item.Settings().group(WitcherItemGroup.WITCHER).rarity(Rarity.UNCOMMON).maxCount(3));
    public static final Item EmptyCatPotion = new Item(new Item.Settings().group(WitcherItemGroup.WITCHER).rarity(Rarity.UNCOMMON).maxCount(3));
    public static final Item EmptyThunderboltPotion = new Item(new Item.Settings().group(WitcherItemGroup.WITCHER).rarity(Rarity.UNCOMMON).maxCount(3));
    public static final Item EmptyBlizzardPotion = new Item(new Item.Settings().group(WitcherItemGroup.WITCHER).rarity(Rarity.UNCOMMON).maxCount(3));
    public static final Item EmptyBlackBloodPotion = new Item(new Item.Settings().group(WitcherItemGroup.WITCHER).rarity(Rarity.UNCOMMON).maxCount(3));
    public static final Item PlayerTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.EPIC).maxCount(16));
    public static final Item PhantomTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final Item PillagerTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.RARE).maxCount(16));
    public static final Item EndermanTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final Item ShulkerTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.EPIC).maxCount(16));
    public static final Item HuskTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final Item StrayTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final Item GuardianTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.RARE).maxCount(16));
    public static final Item BlazeTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.RARE).maxCount(16));
    public static final Item CreeperTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final Item GhastTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.RARE).maxCount(16));
    public static final Item SkeletonTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final Item ZombieTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final Item WitchTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.RARE).maxCount(16));
    public static final Item VindicatorTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.RARE).maxCount(16));
    public static final Item DrownedTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final Item HoglinTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final Item PiglinTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final Item PiglinBruteTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.RARE).maxCount(16));
    public static final Item MagmaCubeTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.RARE).maxCount(16));
    public static final Item RavagerTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.EPIC).maxCount(16));
    public static final Item SlimeTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.RARE).maxCount(16));
    public static final Item SpiderTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final Item CaveSpiderTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.RARE).maxCount(16));
    public static final Item EndermiteTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.RARE).maxCount(16));
    public static final Item SilverfishTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.RARE).maxCount(16));
    public static final Item SkeletonHorseTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.EPIC).maxCount(16));
    public static final Item StriderTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final Item VexTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.EPIC).maxCount(16));
    public static final Item WolfTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final Item ZoglinTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.RARE).maxCount(16));
    public static final Item ZombieVillagerTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.RARE).maxCount(16));
    public static final Item ZombiePiglinTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.UNCOMMON).maxCount(16));
    public static final Item EnderDragonTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).maxCount(16));
    public static final Item WitherTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).maxCount(16));
    public static final Item WitherSkeletonTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.RARE).maxCount(16));
    public static final Item WardenTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.EPIC).maxCount(16));
    public static final Item EvokerTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.EPIC).maxCount(16));
    public static final Item ElderGuardianTrophy = new Item(new Item.Settings().group(WitcherItemGroup.TROPHIES).rarity(Rarity.EPIC).maxCount(16));
    public static final Item EnderDragonContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).maxCount(1));
    public static final Item WitherContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).maxCount(1));

    public static final Item CreeperContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.UNCOMMON).maxCount(1));
    public static final Item DrownedContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.UNCOMMON).maxCount(1));
    public static final Item EndermanContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.UNCOMMON).maxCount(1));
    public static final Item HoglinContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.UNCOMMON).maxCount(1));
    public static final Item HuskContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.UNCOMMON).maxCount(1));
    public static final Item PhantomContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.UNCOMMON).maxCount(1));
    public static final Item PiglinContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.UNCOMMON).maxCount(1));
    public static final Item SkeletonContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.UNCOMMON).maxCount(1));
    public static final Item SpiderContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.UNCOMMON).maxCount(1));
    public static final Item StrayContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.UNCOMMON).maxCount(1));
    public static final Item StriderContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.UNCOMMON).maxCount(1));
    public static final Item WolfContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.UNCOMMON).maxCount(1));
    public static final Item ZombieContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.UNCOMMON).maxCount(1));
    public static final Item ZombiePigmanContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.UNCOMMON).maxCount(1));
    public static final Item BlazeContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.RARE).maxCount(1));
    public static final Item CaveSpiderContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.RARE).maxCount(1));
    public static final Item EndermiteContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.RARE).maxCount(1));
    public static final Item GhastContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.RARE).maxCount(1));
    public static final Item GuardianContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.RARE).maxCount(1));
    public static final Item MagmaCubeContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.RARE).maxCount(1));
    public static final Item PiglinBruteContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.RARE).maxCount(1));
    public static final Item PillagerContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.RARE).maxCount(1));
    public static final Item SilverfishContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.RARE).maxCount(1));
    public static final Item SlimeContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.RARE).maxCount(1));
    public static final Item VindicatorContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.RARE).maxCount(1));
    public static final Item WitchContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.RARE).maxCount(1));
    public static final Item WitherSkeletonContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.RARE).maxCount(1));
    public static final Item ZoglinContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.RARE).maxCount(1));
    public static final Item ZombieVillagerContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.RARE).maxCount(1));
    public static final Item ElderGuardianContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.EPIC).maxCount(1));
    public static final Item EvokerContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.EPIC).maxCount(1));
    public static final Item RavagerContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.EPIC).maxCount(1));
    public static final Item ShulkerContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.EPIC).maxCount(1));
    public static final Item SkeletonHorseContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.EPIC).maxCount(1));
    public static final Item VexContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.EPIC).maxCount(1));
    public static final Item WardenContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.EPIC).maxCount(1));
    public static final Item PlayerContract = new Item(new Item.Settings().group(WitcherItemGroup.CONTRACTS).rarity(Rarity.EPIC).maxCount(1));



    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "wolf_medallion"), WolfMedallion);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "bear_medallion"), BearMedallion);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "ursine_chestplate"), UrsineChestplate);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "ursine_greaves"), UrsineGreaves);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "ursine_boots"), UrsineBoots);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "wolven_chestplate"), WolvenChestplate);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "wolven_greaves"), WolvenGreaves);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "wolven_boots"), WolvenBoots);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "kaer_morhen_chestplate"), KaerMorhenChestplate);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "kaer_morhen_greaves"), KaerMorhenGreaves);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "kaer_morhen_boots"), KaerMorhenBoots);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "grandmaster_kaer_morhen_chestplate"), GrandmasterKaerMorhenChestplate);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "grandmaster_kaer_morhen_greaves"), GrandmasterKaerMorhenGreaves);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "grandmaster_kaer_morhen_boots"), GrandmasterKaerMorhenBoots);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "violet_rose"), VioletRose);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "elder_blood"), ElderBlood);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "ladys_favour"), LadysFavour);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "tedd_deireadh_sample"), TeddDeireadhSample);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "chainmail"), Chainmail);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "blade_oil"), BladeOil);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "alcohest"), Alcohest);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "sentinel_report_uncommon"), UncommonReport);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "sentinel_report_rare"), RareReport);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "sentinel_report_epic"), EpicReport);

        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "empty_swallow_potion"), EmptySwallowPotion);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "empty_full_moon_potion"), EmptyFullMoonPotion);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "empty_maribor_forest_potion"), EmptyMariborForestPotion);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "empty_cat_potion"), EmptyCatPotion);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "empty_thunderbolt_potion"), EmptyThunderboltPotion);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "empty_blizzard_potion"), EmptyBlizzardPotion);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "empty_black_blood_potion"), EmptyBlackBloodPotion);

        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_creeper"), CreeperTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_drowned"), DrownedTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_enderman"), EndermanTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_hoglin"), HoglinTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_husk"), HuskTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_phantom"), PhantomTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_piglin"), PiglinTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_skeleton"), SkeletonTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_spider"), SpiderTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_stray"), StrayTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_strider"), StriderTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_wolf"), WolfTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_zombie"), ZombieTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_zombified_piglin"), ZombiePiglinTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_blaze"), BlazeTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_cave_spider"), CaveSpiderTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_endermite"), EndermiteTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_ghast"), GhastTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_guardian"), GuardianTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_magma_cube"), MagmaCubeTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_piglin_brute"), PiglinBruteTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_pillager"), PillagerTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_silverfish"), SilverfishTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_slime"), SlimeTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_vindicator"), VindicatorTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_witch"), WitchTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_wither_skeleton"), WitherSkeletonTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_zoglin"), ZoglinTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_zombie_villager"), ZombieVillagerTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_elder_guardian"), ElderGuardianTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_evoker"), EvokerTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_player"), PlayerTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_ravager"), RavagerTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_shulker"), ShulkerTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_skeleton_horse"), SkeletonHorseTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_vex"), VexTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_warden"), WardenTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_ender_dragon"), EnderDragonTrophy);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "trophy_wither"), WitherTrophy);


        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_creeper"), CreeperContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_drowned"), DrownedContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_enderman"), EndermanContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_hoglin"), HoglinContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_husk"), HuskContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_phantom"), PhantomContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_piglin"), PiglinContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_skeleton"), SkeletonContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_spider"), SpiderContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_stray"), StrayContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_strider"), StriderContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_wolf"), WolfContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_zombie"), ZombieContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_zombified_piglin"), ZombiePigmanContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_blaze"), BlazeContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_cave_spider"), CaveSpiderContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_endermite"), EndermiteContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_ghast"), GhastContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_guardian"), GuardianContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_magma_cube"), MagmaCubeContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_piglin_brute"), PiglinBruteContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_pillager"), PillagerContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_silverfish"), SilverfishContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_slime"), SlimeContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_vindicator"), VindicatorContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_witch"), WitchContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_wither_skeleton"), WitherSkeletonContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_zoglin"), ZoglinContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_zombie_villager"), ZombieVillagerContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_elder_guardian"), ElderGuardianContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_evoker"), EvokerContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_player"), PlayerContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_ravager"), RavagerContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_shulker"), ShulkerContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_skeleton_horse"), SkeletonHorseContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_vex"), VexContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_warden"), WardenContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_ender_dragon"), EnderDragonContract);
        Registry.register(Registry.ITEM, new Identifier(WitcherOrigin.MOD_ID, "contract_wither"), WitherContract);
    }
}

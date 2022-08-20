package com.flexsealkittee.doritos.item;

import com.flexsealkittee.doritos.DoritosMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item NACHO_CHEESE_DORITOS = registerItem("nacho_cheese_doritos", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.2f).build()).group(ModItemGroup.DORITOS)));
    public static final Item COOL_RANCH_DORITOS = registerItem("cool_ranch_doritos", new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(5).saturationModifier(0.2f).build()).group(ModItemGroup.DORITOS)));

    public static void registerModItems() {
        DoritosMod.LOGGER.debug("doin the item shit");
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DoritosMod.MOD_ID, name), item);
    }

}
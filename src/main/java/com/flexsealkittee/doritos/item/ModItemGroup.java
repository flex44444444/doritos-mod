package com.flexsealkittee.doritos.item;

import com.flexsealkittee.doritos.DoritosMod;
import net.minecraft.item.ItemGroup;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup DORITOS = FabricItemGroupBuilder.build(new Identifier(DoritosMod.MOD_ID, "doritos"), () -> new ItemStack(ModItems.NACHO_CHEESE_DORITOS));

}

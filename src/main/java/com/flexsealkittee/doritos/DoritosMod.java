package com.flexsealkittee.doritos;

import com.flexsealkittee.doritos.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoritosMod implements ModInitializer {

    public static final String MOD_ID = "doritos";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }

}

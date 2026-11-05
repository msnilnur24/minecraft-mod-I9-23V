package ru.college.i923v;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrystalfMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("CrystalfMod");

    @Override
    public void onInitialize() {
        LOGGER.info("Проект загружен успешно");
        ModBlocks.initialize();
        ModItems.initialize();
        ModItemGroups.registerItemGroups();
    }
}
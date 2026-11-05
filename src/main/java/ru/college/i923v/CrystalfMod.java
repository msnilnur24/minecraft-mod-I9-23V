package ru.college.i923v;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

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
        registerBlockBehavior();   // ← добавь эту строку
    }

    public void registerBlockBehavior() {
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            if (!world.isClient()) {
                if (world.getBlockState(hitResult.getBlockPos()).isOf(ModBlocks.ENERGY_CRYSTAL)) {
                    player.sendMessage(Text.literal("Энергокристалл освещает пространство"), false);
                    return ActionResult.SUCCESS;
                }
            }
            return ActionResult.PASS;
        });
    }
}


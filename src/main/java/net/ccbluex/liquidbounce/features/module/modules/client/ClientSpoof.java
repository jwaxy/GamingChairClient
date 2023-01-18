/*
 * Gaming Chair Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by FDP Client.
 * https://github.com/jwaxy/GamingChairClient/
 */
package net.ccbluex.liquidbounce.features.module.modules.client;

import net.ccbluex.liquidbounce.features.module.Module;
import net.ccbluex.liquidbounce.features.module.ModuleCategory;
import net.ccbluex.liquidbounce.features.module.ModuleInfo;
import net.ccbluex.liquidbounce.features.value.ListValue;

@ModuleInfo(name = "ClientSpoof",  category = ModuleCategory.CLIENT)
public final class ClientSpoof extends Module {
    public final ListValue modeValue = new ListValue("Mode", new String[]{
            "Vanilla",
            "Forge",
            "Lunar",
            "LabyMod",
            "CheatBreaker",
            "PvPLounge"
    }, "Vanilla");
}
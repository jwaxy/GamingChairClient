/*
 * Gaming Chair Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by Gaming Chair Client.
 * https://github.com/jwaxy/GamingChairClient/
 */
package net.ccbluex.liquidbounce.features.module.modules.client

import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.features.module.ModuleCategory
import net.ccbluex.liquidbounce.features.module.ModuleInfo
import net.ccbluex.liquidbounce.ui.client.gui.modernui.GuiScriptLoadMenu

@ModuleInfo(name = "ScriptGUI", category = ModuleCategory.CLIENT, canEnable = false)
class ScriptGUI : Module() {
    override fun onEnable() {
        mc.displayGuiScreen(GuiScriptLoadMenu())
    }
}

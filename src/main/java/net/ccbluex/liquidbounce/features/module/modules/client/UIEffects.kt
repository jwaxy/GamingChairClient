/*
 * Gaming Chair Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by Gaming Chair Client.
 * https://github.com/jwaxy/GamingChairClient/
 */
package net.ccbluex.liquidbounce.features.module.modules.client

import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.features.module.ModuleCategory
import net.ccbluex.liquidbounce.features.module.ModuleInfo
import net.ccbluex.liquidbounce.features.value.BoolValue
import net.ccbluex.liquidbounce.features.value.ListValue

@ModuleInfo(name = "UIEffects", category = ModuleCategory.CLIENT, canEnable = false)
object UIEffects : Module() {

    val buttonShadowValue = BoolValue("ButtonShadow", true)
    val UiShadowValue = ListValue("Mode", arrayOf("Shadow", "Glow", "None"), "Shadow")

}

/*
 * Gaming Chair Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by Gaming Chair Client.
 * https://github.com/jwaxy/GamingChairClient/
 */
package net.ccbluex.liquidbounce.features.module.modules.misc

import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.features.module.ModuleCategory
import net.ccbluex.liquidbounce.features.module.ModuleInfo
import net.ccbluex.liquidbounce.event.EventTarget
import net.ccbluex.liquidbounce.event.WorldEvent

@ModuleInfo(name = "MemoryFix",  category = ModuleCategory.MISC)
class MemoryFix : Module() {
    override fun onEnable() {
        Runtime.getRuntime().gc()
    }
    
    @EventTarget
    fun onWorld(event: WorldEvent) {
        Runtime.getRuntime().gc()
    }
}

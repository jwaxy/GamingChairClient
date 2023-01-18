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

@ModuleInfo(name = "Performance", category = ModuleCategory.CLIENT)
object Performance : Module() {
    @JvmField
    var staticParticleColorValue = BoolValue("StaticParticleColor", false)
    @JvmField
    var fastEntityLightningValue = BoolValue("FastEntityLightning", false)
    @JvmField
    var fastBlockLightningValue = BoolValue("FastBlockLightning", false)
}


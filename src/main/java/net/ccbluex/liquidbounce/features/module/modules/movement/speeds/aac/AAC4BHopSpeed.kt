/*
 * Gaming Chair Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by Gaming Chair Client.
 * https://github.com/jwaxy/GamingChairClient/
 */
package net.ccbluex.liquidbounce.features.module.modules.movement.speeds.aac

import net.ccbluex.liquidbounce.features.module.modules.movement.speeds.SpeedMode
import net.ccbluex.liquidbounce.utils.MovementUtils

class AAC4BHopSpeed : SpeedMode("AAC4BHop") {
    private var legitHop = false

    override fun onEnable() {
        legitHop = true
    }

    override fun onDisable() {
        mc.thePlayer.speedInAir = 0.02f
    }

    override fun onTick() {
        if (MovementUtils.isMoving()) {
            if (legitHop) {
                if (mc.thePlayer.onGround) {
                    mc.thePlayer.jump()
                    mc.thePlayer.onGround = false
                    legitHop = false
                }
                return
            }
            if (mc.thePlayer.onGround) {
                mc.thePlayer.onGround = false
                MovementUtils.strafe(0.375f)
                mc.thePlayer.jump()
                mc.thePlayer.motionY = 0.41
            } else mc.thePlayer.speedInAir = 0.0211f
        } else {
            mc.thePlayer.motionX = 0.0
            mc.thePlayer.motionZ = 0.0
            legitHop = true
        }
    }
}
/*
 * Gaming Chair Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by Gaming Chair Client.
 * https://github.com/jwaxy/GamingChairClient/
 */
package net.ccbluex.liquidbounce.features.special

object AutoReconnect {
    const val MAX = 60000
    const val MIN = 1000

    var isEnabled = true
    var delay = 5000
        set(value) {
            isEnabled = value < MAX

            field = value
        }
}
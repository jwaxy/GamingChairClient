/*
 * Gaming Chair Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by Gaming Chair Client.
 * https://github.com/jwaxy/GamingChairClient/
 */
package net.ccbluex.liquidbounce.utils

import com.google.gson.JsonObject
import net.ccbluex.liquidbounce.LiquidBounce
import net.minecraft.client.Minecraft
import net.minecraft.util.IChatComponent
import org.apache.logging.log4j.LogManager
import org.lwjgl.opengl.Display

object
ClientUtils : MinecraftInstance() {
    @JvmStatic
    val logger = LogManager.getLogger("GamingChairClient")


    fun logInfo(msg: String) {
        logger.info(msg)
    }

    fun logWarn(msg: String) {
        logger.warn(msg)
    }

    fun logError(msg: String) {
        logger.error(msg)
    }

    fun logError(msg: String, t: Throwable) {
        logger.error(msg, t)
    }

    fun logDebug(msg: String) {
        logger.debug(msg)
    }

    fun setTitle() {
        Display.setTitle("${LiquidBounce.CLIENT_NAME} ${LiquidBounce.CLIENT_VERSION} (${LiquidBounce.CLIENT_BRANCH}) | ${LiquidBounce.CLIENT_WEBSITE}")
    }
    fun setTitle(stats:String) {
        Display.setTitle("${LiquidBounce.CLIENT_NAME} ${LiquidBounce.CLIENT_VERSION} (${LiquidBounce.CLIENT_BRANCH}) | ${LiquidBounce.CLIENT_WEBSITE} - " + stats)
    }

    fun displayAlert(message: String) {
        displayChatMessage(LiquidBounce.COLORED_NAME + message)
    }

    fun displayChatMessage(message: String) {
        if (mc.thePlayer == null) {
            logger.info("(MCChat) $message")
            return
        }
        val jsonObject = JsonObject()
        jsonObject.addProperty("text", message)
        mc.thePlayer.addChatMessage(IChatComponent.Serializer.jsonToComponent(jsonObject.toString()))
    }

    /**
     * Minecraft instance
     */
    val mc = Minecraft.getMinecraft()!!

    enum class EnumOSType(val friendlyName: String) {
        WINDOWS("win"), LINUX("linux"), MACOS("mac"), UNKNOWN("unk");
    }
}

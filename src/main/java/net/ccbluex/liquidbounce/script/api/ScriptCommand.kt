/*
 * Gaming Chair Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by Gaming Chair Client.
 * https://github.com/jwaxy/GamingChairClient/
 */
package net.ccbluex.liquidbounce.script.api

import jdk.nashorn.api.scripting.JSObject
import jdk.nashorn.api.scripting.ScriptUtils
import net.ccbluex.liquidbounce.features.command.Command
import net.ccbluex.liquidbounce.utils.ClientUtils

@Suppress("UNCHECKED_CAST", "unused")
class ScriptCommand(private val commandObject: JSObject) : Command(commandObject.getMember("name") as String,
        ScriptUtils.convert(commandObject.getMember("aliases"), Array<String>::class.java) as Array<String>) {

    private val events = HashMap<String, JSObject>()

    /**
     * Called from inside the script to register a new event handler.
     * @param eventName Name of the event.
     * @param handler JavaScript function used to handle the event.
     */
    fun on(eventName: String, handler: JSObject) {
        events[eventName] = handler
    }

    override fun execute(args: Array<String>) {
        try {
            events["execute"]?.call(commandObject, args)
        } catch (throwable: Throwable) {
            ClientUtils.logError("[GamingChairScriptAPI] Exception in command '$command'!", throwable)
        }
    }
}
/*
 * Gaming Chair Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by Gaming Chair Client.
 * https://github.com/jwaxy/GamingChairClient/
 */
package net.ccbluex.liquidbounce.ui.client.gui.clickgui.utils.normal;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
public interface Utils {
    Minecraft mc = Minecraft.getMinecraft();
    FontRenderer fr = mc.fontRendererObj;
}

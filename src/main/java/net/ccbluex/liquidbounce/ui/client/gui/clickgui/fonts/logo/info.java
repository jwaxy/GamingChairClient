/*
 * Gaming Chair Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by Gaming Chair Client.
 * https://github.com/jwaxy/GamingChairClient/
 */
package net.ccbluex.liquidbounce.ui.client.gui.clickgui.fonts.logo;

import net.ccbluex.liquidbounce.ui.client.gui.clickgui.fonts.api.FontManager;
import net.ccbluex.liquidbounce.ui.client.gui.clickgui.fonts.impl.SimpleFontManager;
import net.ccbluex.liquidbounce.ui.client.gui.clickgui.style.styles.tenacity.SideGui.SideGui;

public class info {
    public static String Name = "GamingChairClient";

    public static String version = "";
    public static String username;
    private final SideGui sideGui = new SideGui();
    private static info INSTANCE;
    public  SideGui getSideGui() {
        return sideGui;
    }
    public static info getInstance() {
        try {
            if (INSTANCE == null) INSTANCE = new info();
            return INSTANCE;
        } catch (Throwable t) {
            //    ClientUtils.getLogger().warn(t);
            throw t;
        }
    }
    public static FontManager fontManager = SimpleFontManager.create();
    public static FontManager getFontManager() {
        return fontManager;
    }
}
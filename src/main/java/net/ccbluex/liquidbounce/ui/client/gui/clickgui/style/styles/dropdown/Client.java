/*
 * Gaming Chair Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by Gaming Chair Client.
 * https://github.com/jwaxy/GamingChairClient/
 */
package net.ccbluex.liquidbounce.ui.client.gui.clickgui.style.styles.dropdown;

public class Client {
    private static Client INSTANCE;
    public DropdownGUI dropDownGUI;
    public DropdownGUI getDropDownGUI() {
        return dropDownGUI;
    }
    public static Client getInstance() {

        try {
            if (INSTANCE == null) INSTANCE = new Client();
            return INSTANCE;
        } catch (Throwable t) {
           // ClientUtils.logError("Dropdown [e]:", t);
            throw t;
        }
    }
}

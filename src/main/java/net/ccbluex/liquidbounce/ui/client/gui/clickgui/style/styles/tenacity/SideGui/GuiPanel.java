/*
 * Gaming Chair Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by Gaming Chair Client.
 * https://github.com/jwaxy/GamingChairClient/
 */
package net.ccbluex.liquidbounce.ui.client.gui.clickgui.style.styles.tenacity.SideGui;

import net.minecraft.client.Minecraft;

public abstract class GuiPanel {

    final Minecraft mc = Minecraft.getMinecraft();
    public float rectWidth, rectHeight;

    abstract public void initGui();

    abstract public void keyTyped(char typedChar, int keyCode);

    abstract public void drawScreen(int mouseX, int mouseY, float partialTicks, int alpha);

    abstract public void mouseClicked(int mouseX, int mouseY, int button);

    abstract public void mouseReleased(int mouseX, int mouseY, int button);

}

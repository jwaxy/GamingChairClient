/*
 * Gaming Chair Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by Gaming Chair Client.
 * https://github.com/jwaxy/GamingChairClient/
 */
package net.ccbluex.liquidbounce.utils.render;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.vitox.ParticleGenerator;

@SideOnly(Side.CLIENT)
public final class ParticleUtils {

    private static final ParticleGenerator particleGenerator = new ParticleGenerator(100);

    public static void drawParticles(int mouseX, int mouseY) {
        particleGenerator.draw(mouseX, mouseY);
    }
}
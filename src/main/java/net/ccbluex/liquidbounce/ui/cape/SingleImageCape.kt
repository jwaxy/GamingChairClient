/*
 * Gaming Chair Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by FDP Client.
 * https://github.com/jwaxy/GamingChairClient/
 */
package net.ccbluex.liquidbounce.ui.cape

import net.minecraft.client.Minecraft
import net.minecraft.client.renderer.texture.DynamicTexture
import net.minecraft.util.ResourceLocation
import java.awt.image.BufferedImage

class SingleImageCape(override val name: String, val image: BufferedImage) : ICape {
    override val cape = ResourceLocation("fdpclient/cape/${name.lowercase().replace(" ","_")}")

    init {
        Minecraft.getMinecraft().textureManager.loadTexture(cape, DynamicTexture(image))
    }

    override fun finalize() {
        Minecraft.getMinecraft().textureManager.deleteTexture(cape)
    }
}
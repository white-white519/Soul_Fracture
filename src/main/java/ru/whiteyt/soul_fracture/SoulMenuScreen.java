package ru.whiteyt.soul_fracture;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import org.lwjgl.glfw.GLFW;
public class SoulMenuScreen extends Screen {
    public SoulMenuScreen() {
        super(Component.literal("Рассинхронизация Души"));
    }


    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
        this.renderBackground(guiGraphics);
        int centerX = this.width / 2;
        int centerY = this.height / 2;
        int width = 200;
        int height = 150;

        guiGraphics.fill(centerX - width / 2 - 1, centerY - height / 2 - 1, centerX + width / 2 + 1, centerY + height / 2 + 1, 0xFF000000);

        guiGraphics.fill(centerX - width / 2, centerY - height / 2, centerX + width / 2, centerY + height / 2, 0xFFC6C6C6);

        guiGraphics.drawCenteredString(this.font, this.title, centerX, centerY - height / 2 + 10, 0x404040);
        super.render(guiGraphics, mouseX, mouseY, partialTick);


    int iconSize = 20;
    int iconX = centerX - 50;
    int iconY = centerY - 20;

    boolean isHovered = mouseX >= iconX && mouseX <= iconX + iconSize && mouseY >= iconY && mouseY <= iconY + iconSize;
    int iconColor = isHovered ? 0xFF555555 : 0xFF222222;

    guiGraphics.fill(iconX,iconY,iconX +iconSize,iconY +iconSize,iconColor);

    guiGraphics.renderOutline(iconX,iconY,iconSize,iconSize,0xffffffff);
    if(isHovered) {
        guiGraphics.renderTooltip(this.font, Component.literal("Слепота"), mouseX, mouseY);

    }


    super.render(guiGraphics, mouseX, mouseY, partialTick);
}

@Override
public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
    if (keyCode == GLFW.GLFW_KEY_ESCAPE || keyCode == GLFW.GLFW_KEY_Y) {
        this.minecraft.setScreen(null);
        return true;

    }
    return super.keyPressed(keyCode, scanCode, modifiers);
    }

}



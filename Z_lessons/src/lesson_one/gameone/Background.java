package lesson_one.gameone;

import lesson_one.common.GameCanvas;
import lesson_one.common.GameObject;

import java.awt.*;

public class Background implements GameObject {

    private float time;
    private static final float AMPLITUDE = 255f / 2f;
    private Color color;

    @Override
    public void render(GameCanvas gameCanvas, Graphics g) {
        gameCanvas.setBackground(color);
    }

    @Override
    public void update(GameCanvas gameCanvas, float deltaTime) {
        time += deltaTime;
        int red = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time));
        int green = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time * 2f));
        int blue = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time * 3f));
        color = new Color(red, green, blue);
    }
}

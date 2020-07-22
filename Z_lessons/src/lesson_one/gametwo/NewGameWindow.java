package lesson_one.gametwo;

import lesson_one.common.CanvasListener;
import lesson_one.common.GameCanvas;
import lesson_one.common.GameObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NewGameWindow extends JFrame implements CanvasListener {
    private static final int POS_X = 600;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    GameObject[] gameObjects = new GameObject[1];
    private int gameObjectsCount;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewGameWindow();
            }
        });
    }

    private NewGameWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(POS_X, POS_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setResizable(false);
        setTitle("Circles");
        GameCanvas gameCanvas = new GameCanvas(this);

//        gameCanvas.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                if (e.getButton() == MouseEvent.BUTTON1)
//                    addSprite(new Brick(e.getX(), e.getY()));
//                else if (e.getButton() == MouseEvent.BUTTON3)
//                    removeSprite();
//            }
//        });
        add(gameCanvas);
        initGame();
        setVisible(true);
    }

    private void addSprite(GameObject gameObject) {
        if (gameObjectsCount == gameObjects.length) {
            GameObject[] newGameObjects = new GameObject[gameObjects.length * 2];
            System.arraycopy(gameObjects, 0, newGameObjects, 0, gameObjects.length);
            this.gameObjects = newGameObjects;
        }
        gameObjects[gameObjectsCount] = gameObject;
        gameObjectsCount++;
    }

    private void removeSprite() {
        if (gameObjectsCount > 1)
            gameObjectsCount--;
    }

    private void initGame() {
        addSprite(new Brick());
    }

    @Override
    public void onDrawFrame(GameCanvas gameCanvas, Graphics g, float deltaTime) {
        update(gameCanvas, deltaTime);
        render(gameCanvas, g);
    }

    private void update(GameCanvas gameCanvas, float deltaTime) {
        for (int i = 0; i < gameObjectsCount; i++) {
            gameObjects[i].update(gameCanvas, deltaTime);
        }
    }

    private void render(GameCanvas gameCanvas, Graphics g) {
        for (int i = 0; i < gameObjectsCount; i++) {
            gameObjects[i].render(gameCanvas, g);
        }
    }

}
//21:50
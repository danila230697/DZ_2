package lesson_one.gameone;

import lesson_one.common.CanvasListener;
import lesson_one.common.GameCanvas;
import lesson_one.common.GameObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainWindow extends JFrame implements CanvasListener,
                                                    MouseListener {
    private static final int POS_X = 600;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    GameObject[] gameObjects = new GameObject[1];
    private int gameObjectsCount;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainWindow());
    }

    private MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(POS_X, POS_Y);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setResizable(false);
        setTitle("Circles");
        GameCanvas gameCanvas = new GameCanvas(this);
        gameCanvas.addMouseListener(this);
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
        addSprite(new Background());
        addSprite(new Ball());
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

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1)
            addSprite(new Ball(e.getX(), e.getY()));
        else if (e.getButton() == MouseEvent.BUTTON3)
            removeSprite();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

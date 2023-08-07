package Window;

import java.util.Random;

public class Food {
    private int posX;
    private int posY;

    public Food(int width, int height) {
        generatePos(width, height);
    }

    private void generatePos(int width, int height) {
        Random random = new Random();
        posX = random.nextInt(width / SnakePanel.TICK) * SnakePanel.TICK;
        posY = random.nextInt(height / SnakePanel.TICK) * SnakePanel.TICK;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}

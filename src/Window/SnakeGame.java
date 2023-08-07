package Window;

import java.awt.Dimension;
import Window.SnakePanel;

import javax.swing.JFrame;

public class SnakeGame extends JFrame{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 800;
	
	public SnakeGame() {
		
		this.add(new SnakePanel());
		setSize(HEIGHT, WIDTH);
		setTitle("Snake Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		this.setResizable(false);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new SnakeGame();
	}
	
}

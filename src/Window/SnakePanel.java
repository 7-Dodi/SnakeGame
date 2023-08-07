package Window;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.Border;

public class SnakePanel extends JPanel implements ActionListener {
	public static final int WIDTH = 800;
	public static final int HEIGHT = 800;
	public static final int TICK = 50;
	private static final int BORD = (WIDTH * HEIGHT) / (TICK * TICK);
	private final Timer time = new Timer (150, this); 
	private final Font font = new Font("TimesRoman", Font.BOLD, 30); 
	
	Food food;
	int eatFood = 0;
	
	int[] positionX = new int [BORD];
	int[] positionY = new int [BORD];
	int sankeLength;
	char direction = 'R';
	boolean isMoviment = false;
	
	public SnakePanel() {
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.WHITE);
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(isMoviment) {
					switch (e.getKeyCode()) {
						case KeyEvent.VK_LEFT:
							if(direction != 'R') {
								direction = 'L';
							}
						break;
						case KeyEvent.VK_RIGHT:
							if(direction != 'L') {
								direction = 'R';
							}
						break;
						case KeyEvent.VK_DOWN:
							if(direction != 'U') {
								direction = 'D';
							}
						break;
						case KeyEvent.VK_UP:
							if(direction != 'D') {
								direction = 'U';
							}
						break;
					}
				}else {
					start();
				}
			}});
		

		start();
	}
	
	public void start() {
		positionX = new int[BORD];
		positionY = new int [BORD];
		
		sankeLength = 5;
		direction = 'R';
		isMoviment = true;
		spawnFood();
		time.start();
	}
	
	public void spawnFood() {
		food = new Food(WIDTH, HEIGHT);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if(isMoviment) {
			g.setColor(Color.RED);
			g.fillOval(food.getPosX(), food.getPosY(), TICK, TICK );
			
			g.setColor(Color.DARK_GRAY);
			for(int i = 0; i < sankeLength; i ++) {
				g.fillRect(positionX[i], positionY[i], TICK, TICK);
			}
		}else {
			String score = String.format("Score: %d... Press any key to play again!", eatFood);
			g.setColor(Color.BLACK);
			g.setFont(font);
			g.drawString(score, 100, HEIGHT/2);
		}
	}
	
	public void eatFood() {
		if((positionX[0] == food.getPosX()) && (positionY[0] == food.getPosY())) {
			sankeLength++;
			eatFood++;
			spawnFood();
		}
	}
	
	public void move() {
	    for (int k = sankeLength - 1; k > 0; k--) {
	        positionX[k] = positionX[k - 1];
	        positionY[k] = positionY[k - 1];
	    }

	    switch (direction) {
	        case 'U' -> positionY[0] -= TICK;
	        case 'D' -> positionY[0] += TICK;
	        case 'L' -> positionX[0] -= TICK;
	        case 'R' -> positionX[0] += TICK;
	    }
	}
	
	public void collision() {
		for(int  k = sankeLength; k > 0; k--) {
			if((positionX[0] == positionX[k]) && (positionY[0] == positionY[k])) {
				isMoviment = false;
				break;
			}
			
			if(positionX[0] < 0 || positionX[0] > WIDTH - TICK || positionY[0] < 0 || positionY[0] > HEIGHT - TICK) {
				isMoviment = false;
			}
			
			if(!isMoviment) {
				time.stop();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(isMoviment) {
			move();
			collision();
			eatFood();
		}
		repaint();
	}
	
}

package jpu2016.dogfight.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;

@SuppressWarnings({ "serial", "deprecation" })
public class GameFrame extends JFrame implements KeyListener {
	private IEventPerformer eventPerformer;
	private GamePanel gamePanel;

	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable) {
		this.setTitle(title);
		this.setLocationRelativeTo(null);
		this.eventPerformer = performer;
		this.gamePanel = new GamePanel(graphicBuilder);
		this.setContentPane(this.gamePanel);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void keyPressed(KeyEvent keyEvent) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent keyEvent) {
		eventPerformer.eventPerform(keyEvent);
	}

}
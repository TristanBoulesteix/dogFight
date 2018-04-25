package jpu2016.dogfight.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

@SuppressWarnings({ "deprecation", "serial" })
public class GamePanel extends JPanel implements Observer {
	private IGraphicsBuilder graphicsBuilder;

	public GamePanel(IGraphicsBuilder graphicsBuilder) {
		this.graphicsBuilder = graphicsBuilder;

	}

	@Override
	public void paintComponent(Graphics graphics) {
		graphicsBuilder.applyModelToGraphic(graphics, this);
	}

	@Override
	public void update(Observable o, Object arg) {
		repaint();
	}

}

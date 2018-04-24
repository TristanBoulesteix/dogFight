package jpu2016.dogfight.gameframe;

import java.awt.Graphics;

import java.util.*;
import javax.swing.JPanel;



public class GamePanel extends JPanel implements Observer{
	private Object graphicsBuilder;
	
	public GamePanel(IGraphicsBuilder graphicBuilder) {
		this.graphicsBuilder = graphicsBuilder;
		
	}
	public void paintComponent(Graphics graphics) {
		
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	

}

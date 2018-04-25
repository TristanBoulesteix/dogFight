package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import jpu2016.dogfight.gameframe.IGraphicsBuilder;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;

public class GraphicsBuilder implements IGraphicsBuilder {
	private int GlobalWidth;
	private int GlobalHeight;
	private BufferedImage emptySky;
	private IDogfightModel dogfightModel;

	public GraphicsBuilder(IDogfightModel dogfightModel) {
		this.emptySky = new BufferedImage(0, 0, BufferedImage.TYPE_INT_RGB);
		this.dogfightModel = dogfightModel;

	}

	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {

	}

	private void buildEmptySky() {

	}

	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer) {

	}

	public int getGlobalWidth() {
		return GlobalWidth;
	}

	public int getGlobalHeight() {
		return GlobalHeight;
	}

}

package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

import jpu2016.dogfight.gameframe.IGraphicsBuilder;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;

public class GraphicsBuilder implements IGraphicsBuilder {
	private int GlobalWidth;
	private int GlobalHeight;
	private BufferedImage emptySky;
	private IDogfightModel dogfightModel;

	public GraphicsBuilder(IDogfightModel dogfightModel) {
		buildEmptySky();
		this.dogfightModel = dogfightModel;

	}

	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {
		ArrayList<IMobile> listOfMobiles = this.dogfightModel.getMobiles();

		for (int i = 0; i < listOfMobiles.size(); i++) {
			IMobile mobile = listOfMobiles.get(i);

			drawMobile(mobile, graphics, observer);
		}
	}

	private void buildEmptySky() {
		this.emptySky = new BufferedImage(dogfightModel.getArea().getDimension().getWidth(),
				dogfightModel.getArea().getDimension().getHeight(), BufferedImage.TYPE_INT_RGB);

		Graphics g = emptySky.getGraphics();

		// g.drawImage(dogfightModel.getArea().getImage(),
		// dogfightModel.getArea().getDimension().getWidth(),
		// dogfightModel.getArea().getDimension().getWidth(), observer);

	}

	private void drawMobile(final IMobile mobile, final Graphics graphics, final ImageObserver observer) {
		final BufferedImage imageMobile = new BufferedImage(mobile.getWidth(), mobile.getHeight(),
				Transparency.TRANSLUCENT);
		final Graphics graphicsMobile = imageMobile.getGraphics();

		graphicsMobile.drawImage(mobile.getImage(), 0, 0, mobile.getWidth(), mobile.getHeight(), observer);
		graphics.drawImage(imageMobile, (int) mobile.getPosition().getX(), (int) mobile.getPosition().getY(), observer);

		final boolean isHorizontalOut = (mobile.getPosition().getX() + mobile.getWidth()) > this.dogfightModel.getArea()
				.getDimension().getWidth();
		final boolean isVerticalOut = (mobile.getPosition().getY() + mobile.getHeight()) > this.dogfightModel.getArea()
				.getDimension().getHeight();

		if (isHorizontalOut) {
			final BufferedImage imageMobileH = imageMobile.getSubimage(
					(int) (this.dogfightModel.getArea().getDimension().getWidth() - mobile.getPosition().getX()), 0,
					(int) ((mobile.getWidth() - this.dogfightModel.getArea().getDimension().getWidth())
							+ mobile.getPosition().getX()),
					mobile.getHeight());
			graphics.drawImage(imageMobileH, 0, (int) mobile.getPosition().getY(), observer);
		}

		if (isVerticalOut) {
			final BufferedImage imageMobileV = imageMobile.getSubimage(0,
					(int) (this.dogfightModel.getArea().getDimension().getHeight() - mobile.getPosition().getY()),
					mobile.getWidth(),
					(int) (mobile.getHeight() - this.dogfightModel.getArea().getDimension().getHeight())
							+ (int) mobile.getPosition().getY());
			graphics.drawImage(imageMobileV, (int) mobile.getPosition().getX(), 0, observer);
		}

		if (isHorizontalOut && isVerticalOut) {
			final BufferedImage imageMobileHV = imageMobile.getSubimage(
					this.dogfightModel.getArea().getDimension().getWidth() - (int) mobile.getPosition().getX(),
					(int) (this.dogfightModel.getArea().getDimension().getHeight() - mobile.getPosition().getY()),
					(mobile.getWidth() - this.dogfightModel.getArea().getDimension().getWidth())
							+ (int) mobile.getPosition().getX(),
					(mobile.getHeight() - this.dogfightModel.getArea().getDimension().getHeight())
							+ (int) mobile.getPosition().getY());
			graphics.drawImage(imageMobileHV, 0, 0, observer);

		}

	}

	public int getGlobalWidth() {
		return GlobalWidth;
	}

	public int getGlobalHeight() {
		return GlobalHeight;
	}

}

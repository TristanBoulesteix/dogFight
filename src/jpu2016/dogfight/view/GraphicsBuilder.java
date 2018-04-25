package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.Transparency;
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

	private void drawMobile(final IMobile mobile, final Graphics graphics, final ImageObserver observer) {
		final BufferedImage imageMobile = new BufferedImage(mobile.getWidth(), mobile.getHeight(),
				Transparency.TRANSLUCENT);
		final Graphics graphicsMobile = imageMobile.getGraphics();

		graphicsMobile.drawImage(mobile.getImage(), 0, 0, mobile.getWidth(), mobile.getHeight(), observer);
		graphics.drawImage(imageMobile, (int) mobile.getPosition().getX(), (int) mobile.getPosition().getY(), observer);

		final boolean isHorizontalOut = (mobile.getPosition().getX() + mobile.getWidth()) > this.dogfightModel.getArea()
				.getWidth();
		final boolean isVerticalOut = (mobile.getPosition().getY() + mobile.getHeight()) > this.dogfightModel.getArea()
				.getHeight();

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

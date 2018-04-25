package jpu2016.dogfight.model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sky implements IArea {
	private Dimension dimension;
	private Image image;

	public Sky(Dimension dimension) {
		this.dimension = dimension;
		try {
			image = ImageIO.read(new File("pictures/Sky.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Dimension getDimension() {
		return this.dimension;
	}

	@Override
	public Image getImage() {
		return image;
	}
}

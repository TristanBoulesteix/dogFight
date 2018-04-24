package jpu2016.dogfight.model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

//Comment
public class Sky implements IArea {

	public Sky(Dimension dimension) {

	}

	@Override
	public Dimension getDimension() {
		return new Dimension(1, 1);
	}

	@Override
	public Image getImage() {
		return new Image() {

			@Override
			public int getWidth(ImageObserver observer) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ImageProducer getSource() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object getProperty(String name, ImageObserver observer) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int getHeight(ImageObserver observer) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public Graphics getGraphics() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}

package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Mobile {
	private Direction direction;
	private Position position;
	private Dimension dimension;
	private int speed;
	private String image;
	private int height;

	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		this.direction = direction;
		this.position = position;
		this.dimension = dimension;
		this.speed = speed;
		this.image = image;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Point getPosition() {
		return new Point();
	}

	public Dimension getDimension() {
		return dimension;
	}

	public int getSpeed() {
		return this.speed;
	}

	public int getWidth() {
		return dimension.getWidth();
	}

	public int getHeight() {
		return dimension.getHeight();
	}

	public void move() {

	}

	public void placeInArea(IArea area) {

	}

	public boolean isPlayer(int player) {
		return true;
	}

	private void moveUp() {

	}

	private void moveRight() {

	}

	private void moveDown() {

	}

	private void moveLeft() {

	}

	public Color getColor() {
		return new Color(1, 1, 1);
	}

	public IDogfightModel getDogfightModel() {
		return new DogfightModel();
	}

	public void setDogfightModel(IDogfightModel dogfightModel) {

	}

	public boolean hit() {
		return true;
	}

	public boolean isWeapon() {
		return true;
	}

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

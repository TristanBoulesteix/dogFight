package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;

public class Mobile {
	private Direction direction;
	private Position position;
	private Dimension dimension;
	private int speed;
	private String image;
	private IDogfightModel dogfightModel;

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

	public Position getPosition() {
		return position;
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
		switch (direction) {
		case UP:
			this.moveUp();
			break;

		case DOWN:
			this.moveDown();
			break;

		case RIGHT:
			this.moveRight();
			break;

		case LEFT:
			this.moveLeft();
			break;
		}

		this.getDogfightModel().setMobilesHaveMoved();
	}

	public void placeInArea(IArea area) {

	}

	public boolean isPlayer(int player) {
		return false;
	}

	private void moveUp() {
		if (this.getPosition().getY() + 1 != this.getPosition().getMaxY()) {
			this.getPosition().setY(this.getPosition().getY() + 1);
		}
	}

	private void moveRight() {
		if (this.getPosition().getX() + 1 != this.getPosition().getMaxX()) {
			this.getPosition().setX(this.getPosition().getX() + 1);
		}
	}

	private void moveDown() {
		if (this.getPosition().getY() - 1 >= 0) {
			this.getPosition().setY(this.getPosition().getY() - 1);
		}
	}

	private void moveLeft() {
		if (this.getPosition().getX() - 1 >= 0) {
			this.getPosition().setX(this.getPosition().getX() - 1);
		}
	}

	public Color getColor() {
		return new Color(1, 1, 1);
	}

	public IDogfightModel getDogfightModel() {
		return dogfightModel;
	}

	public void setDogfightModel(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
		this.getPosition().setMaxX(this.dogfightModel.getArea().getDimension().getWidth());
		this.getPosition().setMaxY(this.dogfightModel.getArea().getDimension().getHeight());
	}

	public boolean hit() {
		return false;
	}

	public boolean isWeapon() {
		return true;
	}

	public Image getImage() {
		return null;
	}

}

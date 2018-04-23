package dogfight.model;

import java.awt.Color;
import java.awt.Dimension;

public class Mobile {
	private int speed;

	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		this.speed = speed;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {

	}

	public Point getPosition() {

	}

	public Dimension getDimension() {

	}

	public int getSpeed() {

	}

	public int getWidth() {

	}

	public int getHeight() {

	}

	public void move() {

	}

	public void placeInArea(IArea area) {

	}

	public boolean isPlayer(int player) {

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

	}

	@Override
	public IDogfightModel getDogfightModel() {

	}

	@Override
	public void setDogfightModel(IDogfightModel dogfightModel) {

	}

	@Override
	public boolean hit() {

	}

	@Override
	public boolean isWeapon() {

	}

	@Override
	public Image getImage() {

	}

	public void setDogfightModel(DogfightModel dogfightModel) {

	}
}
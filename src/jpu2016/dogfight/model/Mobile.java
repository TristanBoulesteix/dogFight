package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;

public class Mobile implements IMobile {
	private int speed;

	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		this.speed = speed;
	}

	@Override
	public Direction getDirection() {
		return direction;
	}

	@Override
	public void setDirection(Direction direction) {

	}

	@Override
	public Point getPosition() {

	}

	@Override
	public Dimension getDimension() {

	}

	@Override
	public int getSpeed() {

	}

	@Override
	public int getWidth() {

	}

	@Override
	public int getHeight() {

	}

	@Override
	public void move() {

	}

	@Override
	public void placeInArea(IArea area) {

	}

	@Override
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

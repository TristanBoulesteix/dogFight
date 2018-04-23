package jpu2016.dogfight.model;

public class Missile extends Mobile {
	private final int SPEED = 4;
	private final int WIDTH = 20;
	private final int HEIGHT = 10;
	private final int MAX_DISTANCE_TRAVELED = 1400;
	private final String IMAGE = "missile";

	private int distanceTraveled = 0;

	public Missile(Direction direction, Dimension dimension) {
		super(direction, position, dimension, speed, image);
	}

	public final int getWidthWithADirection(Direction direction) {

	}

	public final int getHeightWithADirection(Direction direction) {

	}

	@Override
	public void move() {

	}

	@Override
	public boolean isWeapon() {
		return super.isWeapon();
	}

}

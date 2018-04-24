package jpu2016.dogfight.model;

public class Missile extends Mobile {
	private final static int SPEED = 4;
	private final static int WIDTH = 30;
	private final static int HEIGHT = 10;
	private final static int MAX_DISTANCE_TRAVELED = 1400;
	private final static String IMAGE = "missile";

	private int distanceTraveled = 0;

	public Missile(Direction direction, Dimension dimension, int speed) {
		super(direction, position, dimension, speed, IMAGE);
	}

	final public int getWidthWithADirection(Direction direction) {

	}

	final public int getHeightWithADirection(Direction direction) {

	}

	@Override
	public void move() {
		super.move();
	}

	@Override
	public boolean isWeapon() {
		return true;
	}

}

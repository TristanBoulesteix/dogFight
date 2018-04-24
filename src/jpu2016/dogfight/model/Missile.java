package jpu2016.dogfight.model;

public class Missile extends Mobile {
	private final static int SPEED = 4;
	private final static int WIDTH = 30;
	private final static int HEIGHT = 10;
	private final static int MAX_DISTANCE_TRAVELED = 1400;
	private final static String IMAGE = "missile";

	private int distanceTraveled = 0;

	public Missile(Direction direction, Position position) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);
	}

	final public int getWidthWithADirection(Direction direction) {
		if (direction.equals(Direction.UP) || direction.equals(Direction.DOWN)) {
			return WIDTH;
		} else {
			return HEIGHT;
		}
	}

	final public int getHeightWithADirection(Direction direction) {
		if (direction.equals(Direction.LEFT) || direction.equals(Direction.RIGHT)) {
			return HEIGHT;
		} else {
			return WIDTH;
		}
	}

	@Override
	public void move() {
		if (distanceTraveled < MAX_DISTANCE_TRAVELED) {
			super.move();
			distanceTraveled++;
		}

	}

	@Override
	public boolean isWeapon() {
		return true;
	}

}

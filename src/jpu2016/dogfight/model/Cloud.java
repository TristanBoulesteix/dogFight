package jpu2016.dogfight.model;

public class Cloud extends Mobile {
	private final static int SPEED = 1;
	private final static int WIDTH = 300;
	private final static int HEIGHT = 150;
	private final static String IMAGE = "cloud";

	public Cloud(Direction direction, Dimension dimension) {
		super(direction, new Position(0, 0, WIDTH, HEIGHT), dimension, SPEED, IMAGE);
	}

}

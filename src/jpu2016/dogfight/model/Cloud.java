package jpu2016.dogfight.model;

public class Cloud extends Mobile {
	private final int SPEED = 1;
	private final int WIDTH = 300;
	private final int HEIGHT = 150;
	private final String IMAGE = "cloud";

	public Cloud(Direction direction, Dimension dimension) {
		super(direction, position, dimension, speed, image);
	}

}

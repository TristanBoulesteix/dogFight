package jpu2016.dogfight.model;

public class Plane extends Mobile {
	private final int SPEED = 2;
	private final int WIDTH = 100;
	private final int HEIGHT = 20;

	private int player;

	public Plane(int player, Direction direction, Position position, Dimension dimension, String image) {
		super(direction, position, dimension, speed, image);

	}

	public boolean isPlayer(int player) {

	}

	public boolean hit() {

	}

}

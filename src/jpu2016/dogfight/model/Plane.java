package jpu2016.dogfight.model;

public class Plane extends Mobile {
	private final static int SPEED = 2;
	private final static int WIDTH = 30;
	private final static int HEIGHT = 10;

	private int player;

	public Plane(int player, Direction direction, Position position, String image) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, image);
		this.player = player;
	}

	@Override
	public boolean isPlayer(int player) {
		return true;
	}

	@Override
	public boolean hit() {
		return super.hit();
	}

}

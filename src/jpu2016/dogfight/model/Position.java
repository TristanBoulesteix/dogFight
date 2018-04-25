package jpu2016.dogfight.model;

public class Position {
	private double x;
	private double y;

	private double maxX;
	private double maxY;

	public Position(double x, double y, double maxX, double maxY) {
		setX(x);
		setY(y);
		setMaxX(maxX);
		setMaxY(maxY);
	}

	public Position(Position position) {
		setX(position.getX());
		setY(position.getY());
		setMaxX(position.getMaxX());
		setMaxY(position.getMaxY());
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x % this.getMaxX();
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y % this.getMaxY();
	}

	protected void setMaxX(double maxX) {
		this.maxX = maxX;
	}

	protected double getMaxX() {
		return maxX;
	}

	protected void setMaxY(double maxY) {
		this.maxY = maxY;
	}

	protected double getMaxY() {
		return maxY;
	}

}

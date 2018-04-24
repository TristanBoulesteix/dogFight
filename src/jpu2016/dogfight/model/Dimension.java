package jpu2016.dogfight.model;

public class Dimension {
	int width;
	int height;

	public Dimension(int width, int height) {
		setWidth(width);
		setHeight(height);
	}

	public Dimension(Dimension dimension) {
		setWidth(dimension.getWidth());
		setHeight(dimension.getHeight());
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}

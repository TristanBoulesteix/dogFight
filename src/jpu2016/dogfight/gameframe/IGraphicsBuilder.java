package dogfight.gameframe;

public interface IGraphicsBuilder {
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {
		
	}
	public int getGlobalWidth() {
		return GlobalWidth;
	}
	public int getGlobalHeight() {
		return GlobalHeight;
	}
}

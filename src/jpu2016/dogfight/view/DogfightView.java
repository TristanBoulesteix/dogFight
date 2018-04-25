package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.gameframe.GameFrame;
import jpu2016.dogfight.model.IDogfightModel;

public class DogfightView implements Runnable, IViewSystem {
	private EventPerformer eventPerformer;
	private GraphicsBuilder graphicsBuilder;
	private GameFrame gameFrame;

	@SuppressWarnings("deprecation")
	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {
		this.eventPerformer = new EventPerformer(orderPerformer);
		this.graphicsBuilder = new GraphicsBuilder(dogfightModel);
		this.gameFrame = new GameFrame("dogfight - The game", eventPerformer, graphicsBuilder, observable);
	}

	@Override
	public void run() {

	}

	public void closeAll() {

	}

	public String displayMessage(String message) {
		return message;
	}

}

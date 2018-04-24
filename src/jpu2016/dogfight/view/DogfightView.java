package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.gameframe.GameFrame;
import jpu2016.dogfight.model.IDogfightModel;

public class DogfightView extends Observable implements IViewSystem, Runnable {
	
	private EventPerformer 	myeventPerformer;
	private GraphicsBuilder mygraphicsBuilder;
	private GameFrame 		mygameFrame;
	
	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {
		this.myeventPerformer = new EventPerformer(orderPerformer);
		this.mygraphicsBuilder = new GraphicsBuilder(dogfightModel);
		this.mygameFrame = new GameFrame("SALUT", myeventPerformer, mygraphicsBuilder, observable);
		
	}
	
@Override
private void run() {
	
}

public void closeAll() {
	
}
public String displayMessage(String message) {
	// TODO Auto-generated method stub
	return null;
}

}

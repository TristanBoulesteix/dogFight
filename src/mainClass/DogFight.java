package mainClass;

import jpu2016.dogfight.view.DogfightView;
import jpu2016.dogfight.controller.DogfightController;
import jpu2016.dogfight.model.IDogfightModel;

public class DogFight {
	
		public static void main(String[] args) {
			final IDogfightModel dogfightModel = new IDogfightModel();
			final DogfightController dogfightController = new DogfightController(dogfightModel);
			final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel,dogfightModel);
			dogfightController.setViewSystem(dogfightView);
			dogfightController.play(); 

	}

}

package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.dogfight.model.Missile;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer {

	static private int TIME_SLEEP = 30;
	private IDogfightModel dogfightModel;
	private IViewSystem wiewSysteme;

	public DogfightController(IDogfightModel dogfightModel) {

		this.dogfightModel = dogfightModel;
	}

	public void orderPerform(UserOrder userOrder) {

	}

	public void play() {

	}

	public void setViewSystem(IViewSystem viewSystem) {

	}

	private void launchMissile(int player) {
		Missile missile = new Missile(null, null, player);

	}

	private void gameLoop() {

	}

	private boolean isWeaponOnMobile(final IMobile mobile, final IMobile weapon) {
		if (((weapon.getPosition().getX() / weapon.getWidth()) >= (mobile.getPosition().getX() / weapon.getWidth()))
				&& ((weapon.getPosition().getX()
						/ weapon.getWidth()) <= ((mobile.getPosition().getX() + mobile.getWidth())
								/ weapon.getWidth()))) {
			if (((weapon.getPosition().getY() / weapon.getHeight()) >= (mobile.getPosition().getY()
					/ weapon.getHeight()))
					&& ((weapon.getPosition().getY()
							/ weapon.getHeight()) <= ((mobile.getPosition().getY() + mobile.getHeight())
									/ weapon.getHeight()))) {
				return true;
			}
		}
		return false;
	}

}

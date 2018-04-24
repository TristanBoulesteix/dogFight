package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class DogfightModel extends Observable implements IDogfightModel {
	private Sky sky;
	private ArrayList<IMobile> mobiles;

	public DogfightModel() {
		buildArea(new Dimension(300, 500));
	}

	@Override
	public IArea getArea() {
		return null;
	}

	@Override
	public void buildArea(Dimension dimension) {
		sky = new Sky(dimension);
	}

	@Override
	public void addMobile(IMobile mobile) {
		mobiles.add(mobile);
	}

	@Override
	public void removeMobile(IMobile mobile) {
		mobiles.remove(mobile);
	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		return mobiles;
	}

	@Override
	public IMobile getMobileByPlayer(int player) {
		for (int i = 0; i < mobiles.size(); i++) {
			IMobile mobileOfPlayer = mobiles.get(i);

			if (mobileOfPlayer.isPlayer(player)) {
				return mobileOfPlayer;
			}
		}
		return null;

	}

	@Override
	public void setMobilesHaveMoved() {
		this.setChanged();
		this.notifyObservers(this);
	}

}

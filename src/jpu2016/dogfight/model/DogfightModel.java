package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class DogfightModel extends Observable implements IDogfightModel {

	public DogfightModel() {

	}

	@Override
	public IArea getArea() {
		return null;
	}

	@Override
	public void buildArea(Dimension dimension) {

	}

	@Override
	public void addMobile(IMobile mobile) {

	}

	@Override
	public void removeMobile(IMobile mobile) {

	}

	@Override
	public ArrayList<IMobile> getMobiles(int player) {
		return null;
	}

	@Override
	public IMobile getMobileByPlayer(int player) {
		return null;
	}

	@Override
	public void setMobilesHaveMoved() {

	}

}

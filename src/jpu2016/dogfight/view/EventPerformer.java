package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;

public class EventPerformer {
	public EventPerformer(IOrderPerformer orderPerformer) {

	}

	public void eventPerform(KeyEvent keyCode) {

	}

	private UserOrder keyCodeToUserOrder(int keyCode) {

		return new UserOrder(keyCode, null);
	}
}

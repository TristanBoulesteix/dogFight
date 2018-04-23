package jpu2016.dogfight.controller;

public class UserOrder {
	private int player;
	private Order order;
	
	public void UserOreder(int player, Order order ) {
		this.player = player;
		this.order = order;
	}
	
	public Order getOrder() {
		return order;
	}
	
	public int getPlayer() {
		return player;
		
	}
}

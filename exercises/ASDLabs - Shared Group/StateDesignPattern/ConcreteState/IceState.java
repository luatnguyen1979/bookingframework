package lesson12.StateDesignPattern.ConcreteState;

import lesson12.StateDesignPattern.state.State;

public class IceState implements State {

	@Override
	public void left() {
		System.out.println("1");
		
	}

	@Override
	public void accelerate() {
		System.out.println("3");
		
	}

	@Override
	public void right() {
		System.out.println("1");
		
	}

	@Override
	public void applyBreak() {
		System.out.println("2");
		
	}

}

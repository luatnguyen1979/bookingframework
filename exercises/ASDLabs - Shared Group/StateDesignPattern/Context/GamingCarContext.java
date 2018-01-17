package lesson12.StateDesignPattern.Context;

import lesson12.StateDesignPattern.ConcreteState.GravelState;
import lesson12.StateDesignPattern.ConcreteState.IceState;
import lesson12.StateDesignPattern.ConcreteState.RegularSate;
import lesson12.StateDesignPattern.ConcreteState.WetSate;
import lesson12.StateDesignPattern.state.State;

public class GamingCarContext implements State {
	
	private State regularState;
	private State gravelState;
	private State wetState;
	private State iceState;
	
	private State carState;
	
	public GamingCarContext(){
		
		regularState = new RegularSate();
		gravelState = new GravelState();
		wetState = new WetSate();
		iceState = new IceState();

	}
	
	public State getCarState() {
		return carState;
	}

	public void setCarState(State carState) {
		this.carState = carState;
	}

	@Override
	public void left() {
		this.regularState.left();
		this.gravelState.left();
		this.wetState.left();
		this.iceState.left();
	}


	@Override
	public void accelerate() {
		this.regularState.accelerate();
		this.gravelState.accelerate();
		this.wetState.accelerate();
		this.iceState.accelerate();
		
	}


	@Override
	public void right() {
		this.regularState.right();
		this.gravelState.right();
		this.wetState.right();
		this.iceState.right();
		
	}


	@Override
	public void applyBreak() {
		this.regularState.applyBreak();
		this.gravelState.applyBreak();
		this.wetState.applyBreak();
		this.iceState.applyBreak();
		
	}

	/*public State getRegularState() {
		return regularState;
	}

	public void setRegularState(State regularState) {
		this.regularState = regularState;
	}

	public State getGravelState() {
		return gravelState;
	}

	public void setGravelState(State gravelState) {
		this.gravelState = gravelState;
	}

	public State getWetState() {
		return wetState;
	}

	public void setWetState(State wetState) {
		this.wetState = wetState;
	}

	public State getIceState() {
		return iceState;
	}

	public void setIceState(State iceState) {
		this.iceState = iceState;
	}*/

}

package lesson12.StateDesignPattern;

import lesson12.StateDesignPattern.ConcreteState.GravelState;
import lesson12.StateDesignPattern.ConcreteState.IceState;
import lesson12.StateDesignPattern.ConcreteState.RegularSate;
import lesson12.StateDesignPattern.ConcreteState.WetSate;
import lesson12.StateDesignPattern.Context.GamingCarContext;
import lesson12.StateDesignPattern.state.State;

public class Main {

	public static void main(String[] args) {

		GamingCarContext context = new GamingCarContext();
		
		// State of Car 
		State regular = new RegularSate();
		State garvel = new GravelState();
		State ice = new IceState();
		State wet = new WetSate();
			
		// Set state to each Concrete State
		context.setCarState(regular);
		context.left();
		
		context.setCarState(garvel);
		context.right();
		
		context.setCarState(wet);
		context.accelerate();
		
		context.setCarState(ice);
		context.applyBreak();

	}

}

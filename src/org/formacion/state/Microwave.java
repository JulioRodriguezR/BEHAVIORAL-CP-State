package org.formacion.state;

public class Microwave {

	private State state = State.OFF;
	
	private enum State {
		OFF, OPEN_DOOR, MAX_POWER, MIN_POWER, WORKING
	}
	
//	Inverse way, 
//	I offer a function and I have to look for each of the states how I have to react 
	
	public void setMinPower() {
		switch (state) {
		case OFF:
		case MAX_POWER:
			state = State.MIN_POWER;
			System.out.println("min power");
			break;
		default:
			System.out.println("not working from " + state);
		}
	}
	
}

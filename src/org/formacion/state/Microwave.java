package org.formacion.state;

public class Microwave {
	
//	A more general implementation would use an object with a reference to the microwave for each state

	private State state = State.OFF;

	public void setMinPower() {
		state = state.setMinPower();
	}
	
	public void setMaxPower() {
		state = state.setMaxPower();
	}
	
	public void cooking() {
		state = state.cooking();
	}
	
	public void openDoor() {
		state = state.openDoor();
	}
	
	public void off() {
		state = state.off();
	}
	
	public void on() {
		state = state.on();
	}
}

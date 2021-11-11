package org.formacion.state;

public enum State {
	
//	By default it does not accept transitions
//	Each transition performs an action returning the state
	
	OFF {
//		Each state implements only what interests it
		public State setMinPower() {
			System.out.println("min power OK");
			return State.MIN_POWER;
		}
		
		public State setMaxPower() {
			System.out.println("max power OK");
			return State.MAX_POWER;
		}
		
		public State openDoor() {
			System.out.println("opening door");
			return State.OPEN_DOOR;
		}
	}, 
	OPEN_DOOR {
		public State off() {
			System.out.println("off machine");
			return State.OFF;
		}
	}, 
	MAX_POWER {
		public State setMinPower() {
			System.out.println("min power OK");
			return State.MIN_POWER;
		}
		
		public State openDoor() {
			System.out.println("opening door");
			return State.OPEN_DOOR;
		}
		
		public State cooking() {
			System.out.println("cooking food");
			return State.COOKING;
		}
	}, 
	MIN_POWER {
		public State setMaxPower() {
			System.out.println("max power OK");
			return State.MAX_POWER;
		}
		
		public State cooking() {
			System.out.println("cooking food");
			return State.COOKING;
		}
		
		public State openDoor() {
			System.out.println("opening door");
			return State.OPEN_DOOR;
		}
		
	}, 
	COOKING {
		public State off() {
			System.out.println("off machine");
			return State.OFF;
		}
	};
	
	public State setMinPower() {
		System.out.println("No not allowed from " + this);
		return this;
	}
	
	public State setMaxPower() {
		System.out.println("No not allowed from " + this);
		return this;
	}
	
	public State cooking() {
		System.out.println("No not allowed from " + this);
		return this;
	}
	
	public State openDoor() {
		System.out.println("No not allowed from " + this);
		return this;
	}
	
	public State on() {
		System.out.println("No not allowed from " + this);
		return this;
	}
	
	public State off() {
		System.out.println("No not allowed from " + this);
		return this;
	}

}

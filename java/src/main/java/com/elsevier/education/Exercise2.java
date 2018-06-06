package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

    public interface IEngine {
        public void spinWheels();
    }

	public static class Car {
		private IEngine engine;

		public Car(IEngine engine) {
            this.engine = engine;
		}

		public void moveForward() {
			engine.spinWheels();
		}
	}

	public static class GasEngine implements IEngine {
		public void spinWheels() {
			// no-op for now
		}
	}

    public static class ElectricEngine implements IEngine {
		public void spinWheels() {
			// no-op for now
		}
	}
}

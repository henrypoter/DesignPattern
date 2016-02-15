package pockbox.designpattern.bridge15;

public class Jeep extends Car {

	public Jeep(Engine engine) {
		super(engine);
	}

	public void installEngine() {
		System.out.print("Jeep£º");
		this.getEngine().installEngine();
	}

}

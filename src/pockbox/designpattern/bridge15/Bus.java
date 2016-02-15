package pockbox.designpattern.bridge15;

public class Bus extends Car{

	public Bus(Engine engine) {
		super(engine);
	}

	public void installEngine() {
		System.out.print("Bus��");
		this.getEngine().installEngine();
	}
}

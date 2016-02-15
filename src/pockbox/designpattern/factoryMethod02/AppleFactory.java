package pockbox.designpattern.factoryMethod02;


public class AppleFactory implements FruitFactory {

	public Fruit getFruit() {
		return new Apple();
	}

}

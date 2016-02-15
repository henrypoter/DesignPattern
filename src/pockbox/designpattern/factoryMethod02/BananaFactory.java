package pockbox.designpattern.factoryMethod02;


public class BananaFactory implements FruitFactory {

	public Fruit getFruit() {
		return new Banana();
	}

}

package pockbox.designpattern.simpleFactory01;


public class MainClass {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//		//ÊµÀý»¯Ò»¸öApple
//		Apple apple = new Apple();
//		//ÊµÀý»¯Ò»¸öBanana
//		Banana banana = new Banana();
//		
//		apple.get();
//		banana.get();
		
//		//ÊµÀý»¯Ò»¸öApple,ÓÃµ½ÁË¶àÌ¬
//		Fruit apple = new Apple();
//		Fruit banana = new Banana();
//		apple.get();
//		banana.get();
		
//		//ÊµÀý»¯Ò»¸öApple
//		Fruit apple = FruitFactory.getApple();
//		Fruit banana = FruitFactory.getBanana();
//		apple.get();
//		banana.get();
		
		Fruit apple = FruitFactory.getFruit("Apple");
		Fruit banana = FruitFactory.getFruit("Banana");
		apple.get();
		banana.get();
		
	}
}

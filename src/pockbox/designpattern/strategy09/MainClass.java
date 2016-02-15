package pockbox.designpattern.strategy09;

public class MainClass {
	public static void main(String[] args) {
		double num = 200;
		Context context = new Context(new StrategyB());
		double newNum = context.cost(num);
		System.out.println("Êµ¼Ê¸¶ÕË" + newNum + "Ôª");
	}
}

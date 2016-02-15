package pockbox.designpattern.state23;

public class SState extends State {

	public void doSomething(Person person) {
		if(person.getHour() == 18) {
			System.out.println("����");
		} else {
			person.setState(new NoState());
			person.doSomething();
		}
	}

}

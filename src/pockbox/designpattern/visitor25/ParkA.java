package pockbox.designpattern.visitor25;

/*
 * ��԰��A����
 */
public class ParkA implements ParkElement {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}

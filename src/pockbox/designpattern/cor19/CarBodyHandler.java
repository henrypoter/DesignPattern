package pockbox.designpattern.cor19;

public class CarBodyHandler extends CarHandler {

	public void HandlerCar() {
		System.out.println("��װ����");
		if(this.carHandler != null) {
			this.carHandler.HandlerCar();
		}
	}

}

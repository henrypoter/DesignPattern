package pockbox.designpattern.builder07;


public class HouseDirector {	
	
	public void makeHouse(HouseBuilder builder) {
		builder.makeFloor();
		builder.makeWall();
		builder.makeHousetop();
	}
	
}

package pockbox.designpattern.builder07;

/*
 * ¹¤³Ì¶Ó
 */
public interface HouseBuilder {
	//ÐÞµØ°å
	public void makeFloor();
	//ÐÞÇ½
	public void makeWall();
	//ÐÞÎÝ¶¥
	public void makeHousetop();
	public House getHouse();
}

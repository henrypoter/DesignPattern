package pockbox.designpattern.obServer10;

public class MainClass {
	public static void main(String[] args) {
		BlogUser user = new BlogUser();
		user.addObserver(new MyObServer());
		user.publishBlog("����������������", "��Ҷ�������");
	}
}

package kh.java.oop.access.modifier.field;

public class KiwiRun {

	
	public static void main(String[] args) {
		
		Kiwi kw = new Kiwi();
		System.out.println(kw.publicNum);
		System.out.println(kw.protectedNum);
		System.out.println(kw.defaultNum);
//		System.out.println(kw.privateNum); //다른 클래스라서 접근할 수 없다.
	}
}

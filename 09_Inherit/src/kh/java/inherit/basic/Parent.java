package kh.java.inherit.basic;

/**
 * 
 * 상속 Inheritance
 * 부모 클래스가 가지고 있는 member변수/메소드를 자식클래스에서 선언하지 않고 
 * 사용할 수 있게 하는 것.
 * 
 *  -public class 자식클래스 extends 부모클래스 {} : 확장하다.
 *  
 *  
 *  이점
 *  -중복을 제거해서 효율적으로 코드롤 관리할 수 있다.
 *  -공통적인 코드를 부모클래스에서 관리할 수 있다.
 *  
 *  
 *  특징
 *  1. 부모클래스의 필드/메소드는 자식클래스에서 선언없이 접근가능
 *  2. 모든 클래스의 최상위 부모클래스는 Object.
 *  		-아무 클래스도 상속하지 않았다면 extends Object가 생략된 것
 *  		-Object의 메소드를 모든 클래스에서 사용가능. ToString, hashcode, equals
 *  3. 부모클래스의 생성자, 초기화블럭은 상속이 안된다.
 *  	-부모클래스 생성자 호출 super()
 *  4. 부모클래스의 메소드는 자식클래스에서 재작성해서 사용할 수 있다.(override)
 *  5. 부모클래스의 private필드/메소드는 상속은 되지만, 직접 접근할 수 없다.
 *  	-getter/setter를 이용하기
 *  	-값대입시에 부모생성자super를 호출해서 부모클래스안에서 값대입.(이걸 더 많이 쓴다)
 *   
 */
public class Parent extends Object{//extends Object는 숨겨져 있다.

	
	String name;
	int age;
	
	public Parent() {
		System.out.println("Paernt 부모클래스 생성자 호출!");
		
	}
	
	public void say() {
		System.out.println("제가 애빕니다.");
	}
	
	public void printInfo() {
		System.out.println(name + "," + age);
	}
	
	public void game() {
		System.out.println("첫째가 게임을 합니다.");
	}
}

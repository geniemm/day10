package dto;
/*
 TestClass
 - 데이터를 저장 및 연산
 */
public class TestClass01 { 
	private String name;
	private int k,e,sum; // class 바로아래에 변수를 생성하면 자동적으로 초기화가됨
	public TestClass01() {
		System.out.println(name);
		System.out.println(sum);
		System.out.println("기본 생성자 실행");
	}
	public void display() {
		name = "홍길동";
		k =100; e=100; sum=k+e;
		System.out.println(name);
		System.out.println(sum);
	}
	//setter,getter 만들어서 사용할수도 있다.
	public String getName() {
		return name;
	}
}

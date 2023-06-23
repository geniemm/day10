package dto;
/* 
 	컨트롤러 역할을 하며 데이터에 직접 접근하지 않는다.
 	데이터에 접근하고자 하는 경우 TestClass02를 통해서 접근
 	TestClass는 service를 담당하며 service역할은 연산 담당
 */
public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t = new TestClass02();
		t.display();
	}
}

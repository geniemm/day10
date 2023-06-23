package constructor;

class TestClass03{
	public TestClass03(String msg, int num) {
		System.out.println(msg);
		System.out.println(num);
	}
	
	public TestClass03() {
		// 기본생성자 무조건 만들어놓고s
		System.out.println("기본 생성자 실행");
	}
}
public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03("안녕",100);
		TestClass03 t2 = new TestClass03();
	}
}

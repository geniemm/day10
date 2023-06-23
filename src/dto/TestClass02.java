package dto;

import java.util.Scanner;

/* 기본 출력 및 연산 담당 */
public class TestClass02 {
	private TestDTO02 member;
	public TestClass02() {
		System.out.println("기본 생성자 실행");
		member = new TestDTO02();
	}
	public void display() {
		Scanner sc =new Scanner(System.in);
		System.out.println(member);
		System.out.println("사용자로부터 모든 값 입력 받았다.");
		String n = "홍길동";
		int kor = 100,eng =100,sum=kor+eng;
		
		member.setE(eng);  member.setK(kor);
		member.setName(n); member.setSum(sum);
		
		while(true) {
			System.out.println("1. 모든 내용 출력");
			System.out.println("2. 이름만 수정");
			System.out.print(">>> ");
			int num = sc.nextInt();
			switch(num) {
			case 1: 
				System.out.println("이름: "+member.getName());
				System.out.println("합계: "+member.getSum());
				break;
			case 2: 
				System.out.println("이름: "+member.getName());
				System.out.print("수정할 이름 입력: ");
				n = sc.next();
				member.setName(n);
				System.out.println("수정한 이름: "+member.getName());
				break;
			}
		}
//		member.setName("홍길동");
//		System.out.println(member.getName());
	}
}






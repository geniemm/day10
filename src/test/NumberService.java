package test;


import java.util.Scanner;

public class NumberService {
	String inputName= null;
	String inputNumber = null;
	private NumberDTO tel;

	public NumberService() {
		// System.out.println("기본생성자");
		tel = new NumberDTO();

	}

	public void display() {

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("[1] 전화번호 등록");
			System.out.println("[2] 전화번호 보기");
			System.out.println("[3] 정보 수정");
			System.out.println("[4] 전화번호 삭제");
			System.out.print(">>> ");
			int num = sc.nextInt();

			switch (num) {
			case 1:

				System.out.print("등록할 전화번호 입력: ");
				inputNumber = sc.next();
			
				if (inputNumber.equals(tel.getNumber())) {
					System.out.println("이미 등록된 번호입니다.");
					
				} else {
					System.out.print("등록할 이름 입력: ");
					inputName = sc.next();
					tel.setNumber(inputNumber);
					tel.setName(inputName);
					

					System.out.println("= 등록 완료 =");

				}
				break;
			case 2:

				System.out.println("이름 : " + tel.getName());
				System.out.println("전화번호 : " + tel.getNumber());

				break;

			case 3:

				System.out.println("수정할 정보");
				System.out.println("1.이름 수정");
				System.out.println("2.전화번호 수정");
				System.out.print(">>> ");
				int num1 = sc.nextInt();

				if (num1 == 1) {
					if (tel.getName().equals(inputName)) {
						System.out.print("이름 수정: ");
						inputName = sc.next();
						System.out.println(tel.getName() + "을 " + inputName + "로 변경");
						tel.setName(inputName);
						break;
					}
				} else if (num1 == 2) {
					if	(tel.getNumber().equals(inputNumber)) {
						System.out.print("전화번호 수정: ");
						inputNumber = sc.next();
						System.out.println(tel.getNumber() + "을 " + inputNumber + "로 변경");
						tel.setNumber(inputNumber);
						break;
					} else {
						System.out.println("잘못입력");
						break;
					}
				}

			case 4:
				if (tel.getName() == null) {
					System.out.println("등록 먼저 하세요");
				} else {
					tel.setName(null);
					tel.setNumber(null);
					System.out.println("삭제 성공");
				}
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
	}

}

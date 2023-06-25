package test;

import java.util.ArrayList;
import java.util.Scanner;

public class TeleService {
	Scanner sc = new Scanner(System.in);
	String number, name;
	private NumberDTO tel;

	public TeleService() {
		tel = new NumberDTO();
	}

	public void display() {
		while (true) {
			System.out.println("[1] 전화번호 등록");
			System.out.println("[2] 전화번호 보기");
			System.out.println("[3] 정보 수정");
			System.out.println("[4] 전화번호 삭제");
			System.out.print(">>> ");
			int num = sc.nextInt();

			ArrayList<String> na =new ArrayList<>();
			ArrayList<String> ban  =new ArrayList<>();
			

			switch (num) {
			case 1:
				System.out.print("등록할 전화번호 입력: ");
				number=sc.next();
				if(ban.contains(number)) {
					System.out.println("이미 등록된 번호");
				}
				else {
					ban.add(number);
					tel.setNumber(number);
					System.out.println("등록할 이름 입력: ");
					name=sc.next();
					na.add(name);
					tel.setName(name);
				}
				
				break;
			case 2:
				System.out.println("==== 등록된 전화번호 보기 ====");
				
		
				
				
				
				
				
				
				
				
			}
		}
	}
}

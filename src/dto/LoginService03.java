package dto;

import java.util.Scanner;

public class LoginService03 {
	Scanner sc = new Scanner(System.in);
	String id = null, pw = null;
	private LoginDTO03 log;
	public LoginService03() {
		System.out.println("기본 생성자 생성");
		log = new LoginDTO03();
	}
	public int idCheck() {
		// 아이디가 null값과 같은지 아닌지 메소드를 만들어서 사용한다.
		if(log.getId()==null) {
			return 0;
		}
		return 1;
	}
	public String[] inputData(String idmsg,String pwdMsg) {
		//
		String inputId,inputPwd;
		System.out.print(idmsg);
		inputId= sc.next();
		System.out.print(pwdMsg);
		inputPwd=sc.next();
		return new String[] {inputId,inputPwd};
	}
	public void display() {
		
		while (true) {
			System.out.println("[1] 로그인");
			System.out.println("[2] 회원가입");
			System.out.println("[3] 탈퇴");
			System.out.println("[4] 종료");
			System.out.print(">>> ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (log.getId() == null) {
					System.out.println("데이터를 저장하세요");
					break;
				}
				System.out.println("== 로그인 ==");
				
				String[] result = inputData("ID: ","PW: ");
				
				if (result[0].equals(log.getId())) {
					if (result[1].equals(log.getPw())) {
						System.out.println("** 인증 통과 **");
						break;
					} else {
						System.out.println("비밀번호가 틀렸습니다.");
						break;
					}
				} else {
					System.out.println("존재하지 않는 아이디입니다.");
					break;
				}

			case 2:
				if (idCheck()==1) {
					System.out.println("사용자가 존재합니다.");
					break;
				}
				/*
				System.out.print("ID: ");
				id = sc.next();
				System.out.print("PW: ");
				pw = sc.next();
				*/
				String[] result2 = inputData("ID: ","PW: ");
				log.setId(result2[0]);
				log.setPw(result2[1]);
				break;
				
			case 3:
				if (idCheck()==0) {
					System.out.println("등록값 없음");
					break;
				} else {
					log.setId(id = null);
					log.setPw(pw = null);
					System.out.println("탈퇴되었습니다.");
					break;
				}
			case 4:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}

		}

	}
}

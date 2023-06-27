package login;

import java.util.Scanner;

import time.*;

public class LoginService03 extends TimeService {
	LoginDTO mem;
	MyFrame myFrame;
	public LoginService03() {
		mem = new LoginDTO();
		myFrame = new MyFrame();
	}
	
	public void display() {
		TimeService t = new TimeService();
		String i = mem.getId();
		String pw = mem.getPwd();
		mem.setId(i);
		mem.setPwd(pw);

		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("1. 로그인");
		System.out.println("2. 회원 가입");
		System.out.println("3. 회원 탈퇴");
		System.out.println("4. 종 료");
		System.out.print(">>> ");
		int num = sc.nextInt();
		System.out.println();
		
		switch(num) {
		case 1:
			if(mem.getId()==null ) {
				System.out.print("회원가입 먼저 진행!");
				System.out.println();
				break;
			}
			System.out.print("id 입력 : ");
			i = sc.next();
			System.out.print("비번 입력: ");
			pw = sc.next();
			
			if(i.equals(mem.getId())){
				if(pw.equals(mem.getPwd())) {
					System.out.println("인증 통과");
					t.setStartTime();
					myFrame.start();
					System.out.println();
				}else {
					System.out.println("비번 틀림");
					System.out.println();
				}
			}else {
				System.out.println("존재하지 않는 아이디");
				System.out.println();
			}
			break;
				
		case 2:
			if(mem.getId()==null) {
				System.out.println("회원가입을 진행 합니당");
				System.out.print("사용할 id 입력: ");
				i = sc.next();
				mem.setId(i);
				System.out.print("사용할 pwd 입력: ");
				pw = sc.next();
				mem.setPwd(pw);
				System.out.println("사용자 등록 완료 ㅋ");
				System.out.println("id: "+i);
				System.out.println("pwd: "+pw);
				System.out.println();
				
			}else {
				System.out.println("사용자가 이미 존재함");
				System.out.println();
			}
			break;
			
		case 3:
			if(mem.getId()==null) {
				System.out.println("회원 가입 먼저 진행!");
			}else {
				mem.setId(null);
				mem.setPwd(null);
				System.out.println("탈퇴 성공!");
			}
			break;
		case 4:
			t.setEndTime();
			System.out.println( t.getResultTime() );
			myFrame.setFlag(false);
			myFrame.setLable( t.getResultTime() );
			return ;
		
		}
		}
		
	}
//	public void idChek(String id) {
//		if(mem.getId()==null) {
//			return 0;
//		}
//		return 1;
//	}

}

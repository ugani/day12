package try_catch;

import java.util.Scanner;

public class MainClass08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("인증 프로그램 입니다.");
		int co = 0;
		int[] age ;
		while(true) {
			System.out.println("90년생 이상은 \'가입불가\'");
			System.out.println("89년생 이하는 \'가입가능\'");
			System.out.println("A,ㅁ,ㅋ 문자는 잘못 입력");
			System.out.print("주민번호 입력(앞6자리): ");
			try {
				co = sc.nextInt();
				age  = new int[co];
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
	}

}

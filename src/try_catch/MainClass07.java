package try_catch;

import java.util.Scanner;

public class MainClass07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		String n1, n2;
//		
//		System.out.print("11 입력: ");
//		n1 = input.nextLine();
//		//넥스트라인은 공백값도 받아줌
//		System.out.print("22 입력: ");
//		n2 = input.next();
//		
//		System.out.println("1. "+n1);
//		System.out.println("2. "+n2);
		
		int num;
		while(true) {
			try {
				System.out.println("수 입력: ");
				num =  input.nextInt();
				System.out.println("입력 값: "+num);
			} catch (Exception e) {
				input.nextLine();
				System.out.println(": 수 입력하세요!!!!!");
			}
			
		}
	}

}

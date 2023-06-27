package try_catch;

import java.util.Scanner;

class A{}
class B extends A{}


public class MainClass03 {
public static void main(String[] args) {
	B a = new B();
	
	A b = new B();
	//부모형태로도 저장이 가능하다.
	
	try {
		int[] arr = {10,20,30};
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
		int n1 = 10, n2 = 2;
		System.out.println(n1 / n2);
	} catch (Exception e) {
		System.out.println("인덱스 범위를 벗어났습니다.");
		//예외 사항을 다 나열하는것보단 
		//익셉션 하나로도 문제 발생 메세지 출력이 가능
		e.printStackTrace();
		//↑위에 있는 코드가 현재 발생한 문제를 알려줌
	}
	System.out.println("다음 문장들 실행");
}
	
}

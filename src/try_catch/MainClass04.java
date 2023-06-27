package try_catch;

import java.util.Scanner;

class TestClass04{
	public void test() {
		Scanner input = new Scanner(System.in);
		int n1 = 10, n2 = 2;
		try {
			System.out.println(n1 / n2);
			return;
		} catch (Exception e) {
			System.out.println("문제 발생함!!");
		}finally {
			System.out.println("finally 실행");
			//파이널리는 트라이가 실행되든, 캐치가 실행되든
			// 파이널리는 항상 실행이 된다.
			input.close();
			//파이널리는 무조건 실행되고, 
			//자바 유틸 기능을 종료할때도 사용된다.
		}
		System.out.println("다음문장들 실행");
	}
}

public class MainClass04 {
public static void main(String[] args) {
	TestClass04 t = new TestClass04();
	t.test();
}
}

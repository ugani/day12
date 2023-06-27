package try_catch;

public class MainClass02 {
public static void main(String[] args) {
	try {
		int[] arr = {10,20,30};
		for(int i=0; i<3; i++) {
			System.out.println(arr[i]);
		}
		//배열쪽에서 문제가 발생되면 아래에 있는
		//나누기는 실행이 안됨
		//문제가 없으면 위에서 그대로 실행이됨 
		
		int n1 = 10, n2 = 2;
		System.out.println(n1 / n2);
		//배열이 문제 없이 실행되면 
		//나누기 기능이 실행되고 
		//문제가 발생하면 예외처리 코드를 출력함
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("인덱스 범위를 벗어났습니다.");
		//for문으로 i는 5까지 반복되는데
		//배열에 저장된 인덱스 범위는 3까지 되어있어서 
		//인덱스 범위를 넘어가는 3이상의 숫자가 반복되면 문제가 반복됨
	}
	 catch(ArithmeticException ee) {
		 System.out.println("0으로 나눌 수 없음!!");
	 }
	System.out.println("다음 문장들 실행");

}
}

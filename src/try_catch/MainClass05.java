package try_catch;

class TestClass05{
	public void test01() {
		System.out.println("test111");
		test02();
	}
	public void test02(){
						
		System.out.println("test222");
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

public class MainClass05 {
public static void main(String[] args) {
	TestClass05 t = new TestClass05();
	t.test01();
	
}
}

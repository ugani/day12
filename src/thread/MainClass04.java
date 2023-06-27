package thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

class A04 extends Thread {
	public void run() {
		Scanner input = new Scanner(System.in);
		String str;
		while(true) {
			System.out.println("입력 :");
			str = input.next();
			System.out.println("값: "+str);
		}
	}
}

public class MainClass04 {
	public static void main(String[] args) {
		
		A04 a = new A04();
		a.start();
		
		JFrame frame = new JFrame("제목");
		//JFrame 그래픽적으로 자바에서 구현 가능
		Container c = frame.getContentPane();
		//컨테이너 -> 장판같은 개념으로 뭔갈 쌓아올릴수있음
		//글자 등등
		
		JLabel laber = new JLabel("test gui");
		c.add( laber );
		
		laber.setFont(new Font(null, 0, 32));
		//글씨 크기, 글씨체를 조정해주는 기능
		//첫번째는 글꼴, 두번째는 스타일, 세번쨰는 글짜 크기
		laber.setHorizontalAlignment(JLabel.CENTER);
		//글짜를 가운대로 옮겨줌
		
		frame.setLocation(1000, 200);
		//글씨 위치를 조정해줌
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack(); 
		//프레임 사이즈를 조정해줌
		//디멘션과, 팩까지 써줘야 사이즈를 조정해줌
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		laber.setText("aaaa");
		//글짜를 변경할때는 setText로 변경
		for(int i=0; ; i++) {
			laber.setText(""+i);
		}
		
	}

}

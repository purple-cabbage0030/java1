import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws IOException {
		// PrintWriter라는 클래스의 instance 생성 by constructor
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
		
		// inherited from Object Class -> Writer Class -> PrintWriter Class
		System.out.println(p1.toString());
		p2.toString();
		
	}

}

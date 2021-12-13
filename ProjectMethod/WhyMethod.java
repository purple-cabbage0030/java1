import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {

	public static void main(String[] args) throws IOException {
		
		// ...
//		System.out.println("-");
//		System.out.println("A");
//		System.out.println("A");
		printTwoTimes("a", "*"); // 인자, argument
		printTwoTimes("b", "-");
		writeFileTwoTimes("a", "*");
		// ...
		System.out.println(twoTimes("abc", "222"));
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("ab", "---"));
		fw.close();
		
	}
	
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}

	// 메소드 입력값의 데이터 타입, 변수명 선언 (매개변수, parameter)
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
	
	public static void writeFileTwoTimes(String text, String delimiter) throws IOException {
		FileWriter fw = new FileWriter("output.txt");
		fw.write(delimiter+"\n");
		fw.write(text+"\n");
		fw.write(text+"\n");
		fw.close();
	}
}

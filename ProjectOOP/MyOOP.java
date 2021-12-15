// 하나의 java파일 안에서 여러 개 클래스를 만들면 각각의 class가 .class파일로 생성됨 
//class Print{
//	// class 소속 변수 선언 (static이 그 의미) 
//	public static String delimiter = "";
//	public static void A() {
//		System.out.println(delimiter);
//		System.out.println("A");
//		System.out.println("A");
//	}
//	
//	public static void B() {
//		System.out.println(delimiter);
//		System.out.println("B");
//		System.out.println("B");
//	}
//}
// public: 접근제어자 - 메인 메소드가 담긴 클래스에만 
public class MyOOP {
	public static void main(String[] args) {
		
//		Print.delimiter = "--";
//		Print.A();
//		Print.A();
//		
//		Print.delimiter = "**";
//		Print.B();
//		Print.B();
		
		// instance 생성 시 class 이름 뒤에 괄호 필 
		Print p1 = new Print("+++++");
		p1.A();
//		p1.B();
//		
//		Print p2 = new Print("---");
//		p2.A();
//		p2.B();
//		
//		p1.A();
//		p2.A();
	}




}

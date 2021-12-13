class Print{
	// 메소드가 instance 소속일 때는 static modifier 빼야 함 
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
	}
	
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		
	}

	public String delimiter;
}

public class staticMethod {
	
	public static void main(String[] args) {
		// static이 있는 메소드는 class method, 없으면 instance method
//		Print.a("---");
//		Print.b("---");
		
		// Print class instance 선언 
		Print t1 = new Print();
		t1.delimiter = "-";
		t1.a();
		t1.b();
		
		Print t2 = new Print();
		t2.delimiter = "*";
		t2.a();
		t2.b();
	}


}

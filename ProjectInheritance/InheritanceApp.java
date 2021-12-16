class Cal{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	// java는 같은 이름의 메소드라도 형태가 다르면 지정 가능. = overloading
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1, v2)+v3; // 계승 발전 
	}
}

class CalChild extends Cal{
	public int minus(int v1, int v2) {
		return v1-v2;
	}
	
	// 부모 클래스의 기능을 재정의 - override
	public int sum(int v1, int v2) {
		System.out.println("Overriding");
		return super.sum(v1, v2); //super = parent
	}
}

public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2, 1));
		System.out.println(c.sum(2, 1, 1));

		CalChild cc = new CalChild();
		System.out.println(cc.sum(3, 4));
		System.out.println(cc.minus(6, 7));
	}

}


public class BooleanApp {

	public static void main(String[] args) {
		
		System.out.println(true);
		System.out.println(false);

		String foo = "Hello world";
//		String true = "Hello world"; - bool타입은 변수 이름 사용 불가 - reserved word
		
		System.out.println(foo.contains("world")); // true
		System.out.println(foo.contains("World")); // false
		
	}

}


public class LogicalOperatorApp {

	public static void main(String[] args) {

		System.out.println(1 == 1); // 비교연산자
		
		// 논리 연산자 AND
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && false); // false	
		
		// OR
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || false); // false
		
		// NOT
		System.out.println(!true); // false
		System.out.println(!false); // true	
		
	}

}

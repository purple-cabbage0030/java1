
public class ArrayApp {

	public static void main(String[] args) {
		// 문자열로 이루어진 배열 선언 
		String[] users = new String[3];
		users[0] = "a";
		users[1] = "b";
		users[2] = "c";

		System.out.println(users[1]);
		System.out.println(users.length);
		
		int[] scores = {10, 100, 100};
		System.out.println(scores.length);
	}

}


public class AuthApp3 {

	public static void main(String[] args) {
		
//		String[] users = {"abc", "def", "ghi"};
		// 원소가 배열이고, 그 배열의 값이 string인 배열 
		String[][] users = {
				{"abc", "1111"}, 
				{"def", "2222"},
				{"ghi", "3333"}
		};
		
		String inputId = args[0];
		String inputPass = args[1];
		
		boolean isLogined = false; // flag
		for(int i=0; i<users.length; i++) {
			String[] currentUser = users[i];
			if(
					currentUser[0].equals(inputId) &&
					currentUser[1].equals(inputPass)
			) {
				isLogined = true;
				break;
			}
		}
		
		if(isLogined) {
			System.out.println("master");
		} else {
			System.out.println("check your id or password");
		}
	}

}

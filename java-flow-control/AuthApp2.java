
public class AuthApp2 {

	public static void main(String[] args) {
		
//		System.out.println(args[0]);
		
		String id = "hong";
		String inputId = args[0];
		
		String pass = "1111";
		String pass2 = "2222";
		String inputPass = args[1];
		
		System.out.println("Hi");

		boolean isRightPass = inputPass.equals(pass) || inputPass.equals(pass2);
		if(inputId.equals(id) && isRightPass ) {
			System.out.println("master");
		} else {
			System.out.println("check ID or password");
		}
	}

}

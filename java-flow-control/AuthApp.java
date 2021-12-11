
public class AuthApp {

	public static void main(String[] args) {
		
		String id = "hong";
		String inputId = args[0];
		
		String pass = "1111";
		String inputPass = args[1];
		
		System.out.println("Hi");
		
		if(inputId.equals(id) && inputPass.equals(pass)) {
			System.out.println("master");
		} else {
			System.out.println("check ID or password");
		}
	}
}

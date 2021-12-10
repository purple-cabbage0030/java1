
public class AuthApp {

	public static void main(String[] args) {
		
//		System.out.println(args[0]);
		
		String id = "hong";
		String inputId = args[0];
		
		String pass = "1111";
		String inputPass = args[1];
		
		System.out.println("Hi");
		
//		if(inputId == id) {
//		if(inputId.equals(id)) {
//			if(inputPass.equals(pass)) {
//				System.out.println("master");
//			} else {
//				System.out.println("wrong password");
//			}
//		} else {
//			System.out.println("check ID"); 
//		}
		
		if(inputId.equals(id) && inputPass.equals(pass)) {
			System.out.println("master");
		} else {
			System.out.println("check ID or password");
		}
	}

}

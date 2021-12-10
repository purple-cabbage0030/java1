
public class AuthApp {

	public static void main(String[] args) {
		
//		System.out.println(args[0]);
		
		String id = "hong";
		String inputId = args[0];
		
<<<<<<< HEAD
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
=======
		System.out.println("Hi");
		
//		if(inputId == id) {
		if(inputId.equals(id)) {
			System.out.println("master");
		} else {
			System.out.println("check ID");
>>>>>>> a0fa41cc31f82fe0d3a313542ab22a82c3f8cf54
		}
	}

}

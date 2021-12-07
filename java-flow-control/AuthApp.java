
public class AuthApp {

	public static void main(String[] args) {
		
//		System.out.println(args[0]);
		
		String id = "hong";
		String inputId = args[0];
		
		System.out.println("Hi");
		
//		if(inputId == id) {
		if(inputId.equals(id)) {
			System.out.println("master");
		} else {
			System.out.println("check ID");
		}
	}

}

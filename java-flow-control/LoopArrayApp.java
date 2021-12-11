
public class LoopArrayApp {

	public static void main(String[] args) {
		String[] users = new String[3];
		users[0] = "a";
		users[1] = "b";
		users[2] = "c";
		
		for(int i=0; i<users.length; i++) {
			System.out.println("<li>" + users[i] + "</li>");
		}

	}

}

import java.text.ParseException;

public class EqualsApp {

	public static void main(String[] args) throws ParseException{
		
		String o1 = "java";
		String o2 = new String("java");
		System.out.println(o1 == o2); //false - 메모리 상의 공간에 대한 비교(non-primitive)
		System.out.println(o1.equals(o2)); //true - value에 대한 비
		
		String o3 = "java2";
		String o4 = "java2";
		System.out.println(o3 == o4); //true
	}

}

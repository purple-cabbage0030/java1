
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; // 1.0 -- double b = (double) 1; 손실 없어서 자동 형변환 
		System.out.println(b);

//		int c = 1.1; cannot convert from double to int
		int d = (int) 1.1; // add cast to 'int' 손실 있어서 강제 형변환 
		System.out.println(d); // int 1
		
		// 1 to String
		String e = Integer.toString(1);
		System.out.println(e); // 1
		System.out.println(e.getClass()); // String
	}

}

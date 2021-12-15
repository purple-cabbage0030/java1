
public class Print {
	public String delimiter = "";
	
	// 생성자 = class 이름과 똑같은 이름의 method = constructor
	// instance 생성 시 생성자가 자동 호출되도록 세팅되어 있음 
	// static, return data type 지정하지 않음 
	// this: 생성한 instanc를 가리킴 
	public Print(String _delimiter) {
//		delimiter = _delimiter;
		this.delimiter = _delimiter;
	}
	
	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}

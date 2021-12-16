class Calc{
	int v1, v2;
	// constructor
	Calc(int v1, int v2){
		System.out.println("parent init");
		this.v1 = v1; this.v2 = v2;
	}
	public int sum() {return this.v1+v2;}
}

class CalcChild extends Calc{
	// 부모 클래스에 생성자가 있다면 자식 클래스도 반드시 생성자 있어야 함 
	CalcChild(int v1, int v2) {
		super(v1, v2); // 부모 클래스의 생성자 실행 
		System.out.println("child init");
	}
	public int minus() {return this.v1-v2;}
}

public class InheritanceApp2 {

	public static void main(String[] args) {
		Calc c = new Calc(2, 1);
		CalcChild cc = new CalcChild(2, 1);
		System.out.println(cc.sum()); //3
		System.out.println(cc.minus()); //1
	}

}

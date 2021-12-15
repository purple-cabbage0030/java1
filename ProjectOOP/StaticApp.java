class Foo {
	public static String classVar = "classvar";
	public String instanceVar = "instancevar";
	
	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar); // error
	}
	
	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar);
//		System.out.println(Foo.instanceVar); // error
		Foo.classMethod();
//		Foo.instanceMethod(); // error
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); // classvar
		System.out.println(f1.instanceVar); // instancevar
		
		f1.classVar = "changed by f1";
		System.out.println(Foo.classVar); // changed by f1
		System.out.println(f2.classVar); // changed by f1
		
		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar); // changed by f1
		System.out.println(f2.instanceVar); // instancevar
		
		Foo f3 = new Foo();
		System.out.println(f3.classVar); // changed by f1
		System.out.println(f3.instanceVar); // instancevar
		
	}

}

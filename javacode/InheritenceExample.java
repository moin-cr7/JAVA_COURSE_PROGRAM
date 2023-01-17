package javacode;
class Hello{
	static int age=20;
	public void hello() {
		System.out.println("Hello ,I am superclass Static Method");
	}
}
class Hii extends Hello{
	static int rollno=30;
	public void hello() {
		super.hello();
		System.out.println("Hello ,I am subclass Static Method");
	}
}
class Bye extends Hii{
//	static int age=20;
}

public class InheritenceExample extends Bye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritenceExample i=new InheritenceExample();
		System.out.println(age);
		System.out.println(rollno);
		i.hello();
	}
}

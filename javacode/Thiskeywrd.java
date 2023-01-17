package javacode;

public class Thiskeywrd {
//	int age=90;
//	
// void person1()
//	{
//		int age=30;
//		System.out.println(age);
//		System.out.println(this.age);
//	}
//	public static void main(String[] args) {
//		Thiskeywrd t=new Thiskeywrd();
//		t.person1();
//		
//	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	int age=20;
	 int Age(int age) {
		this.age=age;
		return age;
	}
	
	public static void main(String[] args) {
		Thiskeywrd t=new Thiskeywrd();
		System.out.println(t.Age(40));;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
}

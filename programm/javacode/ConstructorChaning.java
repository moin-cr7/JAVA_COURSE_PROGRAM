package javacode;

public class ConstructorChaning {
	public ConstructorChaning(String s) {
		this("MoIn",75);
		System.out.println(s);               

	}
	public ConstructorChaning(int a) {
		this("Moin") ;
		System.out.println(a);                                        //Constructor chaining within the Class	

	}
	public ConstructorChaning(String s,int a) {
		System.out.printf("Name:%S\nNo:%d\n",s,a);                

	}

	public static void main(String[] args) {
		ConstructorChaning c=new ConstructorChaning(45);
	}

}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//class Class1 {
//	Class1(){                                                                // Non-Parameterized constructor
//		System.out.println("Iam Constructor from Supper class");
//	}
//}
//public class ConstructorChaning extends Class1 {
//	public ConstructorChaning() {
//		System.out.println("Iam Constructor from Sub class");               // Implicit Constructor Chaining 
//
//	}
//
//	public static void main(String[] args) {
//		ConstructorChaning c=new ConstructorChaning();
//	}
//
//}
////////////////////////////////////////////////////////////////////////////////////////////////////////
//class Class1 {
//	Class1(int a,String ss){                                           //Parameterized constructor
//		System.out.printf("%d \n%s \n",a,ss);
//		System.out.println("Iam Constructor from Supper class");
//	}
//}
//public class ConstructorChaning extends Class1 {
//	public ConstructorChaning(int a) {
//		super(a, "Hello");
//		System.out.println(a);
//		System.out.println("Iam Constructor from Sub class");             //Explicit Constructor Chaining
//
//	}
//
//	public static void main(String[] args) {
//		ConstructorChaning c=new ConstructorChaning(100);
//		
//	}
//
//}

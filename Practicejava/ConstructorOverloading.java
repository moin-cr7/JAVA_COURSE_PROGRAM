package Practicejava;

public class ConstructorOverloading {
	
	public ConstructorOverloading(int a,int b) {
			System.out.println(a+b);
	}
	public ConstructorOverloading(double a,int b) {
		System.out.println(a-b);
	}
	public ConstructorOverloading() {
		System.out.println("Nothing");
	}
	
	
	public static void main(String[] args) {
		
		ConstructorOverloading c1=new ConstructorOverloading(20,39);
		ConstructorOverloading c2=new ConstructorOverloading(309.44,200);
		ConstructorOverloading c3=new ConstructorOverloading();
	}

}

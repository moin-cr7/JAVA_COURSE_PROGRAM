package javacode;
class Class123{
	void Methood1() {
		System.out.println("Iam method from superclass,I get executed when overrided method call me by SUPPER keyword ");
	}
}
class Class321 extends Class123{
	@Override
	void Methood1() {
		super.Methood1();
		System.out.println("Iam method from superclass,I get executed when overrided method call me by SUPPER keyword ");
	}
}
public class MethodOverriding extends Class321 {
	
	@Override
	 void Methood1() {
		super.Methood1();                               //It is used to get the super class method
		System.out.println("Overrided Method ");
	}
	public static void main(String[] args) {
		MethodOverriding m=new MethodOverriding();               //Only non-Static methods Overrides
		m.Methood1();
	}
}

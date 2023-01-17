package Practicejava;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.concurrent.Flow.Publisher;

public class MethodOverloadingg {
	
	public static int sum(int a,int b) {
		return a+b;
	}
	public static double sum(int a, double b) {
		return a+b;
	}
	
	public String sum(String a,String b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(sum(20,30));
		System.out.println(sum(20,30.0));
		
		MethodOverloadingg m=new MethodOverloadingg();
		System.out.println(m.sum("hello", " world"));
	}

}

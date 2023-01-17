package javacode;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int z=s.nextInt();
		String St=Integer.toString(z);
		for(int i=0;i<St.length();i++) {
			if(St.charAt(i)=='9') {
				System.out.print(10);
			}
			else {
			System.out.print((char)(St.charAt(i)+1));
			}
		}
		

	}

}

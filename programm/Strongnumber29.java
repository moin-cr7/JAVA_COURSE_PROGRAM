package programm;

import java.util.Scanner;

public class Strongnumber29 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=n,sum=0;
		
		while(n!=0) {
			int rem=n%10;
			int fact=1;
			for( int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			n=n/10;
			sum=sum+fact;
		}
		if(sum==temp) {
			System.out.println("Strong number");
		}
		else {
			System.out.println("Not a strong number");
		}
	}
}

package programm;

import java.util.Arrays;

public class pattern27 {
	public static void main(String[] args) {
		for(int r=1;r<=5;r++) {
			for( int c=1;c<=5;c++) {
				if(c>r) {
					System.out.print("* ");
				}
				else{
					System.out.print(r+" ");
				}
			}
			System.out.println();
		}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

//		for(char x='A';x<='E';x++) {
//			for(char y='A';y<='E';y++) {
//				if(x>=y) {
//				System.out.print(x+ " ");
//				}
//				else {
//					System.out.print("* ");
//				}
//			}
//			System.out.println();
//			
//		}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

//		String r="DEVELOPER";
//		char[] c=r.toCharArray();
//		for(int i=0;i<r.length();i++) {
//			for(int j=i;j<=r.length();j++) {
//				System.out.print(c[j]);
//			}
//			System.out.println();
//		}
		
		int n=5;
		int mid=n/2+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=5;j++) {
			if(j==1||((i==mid || i==n || i==1)&&(j<=n-1))) {
				System.out.print(" *");
			}
			else {
				System.out.print(" ");
			}
		}
			System.out.println();
		}
	}
}

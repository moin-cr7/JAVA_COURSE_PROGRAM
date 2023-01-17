package javacode;

public class pattern {
	public static void main(String[] args) {
//		for(int r=1;r<5;r++) {
//			for(int c=r;c<=5;c++) {
//				System.out.print("  ");
//			}
//			for(int c=1;c<r;c++) {
//				System.out.print("* ");
//			}
//			for(int c=1;c<=r;c++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		for(int r=1;r<=5;r++) {
//			for(int c=1;c<=r;c++) {
//				System.out.print("  ");
//			}
//			for (int c=r ; c<5 ; c++) {
//				System.out.print("* ");
//			}
//			for(int c=r ; c<=5 ;c++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		for(int r=1;r<=5;r++) {
			for(int c=1;c<=r;c++) {
				System.out.print("* ");
			}
			for(int c=r;c<=5;c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

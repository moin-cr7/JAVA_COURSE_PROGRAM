package programm;

public class huzaifa {
public static void main(String[] args) {
	for(int r=1;r<=5;r++) {
		for(int c=1;c<=5;c++) {
			if(c==1||c==5||r==3) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		for(int c=0;c<3;c++) {
			if(c>1||c<1) {
				System.out.print("  ");
			}
		}
		for(int c=1;c<=5;c++) {
			if(c==1||c==5||r==5) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		for(int c=0;c<3;c++) {
			if(c>1||c<1) {
				System.out.print("  ");
			}
		}
		for(int c=1;c<=5;c++) {
			if(r==1||r==5||r+c==6) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		for(int c=0;c<3;c++) {
			if(c>1||c<1) {
				System.out.print("  ");
			}
		}
		for(int c=1;c<=5;c++) {
			if(c==1||c==5||r==3||r==1) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		for(int c=0;c<3;c++) {
			if(c>1||c<1) {
				System.out.print("  ");
			}
		}
		for(int c=1;c<=5;c++) {
			if(r==1||c==3||r==5) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		for(int c=0;c<3;c++) {
			if(c>1||c<1) {
				System.out.print("  ");
			}
		}
		for(int c=1;c<=5;c++) {
			if(r==1||c==1||r==3) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		for(int c=0;c<3;c++) {
			if(c>1||c<1) {
				System.out.print("  ");
			}
		}
		for(int c=1;c<=5;c++) {
			if(c==1||c==5||r==3||r==1) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		for(int c=0;c<3;c++) {
			if(c>1||c<1) {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}

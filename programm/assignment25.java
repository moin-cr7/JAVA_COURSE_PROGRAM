package programm;

public class assignment25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	for(int r=1;r<=5;r++) {
//			for(int c=1;c<=5;c++) {
//				if(c==3 || r==3) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println("  ");
//		}
//		System.out.println("-------------------");
//		for(int r=1;r<=5;r++) {
//			for(int c=1;c<=5;c++) {
//				if(r+c==6||c==r) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println("  ");
//		}
//		System.out.println("-----------------");
//		for(int r=1;r<=10;r++){
//			for(int c=1;c<=10;c++) {
//				if(c==1||r==10||r==c) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println("  ");
//		}
//		System.out.println("-----------------");
//		for(int r=1;r<=11;r++) {
//			for(int c=1;c<=11;c++) {
//				if(c==1||r==11||r==1||c==11||r==c||r+c==12) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println("  ");
//		}
//		System.out.println("-----------------");
//		for(int r=1;r<=10;r++) {
//			for(int c=1;c<=10;c++) {
//				if(r==1||r==10||c==1||r==5||c==10) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println("  ");
//		}
//		System.out.println("-----------------");
//		for(int r=1;r<=10;r++) {
//			for(int c=1;c<=10;c++) {
//				if(c==10||r==5||c==1&&r<=5) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println("  ");
//		}
//		System.out.println("-----------------");
//		for(int r=1;r<=10;r++) {
//			for(int c=1;c<=10;c++) {
//				if(c==5||r==5||c==1&&r<=5) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println("  ");
//		}
//		System.out.println("-----------------");
//		
//		}
		for(int r=1;r<=11;r++) {
			for(int c=1;c<=11;c++) {
				if((r==1&&c>1&&c<=4)||(r==1&&c<=10&&c>=8)||(c==1&&(r>1&&r<=6))||(c==11&&(r>1&&r<=6))||(r==2&&c==5)||(r==2&&c==7)||(r==3&&c==6)||(r==2&&c==5)||(r-c==5)||(r+c==17)) {
				System.out.print("* ");
			}
				else {
					System.out.print("  ");
				}
		}
			System.out.println("  ");
		}

	}
}

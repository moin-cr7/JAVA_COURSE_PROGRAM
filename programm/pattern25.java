package programm;

public class pattern25 {
	public static void main(String[] args) {
		for(int r=1;r<=5;r++) {
			for(int c=1;c<=5;c++) {
				if(c==r||r+c==6) {
					System.out.print("* ");
					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

//		for(int r=1;r<=5;r++) {
//			for(int c=1;c<=5;c++) {
//				if(r==3||c==5||(c==1&&r<=3)) {
//					System.out.print("* ");
//					
//				}
//				else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

//		for(int r=1;r<=7;r++) {
//			for(int c=1;c<=5;c++) {
//				if(c==3||r==7||(r==3&&c==1)||(r==2&&c==2)) {
//					System.out.print("* ");
//					
//				}
//				else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
//		}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
//		int n=5;
//		int mid=n/2+1;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=5;j++) {
//			if(j==1||((i==mid || i==n || i==1)&&(j<=n-1))) {
//				System.out.print(" *");
//			}
//			else {
//				System.out.print(" ");
//			}
//		}
//			System.out.println();
//		}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

	}

}

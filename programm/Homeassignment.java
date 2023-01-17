package programm;

public class Homeassignment {
	public static void main(String[] args) {
//		int x=909923;
//		
//		while(x!=0) {
//			int dig=x%10;
//			int fact=1;
//			for(int i=1;i<=dig;i++) {
//				fact=fact*i;
//			}
//			System.out.println("The factorial of "+ dig +" ="+fact );
//			x=x/10;
//		}
		
//		------------------------------------------------------------------------------------------------------------------------------------------------------
		for(int r=1;r<=7;r++) {
			for(int c=1;c<=7;c++) {
				if(c==1||c==7||(c==2&&r==2)||(c==3&&r==3)||(c==4&&r==4)||(c==5&&r==3)||(c==6&&r==2)){
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
			
			for(int c=1;c<=7;c++) {
				if(r==1||c==1||r==7||c==7){
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
			for(int c=1;c<=7;c++) {
				if(r==1||r==7||c==4){
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
			for(int c=1;c<=7;c++) {
				if(c==1||c==7||r==c){
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
//		---------------------------------------------------------------------------------------------------------------------------------------------------------
		
		}
	}


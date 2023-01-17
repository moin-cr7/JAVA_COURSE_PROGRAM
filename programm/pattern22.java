package programm;

public class pattern22 {
	public static void main(String[] args) {
		int x=2;
		for(int r=1;r<=3;r++) {
			x=r*2;
			for(int c=1;c<=3;c++) {
				System.out.print(x+ " ");
				x+=6;
			}
			System.out.println();
		}
		
//		for(int r=0;r<=4;r++) {
//			char x='A';
//			x=(char) (x+r);
//			for(int c=1;c<=5;c++) {
//				System.out.print(x+" ");
//				x+=5;
//			}
//			System.out.println();
//		}
		
		
	}
	

}
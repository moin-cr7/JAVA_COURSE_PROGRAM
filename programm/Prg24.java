package programm;

public class Prg24 {
	public static void main(String[] args) {
		int k=2;
		for(int r=1;r<=3;r++) {
			k=r;
			for( int c=1;c<=4;c++) {
				System.out.print(k*2 + " ");
				k+=1;	
			}
			System.out.println();
		}
	}
}

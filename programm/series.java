package programm;

public class series {
	public static void main(String[] args) {
		int f=1;
		int r=99;
		for(int i=1;i<=100;i++) {
			for(int j=1;j<=i;j++) {
			if(i%2==0) {
				System.out.print(f+" ");
				f=f+1;
			}
			else if(i%2!=0) {
				System.out.print(r+ " ");
				r=r-1;
			}
		}
	}
	}
}

package programm;

public class neanNumber {
	public static void main(String[] args) {
		int n=9,sum=0,temp=n;
		int sq=n*n;
		while(sq!=0) {
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		if(temp==sum) {
			System.out.println("Nean Number");
		}
		else {
			System.out.println("Not a Nean Number");
		}
	}

}

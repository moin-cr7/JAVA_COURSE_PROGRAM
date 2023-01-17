package programm;

public class AmstrongNumber {
	public static void main(String[] args) {
		int n=370,sum=0,temp=n;
		while(n!=0) {
			int rem=n%10;
			int cube=rem*rem*rem;
			sum=sum+cube;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("Amstrong Number");
		}
		else {
			System.out.println("Not a Amstrong Number");
		}
	}

}

package programm;

public class strongNumber {
	public static void main(String[] args) {
		int n=145,temp=n;
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			n=n/10;
			sum=sum+fact;
		}
		System.out.println(sum);
		if(temp==sum) {
			System.out.println("strong");
		}
		else {
			System.out.println("not");
		}
	}

}

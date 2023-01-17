package programm;



public class SpyNumber {
	static void test(int n) {
		int sum=0;
		int last=0;
		int mul=1;
		while(n!=0) {
			last=n%10;
			sum=sum+last;
			mul=mul*last;
			n=n/10;
			
		}
		if(sum==mul) {
			System.out.println("Sky number");
		}
		else {
			System.out.println("Not a Sky number");
		}
	}
	public static void main(String[] args) {
		test(123);
		
		
	}

}

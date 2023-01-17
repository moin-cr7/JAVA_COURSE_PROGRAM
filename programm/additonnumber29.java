package programm;

public class additonnumber29 {
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	static long add(long n) {
		long sum=0;
		while(n!=0) {
			long rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		long n=432346754;
		long temp=n;
		long res=add(n);
		System.out.println(res);
		while(res/10!=0) {
			res=add(res);
			System.out.println(res);
		}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

//		long n=19856,sum=0;
//		while(n>0||sum<9) {
//			if(n==0) {
//				sum=0;
//				n=sum;
//			}
//			long rem=n%10;
//			sum=sum+rem;
//			n=n/10;
//		}
//		System.out.println(sum);
//	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	
	}
}

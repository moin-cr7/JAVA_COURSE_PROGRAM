package programm;

public class binary2decmal {
	static int dec2bin(int n) {
		int bin=1;
		int dec=0;
		while(n!=0) {
			int rem=n%10;
			dec+=rem*bin;
			bin=bin*2;
			n=n/10;
		}
		return dec;
	}
	public static void main(String[] args) {
		int n=1111;
		System.out.println(dec2bin(n));
		
	}

}

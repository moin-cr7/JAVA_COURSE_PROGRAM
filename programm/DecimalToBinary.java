package programm;

public class DecimalToBinary {

	public static void main(String[] args) {
		int n=15,rem,temp=1,bin=0;
		while(n!=0) {
			rem=n%2;
			bin=bin+(rem*temp);
			n=n/2;
			temp=temp*10;
		}
		System.out.println(bin);

	}

}

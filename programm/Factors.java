package programm;

public class Factors {
public static void main(String[] args) {
	int n=10,count=0,sum=0;
	for(int i=1;i<=n;i++) {
		int rem =n%i;
		if(rem==0) {
			count++;
			sum=sum+i;
		}
	}
	System.out.println(sum);
	System.out.println(count);
}
}

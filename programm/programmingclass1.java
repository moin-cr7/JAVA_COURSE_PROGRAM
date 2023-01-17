package programm;

public class programmingclass1 {

	
	
	
	
//	TECH NUMBERS
public static void test(int n) {
	int count=0;
	int temp=n;
	while(n!=0) {
		count++;
		n=n/10;
	}
	int firsthalf=temp%(int)Math.pow(10, count/2);
	int secondhalf=temp/(int)Math.pow(10,count/2);
	
	int sum=firsthalf+secondhalf;
	int res=sum*sum;
	if(temp==res) {
		System.out.println("correct");
	}
	else {
		System.out.println("wrong");
	}
}
public static void main(String[] args) {
	test(2025);
	test(1314);
	
}
	
	
	
	
	
	
	
	
//static int numDig(int z) {
//	int count=0;
//	int aa=1;
//	while(z>0) {
//		z=z/10;
//		count++;
//	}
//		while(count!=0) {
//			aa=aa*10;
//			count--;
//		}
//	
//	
//	return aa;
//}
//	public static void main(String[] args) {
//		int i=11;
//		int j=1001;
//		int c=0;
//		for(int a=i;a<=j;a++) {
//			if((a/numDig(a))==(a%numDig(a))) {
//				c++;
//			}
//		}
//		System.out.println(c);
//	
//	
//		}
	}


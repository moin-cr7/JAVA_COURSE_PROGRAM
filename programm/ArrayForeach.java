package programm;

public class ArrayForeach {
public static void main(String[] args) {
//	int[] a= {1,2,3,4};
//	int sum=0;
//	for(int x: a) {
////		System.out.println(x);
//		sum+=x;
//	}
//	System.out.println(sum);
	
	int[] a={5,7,13,15,6,8,10};
	for(int j=0;j<a.length;j++) {
		int count=0;
		int x=a[j];
		for(int i=1;i<=x;i++) {
			if(x%i==0) {
				count++;
			}
			
		}
		if(count==2) {
			System.out.println(x);
		}
		
	}
}
}

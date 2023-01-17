package programm;

public class number2binary {
//	static void decToBinary(int n)
//	{
//		int[] binaryNum = new int[1000];
//		int i = 0;
//		while (n > 0)
//		{
//			binaryNum[i] = n % 2;
//			n = n / 2;
//			i++;
//		}
//		for (int j = i - 1; j >= 0; j--)
//			System.out.print(binaryNum[j]);
//	}
//	
//			// driver program
//			public static void main (String[] args)
//			{
//				int n = 17;
//				System.out.println("Decimal - " + n);
//				System.out.print("Binary - ");
//				decToBinary(n);
//			}
//		
//	public static void main(String[] args) {
//		int n=11,rem,temp=1,bin=0;
//		while(n!=0) {
//			rem=n%2;
//			bin=bin+(rem*temp);
//			n=n/2;
//			temp=temp*10;
//		}
//		System.out.println(bin);
	public static void main(String[] args) {
		int n=15,rem,temp=1,bin=0;
		while(n!=0) {
			rem=n%2;
			bin=bin+(rem*temp);
			n=n/2;
			temp=temp*10;
		}
		System.out.println(bin);
		
		
		
		
		int dec=0;
		int re;
		temp=1;
		while(bin!=0) {
			 re=bin%10;
			dec=dec+(re*temp);
			bin=bin/10;
			temp=temp*2;
		}
		System.out.println(dec);
	}
	}


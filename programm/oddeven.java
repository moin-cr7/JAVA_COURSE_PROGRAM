package programm;

import java.util.Scanner;

public class oddeven {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String z=s.nextLine();
		int counteven=0;
		int countodd=0;
		int count=0;
//		String St=Integer.toString(z);
		for(int i=0;i<z.length();i++) {
			count++;
			if(z.charAt(i)%2==0) {
			counteven++;
			}
			else {
				countodd++;
			}
//			System.out.print((char)(St.charAt(i)+1));
		}
		System.out.println("total numbers "+count);
		System.out.println("even values are " + counteven);
		System.out.println("odd values are " + countodd);
		System.out.println("result= "+count+ "-"+counteven+"="+(count-counteven) );
		

	}

}
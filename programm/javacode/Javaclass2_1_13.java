package javacode;

public class Javaclass2_1_13 {

	public static void main(String[] args) {
		
		
//		String  s="bird";
//		for(int r=0;r<=s.length()-1;r++) {
//			for(int c=0;c<=r;c++) {
//				System.out.print(s.charAt(c));
//			}
//			System.out.println();
//		}
		
		String s="hello";
		for(int r=0;r<=s.length()-1;r++) {
			for(int c=0;c<=s.length()-1;c++) {
				if(c==1) {
					System.out.print(s.charAt(r));
				}
				if(r==1) {
					System.out.print(s.charAt(r));
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
//		String s="2b4b3c";
//		char[] c=s.toCharArray();
//		for(int i=0;i<s.length();i=i+2) {
//			int n=c[i]-48;
//			for(int j=0;j<=n;j++) {
//				System.out.print(c[i+1]);
//			}
//		}
	}

}

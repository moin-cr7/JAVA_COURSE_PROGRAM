package programm;

import java.util.Scanner;

public class Stringoddeven {
	public static void main(String[] args) {
		String s="[[0,1,2,3],[0,1,3,5,7,9]],[0,2,3]";
		int count=0;
		Scanner in=new Scanner(System.in);
		int ind=in.nextInt();
		for(int i=ind;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='[') {
				count++;
			}
			else if(c==']') {
				count--;
			}
			else {
				continue;
			}
			if(count==0) {
				System.err.println(i);
				break;
			}
		}
		
//		String s="Java is a High Level Programming Language";
//		for(int i=0;i<s.length();i++) {
//			char x=s.charAt(i);
//			if(x>='A'&&x<='Z') {
//				String str=String.valueOf(x).toLowerCase();
//				System.out.print(str);
//			}
//			else if(x>='a'&&x<='z') {
//				String str=String.valueOf(x).toUpperCase();
//				System.out.print(str);
//			}
//			else {
//				System.out.print(x);
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
//		String s="Java is a High Level Programming Language";
//		for(int i=0;i<s.length();i++) {
//			int ch=s.charAt(i);
//			
//			if(ch>=65&&ch<=90) {
//				System.out.print((char)(s.charAt(i)+32));
//			}
//			else if(ch>=97&&ch<=122) {
//				System.out.print((char)(s.charAt(i)-32));
//			}
//			else {
//				System.out.print((char)s.charAt(i));
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
//		String s="Bhoomika";
//		String ss=s.toLowerCase();
//		for(int i=0;i<ss.length();i++) {
//			if(i%2==0) {
//				char ch=ss.charAt(i);
//				String str=String.valueOf(ch).toUpperCase();
//				System.out.print(str);
//				}
//			else {
//				System.out.print(s.charAt(i));
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	String s="bhoomika";
//	String s1=s.toUpperCase();
//	String s2=s.toLowerCase();
//	String s3="";
//	
//	for(int i=0;i<s.length();i++) {
//		if(i%2==0) {
//			s3+=s1.charAt(i);
//		}
//		else {
//			s3+=s2.charAt(i);
//		}
//	}
//	
//	System.out.println(s3);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	String s="bhoomika";
//	String s1="";
//	String s2="";
//	for(int i=0;i<s.length();i++) {
//		if(i%2==0) {
//			s1+=s.charAt(i);
//		}
//		else {
//			s2+=s.charAt(i);
//		}
//	}
//	System.out.println(s1.toUpperCase());
//	System.out.println(s2.toLowerCase());
	

}
}
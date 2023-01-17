package programm;

public class stringtwovowelconsonent {
	public static void main(String[] args) {
		String s1="Bhoomika";
		String s2="Shetty";		
		for(int i=0;i<s1.length();i++) {
			char c1=s1.charAt(i);
			if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u') {
				System.out.print(c1);
			}
		}
		for(int i=0;i<s2.length();i++) {
			char c2=s2.charAt(i);
			if(c2=='a'||c2=='e'||c2=='i'||c2=='o'||c2=='u') {
				continue;
			}
			else {
				System.out.print(c2);
			}
		}
	}

}

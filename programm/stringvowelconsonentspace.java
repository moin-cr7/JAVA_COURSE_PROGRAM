package programm;

public class stringvowelconsonentspace {
	public static void main(String[] args) {
		String s="Java is a high level programming langauage";
		int countvowels=0;
		int countconsent=0;
		int countspace=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
					s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||
					s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||
					s.charAt(i)=='U') {
				countvowels++;
			}
			else if (s.charAt(i)==' ') {
				countspace++;
			}
			else {
				countconsent++;
			}
		}
		int ss=s.length();
		System.out.println("The total number of character are "+ss);
		System.out.println("The number of vowels in the string are "+ countvowels);
		System.out.println("The number of consonent in the string are "+ countconsent);
		System.out.println("The number of space in the string are "+ countspace);
		// TODO Auto-generated method stub

	}

}

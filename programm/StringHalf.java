package programm;

public class StringHalf {

	public static void main(String[] args) {
		String s="Bhoomika";
		String l="";
		for(int j=s.length()/2-1;j>=0;j--) {
			
			l+=s.charAt(j);
		}
// 		for(int i=s.length()/2;i<s.length();i++) { 			
// 			l+=s.charAt(i);
// 		}
 		
 		System.out.println(l+s.substring(s.length()/2,s.length()));
	}
}

package programm;

public class middlenumber {
	static String sss(String str , String str2) {
		if(str.length()>0 && str.length()>0) {
			return str.substring(0, 1)+str2.substring(str2.length()-1);
		}
		else if(str.length()==0 || str2.length()==0){
			if(str.length()==0) {
				return "@"+str2.substring(str2.length()-1);
			}
			else {
				return str.substring(0, 1)+"@";
			}
		}
	
	return"";
	}
public static void main(String[] args) {
	String s="na";
	String ss="dda";
	System.out.println(sss(s,ss));
//	System.out.println(s.substring(1,4));
	
}
}

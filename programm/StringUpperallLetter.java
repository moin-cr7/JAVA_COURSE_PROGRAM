package programm;

import java.util.Iterator;

public class StringUpperallLetter {
	public static void main(String[] args) {
		String m = "moIn";
		String s="";
		for (int i = 0; i < m.length(); i++) {
			char c = m.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				s+=(char) (c + 32);
			} else if (c >= 'a' && c <= 'z') {
				s+=(char) (c - 32);
			} else {
				s+=(char) (c);
			}
		}
		System.out.println(s);
	}

}

package javacode;

import java.util.Arrays;

public class arrrayss {
	public static void main(String[] args) {
		int[] a = { 2, 2, 4, 5, 2, 4, 3 };
		
		String res="";

		boolean[] b = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			if (b[i] == true) {
				continue;
			}
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					b[j] = true;
					
				}
			}
			if (count > 0) {
				res=res+a[i];
			}

		}
		char[] c=res.toCharArray();
		System.out.println(Arrays.toString(c)); 
	}

}

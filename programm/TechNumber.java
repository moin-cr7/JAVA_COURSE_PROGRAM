package programm;

public class TechNumber {
	public static void test(int a, int b) {
		int count=0;
		for (int i=a;i<=b;i++) {
			String num = String.valueOf(i);
			char first = num.charAt(0);
			char last = num.charAt(num.length()-1);
			if(first==last) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		test(11,1001);
	}

}

package programm;

public class upperandlowerboth {
	public static void test(char x) {
		if(x>='A'&&x<='Z') {
			x=(char)(x+32);
			System.out.println(x);
			
		}
		else if(x>='a'&& x<='z') {
			x=(char)(x-32);
			System.out.println(x);
		}
		else {
			System.out.println("Invalid");
		}
		
	}
	public static void main(String[] args) {
		test('a');
		test('A');
		test('@');
	}

}

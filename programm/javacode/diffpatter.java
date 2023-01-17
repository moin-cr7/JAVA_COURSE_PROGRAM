package javacode;

public class diffpatter {

	static void squarep(int n) {
		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <= 5; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void increcp(int n) {
		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	static void decresep(int n) {
		for (int r = 1; r <= 5; r++) {
			for (int c = r; c <= 5; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pyramid(int n) {
		for (int r = 1; r <= 5; r++) {
			for (int c = r; c <= 5; c++) {
				System.out.print("  ");
			}
			for (int c = 1; c <= r; c++) {
				System.out.print("* ");
			}
			for (int c = 1; c < r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void diamond(int n) {
		for (int r = 1; r < 5; r++) {
			for (int c = r; c <= 5; c++) {
				System.out.print("  ");
			}
			for (int c = 1; c <= r; c++) {
				System.out.print("* ");
			}
			for (int c = 1; c < r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("  ");
			}
			for (int c = r; c <= 5; c++) {
				System.out.print("* ");
			}
			for (int c = r; c < 5; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	static void ex(int n) {
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if (c == r || c + r == 6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	static void rombus(int n) {
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= 5; c++) {
				if (r - c == 2 || c - r == 2 || c + r == 4 || c + r == 8 || c == 3 && r == 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}
	}

	static void pluse(int n) {
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= 5; c++) {
				if (c == 3 || r == 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}
	}

	static void T(int n) {
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= 5; c++) {
				if (r == 1 || c == 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}
	}

	static void circle(int n) {                                        // incomplete
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {

				if (c ==1  && r ==2  || c == 1 && r == 3 || c == 1 && r == 4 || c == 2 && r == 1 || c == 3 && r == 1 || c == 4 && r == 1  || c == 5 && r == 2 || c == 5 && r == 3 || c == 5 && r == 4 || c == 2 && r == 5 || c == 3 && r == 5 || c == 4 && r == 5) {
					
					System.out.print("* ");
				} 
				else  {
					
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}
	static void Ep(int n) {
		for(int r=1;r<=n;r++) {
			for(int c=1;c<=n;c++) {
				if(c==1||r==1|r==5||r==3&&c!=5) {
					
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 5;
//		squarep(n);
//		increcp(n);
//		pyramid(n);
//		decresep(n);
//		diamond(n);
//		ex(n);
//		rombus(n);
//		pluse(n);
//		T(n);
//		circle(n);
		Ep(n);

	}

}

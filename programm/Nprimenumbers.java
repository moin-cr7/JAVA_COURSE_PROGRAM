package programm;

public class Nprimenumbers {
	public static void main(String[] args) {
		int n = 10, pcount = 0;
		for (int j = 1; pcount < n; j++) {
			int count = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0)
					count++;
			}
			if (count == 2) {
				pcount++;
				System.out.println(j);
			}
		}
	}
}

package programm;

public class printingNthprimenumber {
	public static void main(String[] args) {
		int n = 3, pcount = 0;
		int k=0;
		for (int j = 1; pcount < n; j++) {
			int count = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0)
					count++;
			}
			if (count == 2) {
				pcount++;
				k=j;
			}
		}
		System.out.println(k);
	}
}

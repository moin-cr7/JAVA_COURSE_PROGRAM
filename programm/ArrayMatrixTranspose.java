package programm;

public class ArrayMatrixTranspose {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();

		int rows = a.length;
		int cols = a[0].length;
		int[][] b = new int[rows][cols];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[i][j] = a[j][i];
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}

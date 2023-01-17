package programm;

public class ArrayRowColAddition {
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
		for (int i = 0; i < rows; i++) {
			int sumcol=0;
			for (int j = 0; j < cols; j++) {
				sumcol+= a[j][i];
			}
			System.out.println("sum of cols "+(i+1)+" = "+sumcol+" ");
		}
		System.out.println();
		for (int i = 0; i < rows; i++) {
			int sumrow=0;
			for (int j = 0; j < cols; j++) {
				sumrow+= a[i][j];
			}
			System.out.println("sum of cols "+(i+1)+" = "+sumrow+" ");
		}
	}

}

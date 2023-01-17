package programm;

public class ArrayInsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,5,6 ,11,43,55,65,3,44,0,-11,-5,-7};
		
		for(int i=0;i<a.length;i++) {
			int temp=a[i];
			int j=i-1;
			while(j>-1 && (a[j]>temp)) {
								
					a[j+1]=a[j];
					j--;
				}
			a[j+1]=temp;
			}
			
		for(int i:a) {
			System.out.println(i+" ");
		}

	}

}

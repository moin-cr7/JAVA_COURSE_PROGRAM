package programm;

public class ArrayBuubleSort {

	public static void main(String[] args) {
		int a[]= {1,4,5,6 ,11,43,55,65,3,44,0,-11,-5,-7};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for (int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i:a) {
			System.out.println(i+" ");
		}

	}

}

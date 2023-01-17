package programm;

public class ArraySelectionSort {

	public static void main(String[] args) {
		int a[]={1,4,5,6 ,11,43,55,65,3,44,0,-11,-5,-7};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			int index=i;
			for (int j=i+1;j<a.length;j++) {
				if(a[j]<a[index]) {
					index=j;
				}
			}
			temp=a[i];
			a[i]=a[index];
			a[index]=temp;
		}
		for(int i:a) {
			System.out.println(i+" ");
		}
		// TODO Auto-generated method stub

	}

}

package programm;

public class ArrayLinnerSearch {
		
		public static int test(int[] a, int key) {
			for(int i=0;i<a.length;i++) {
				if(a[i]==key) {
					return i;
				}
			}
			return -1;
		}
		public static void main(String[] args) {
			int[] a= {1,2,3,4,5,6,7,8};
			int key=8;
			System.out.println("Element fout at the index value= "+test(a,key));
			
		}
		
		
		
		
		
//		public static void main(String[] args) {
//		int[] a= {1,2,3,4,5,6,7,8};
//		int key=5;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]!=key) {
//				continue;
//			}
//			else {
//				System.out.println("Element fout at the index value= "+i);
//			}
//		}
//	}

}

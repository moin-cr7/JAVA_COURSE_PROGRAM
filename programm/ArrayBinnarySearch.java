package programm;

public class ArrayBinnarySearch {                               // Array must be in ascending order 
	public static void main(String[] args) {
		int a[]= {1,2,4,6,8,9};
		int lower=0,upper=a.length-1,key=8,mid=(lower + upper) / 2;
		while(lower<=upper) {
			if(a[mid]<key) {
				lower=mid+1;
			}
			else if(a[mid]==key) {
				System.out.println(mid);
				break;
				}
			else {
				upper=mid-1;
			}
			mid=(lower+upper)/2;
		}
	}
	
	
	
	
	
	
	
	
//	public static void binarySearch(int arr[], int first, int last, int key){  
//		   int mid = (first + last)/2;  
//		   while( first <= last ){  
//		      if ( arr[mid] < key ){  
//		        first = mid + 1;     
//		      }else if ( arr[mid] == key ){  
//		        System.out.println("Element is found at index: " + mid);  
//		        break;  
//		      }else{  
//		         last = mid - 1;  
//		      }  
//		      mid = (first + last)/2;  
//		   }  
//		   if ( first > last ){  
//		      System.out.println("Element is not found!");  
//		   }  
//		 }  
//		 public static void main(String args[]){  
//		        int arr[] = {10,20,30,40,50};  
//		        int key = 30;  
//		        int last=arr.length-1;  
//		        binarySearch(arr,0,last,key);     
//		 }
		 }


package geekforgeeks.searching;

public class BinarySearch {
	
	//We are trying to implement simple binary search
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,10,80,110};
		if(binarySearch(arr,0,arr.length-1,4)!=-1)
		{
			System.out.println("Element found");
		}else {
			System.out.println("Element not found");
		}
	}
	
	public static int binarySearch(int arr[],int left, int right,int number)
	{
		//We are looking element number in the array
		if(right >left)
		{
			int mid=left+(right -left)/2;
			//We are tying to find out middle element 
			
			//Now we will check if element is at mid only 
			
			if(arr[mid]==number)
				return mid;
			//now we will check if element lies in left of array
			if(arr[mid]>number)
			{
				
			}
		}
		return -1;
	}

}

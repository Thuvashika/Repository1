package com.learn.java.day8.array;


public class StaticArray {
	static int partition(int arr[],int str,int lst) {
		int i=str-1,x,y;
		int pivot=arr[lst];
		//selecting an element as pivot
		for(int j=str;j<=lst-1;j++) {
			if(arr[j]<pivot) {
				i++;
				x=arr[j];
				y=arr[i];
				arr[i]=x;
				arr[j]=y;
				/**Swapping all numbers lesser than pivot to its left
				and greater than pivot to its right**/

			}
		}
		x=arr[lst];
		y=arr[i+1];
		arr[i+1]=x;
		arr[lst]=y;
		//placing the pivot to its correct position.
		return i+1;
	}
	static int[] quickSort(int arr[],int str,int lst) {
		if(str<lst) {
			int pi=partition(arr,str,lst);
			//partition method is called.
			quickSort(arr, str,(pi-1));//recursion
			//sorting the elements present before the pi.
			quickSort(arr,(pi+1), lst);
			//sorting the elements present after the pi.
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[]= {100,21,305,94,88,502,11,211};
		for(int i=0;i<8;i++) {
			System.out.println("Element in the "+(i+1)+"th position is "+ arr[i]);
			//printing array elements with position.
		}
		System.out.println();
		arr=quickSort(arr,0,7);
		//calling quickSort method to perform sorting.
		
		
		System.out.println("The second largest number in the array is "+arr[6]);
		//printing 2nd largest number in the array.
		System.out.println();
		
		
		System.out.println("The third smallest number in the array is "+arr[2]);
		//printing 3rd smallest number in the array.
		System.out.println();
		
		int[] arrCopy=arr;
		//Copying array elements from one array to another array.
		
		
		System.out.print("Copied array:");
		for(int i=0;i<8;i++) {
			System.out.print(arrCopy[i]+" ");
		}
	}

}

package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestArray {

	public static void find2ndSmallest(int[] arr) {
		 
		 
	        Arrays.sort(arr);
	 
	        System.out.println("The 2nd Smallest number is :"+arr[1]);
	        
	}
	
	public static void main(String[] args) {
	 
		
	 System.out.println("Enter the array size to create Array");
	 Scanner sc = new Scanner(System.in);
	 int size=sc.nextInt();
	 int array[]= new int[size];
	 System.out.println("ENter the values one by one: ");
	 
	 for(int i=0;i<size;i++) {
		 array[i]=sc.nextInt();
	 }
	 
	 find2ndSmallest(array);
	}
}
	


package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class reverseANDsort {

	public static void reverseSort(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			int temp = arr[i];
			arr[i]=0;
			while(temp>0) {
				arr[i]=(arr[i]*10)+(temp%10);
				temp/=10;
			}
		}
		
		 Arrays.sort(arr);
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(" "+arr[i]);
		 }
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the size to make an array of numbers: ");
		Scanner sc =new Scanner(System.in);
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the numbers one by one :");
		for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
			
		}
		
		System.out.println("The reversed and sorted array is: ");
		reverseSort(arr);
	}
	
}
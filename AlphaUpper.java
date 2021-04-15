package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class AlphaUpper {
	
	public static String[] SortandCaseChange(String[] arr) {
		
		Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length();j++) {
				if(arr[i].length()%2==0) {
					arr[i]= arr[i].substring(0,(arr[i].length()/2)+1).toUpperCase()+arr[i].substring((arr[i].length()/2)+1);
				}
				else
					arr[i]= arr[i].substring(0,(arr[i].length()/2)+2).toUpperCase()+arr[i].substring((arr[i].length()/2)+1);
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the size to create Array of String Objects");
		Scanner sc = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		int size=sc.nextInt();
		String arr[]= new String[size];
		System.out.println("Enter the Strings one by one");
		for(int i=0;i<size;i++) {
			String s=ss.nextLine();
			arr[i]=s;
		}
		
		System.out.println("The sorted and half Uppercased strings are displayed below:");
		
		arr=SortandCaseChange(arr);
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		
	}
	

}
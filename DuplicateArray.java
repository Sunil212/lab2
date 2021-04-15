package lab2;

import java.util.*;
import java.util.Arrays;

public class DuplicateArray {
	
	public static void main(String[] args) {
		
	System.out.print("Enter the number of values to enter : ");
	Scanner sc = new Scanner(System.in);
	int arrSize =sc.nextInt();
	int duplicatesArray[]= new int[arrSize];
	
	
	duplicatesArray=new  DuplicateArray().inputElements(arrSize);
	new DuplicateArray().setUniqueElements(duplicatesArray,arrSize);
	//new DuplicateArray().display(uniqueArray);
					
	sc.close();
	}
	public int[] inputElements(int size) {
		System.out.println("Enter the array values one by one : ");
		Scanner sc = new Scanner(System.in);
		int tempArray[] = new int[size];
		for(int i=0;i<size;i++) {
			tempArray[i]=sc.nextInt();
		}
		sc.close();
		return tempArray;
		
	}
	public void setUniqueElements(int array[],int size) {
		int index = 0; 
		 int tempArray[] = new int[size];
         
	        for (int i = 0; i < size; i++)   
	        {   
	            int flag = 0;  
	              
	            for (int j = 0; j < i; j++){  
	                if (array[i] == array[j]){   
	                    flag = 1;  
	                    break;   
	                }  
	            }  
	              
	            if (flag == 0){   
	                tempArray[index] = array[i];  
	                index++;    
	            }  
	        } 
	        
	        
	    		
	    		//Arrays.sort(tempArray,Collections.reverseOrder());
	    		System.out.println("\nThe unique array in reverse order  is : ");
	    		for(int i=index;i>=0;i--) {
	    			if(tempArray[i]!=0) {
	    				
	    			System.out.println(" " +tempArray[i] + " ");
	    			}
	    		}
	    	
		}
		
	
	}
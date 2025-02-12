package com.epam.mjc.stage0;



/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
    	String [] seasons =  {"winter", "spring", "summer", "autumn"};
    	return seasons;

    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
    	int [] numbers = new int[length];
    	for (int i=1;i<=length;i++)
    		numbers[i-1]= i;
        return numbers;

    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
    	int sum=0;
    	for (int i=0;i<=arr.length-1;i++) {
    		sum = sum + arr[i];}
        return sum;

    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
          int index=0;
          for (int i =1 ; i<arr.length;i++) {
        	  if(arr[i]==number) {
        		  index=i;
                 break;
        	  }  
              else { index=-1;}
    }
          return index;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
       String[] reverse = new String[arr.length];
       for (int i=0;i<arr.length;i++) {
    	   reverse[i] = arr[arr.length-1-i];}
       
       //System.arraycopy(arr, 0, dest, 2, 5)
       return reverse;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
    	int counter=0;
    	int index=0;
    	for (int i=0;i<=arr.length-1;i++) {
    		if (arr[i]>0)
     	   counter=counter+1;
    	}
    	int [] number= new int[counter];
    	for (int i=0;i<=arr.length-1;i++) {
   		 if (arr[i]>0) {
   			 index=index+1;
   			 number[index-1] = arr[i];
   		 }	
   	 }	
    	
    	return number;

    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
    	int temp []= {0,2};
		int rowsNumber= arr.length;
	    for (int i=0; i<rowsNumber;i++) {
			for(int j=i+1;j<rowsNumber;j++) {
					if (arr[i].length>arr[j].length) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
			 }
		 sort(arr[i]);
			
		}
	return arr;
 }
	public static int[] sort(int[] arr_1D) {
		  int temp=0;
	      for (int i = 0; i <arr_1D.length; i++) {     
             for (int j = i+1; j <arr_1D.length; j++) {     
                if(arr_1D[i] >arr_1D[j]) {      //swap elements if not in order
                temp = arr_1D[i];    
                arr_1D[i] = arr_1D[j];    
                arr_1D[j] = temp;    
             }     
          }     
      } 
        return arr_1D;
	}
}

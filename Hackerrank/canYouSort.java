package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class canYouSort {
	
	static void customSort(int[] arr) {
		int[] a = new int[arr.length];
		int[] values = new int[arr.length];
		int prev=-1,k=0;
		int max =-1;
		Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
        	int fre = countOccurences(arr[i],arr);
        	
        	if(fre >=1 && arr[i] != prev)
        	{
        		prev = arr[i];
        		values[k] = arr[i];
        		a[k] = fre;
        		if(max < a[k]){
        			max = fre;
        		}
        		//System.out.println("element is " + values[k] + " frequency is " + a[k]);
        		k++;
        	}else{
        		break;
        	}
        	
        }
      
        for(int j=1;j <= max;j++){
        	for(int l=0; l < a.length;l++){
                int num = a[l];
        		if(num == j){
        			for(int h=0;h<num;h++){
        				System.out.println(values[l]);
        			}
        		}
        	}
        }
       
	     
    }

    static int countOccurences(int num, int[] arr){
             int res=0;
             int length = arr.length;
             for(int i=0;i<length;i++){
                 if(num == arr[i]){
                     res++;
                 }
             }

             return res;

         }
    


    



	   public static void main(String[] args)  {
	        Scanner in = new Scanner(System.in);
	        int arr_size = 0;
	        arr_size = Integer.parseInt(in.nextLine().trim());

	        int[] arr = new int[arr_size];
	        for(int i = 0; i < arr_size; i++) {
	            int arr_item;
	            arr_item = Integer.parseInt(in.nextLine().trim());
	            arr[i] = arr_item;
	        }

	        customSort(arr);
	        
	    }
	}


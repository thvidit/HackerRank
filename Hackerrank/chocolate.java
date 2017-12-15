package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class chocolate {
	static void calculate(int[] arr) {
        for(int i =0;i<arr.length; i++){
        	int n =0,sum=0;
       
            
            if(arr[i]%2 ==0){
                n = arr[i] /2;
            }else{
                n = arr[i]/2 + 1;
            }
            
            sum = n*n;
            System.out.println(sum);
            
        }
        
   
    
 }
	 
	 static int great(int n){
         float n1 = n/365f;
         int n2 = (int) n1;
         double remain = (n1-n2)*365;
         int remain1 = (int) remain;
         System.out.println("Remain" + remain1 + " n1= " + n1);
         int sum = n2 * 33489;
                int n3 =0;
                if(remain1%2 ==0){
                    n3 = remain1/2;
                }else{
                    n3 = remain1/2 + 1;
                }
                
                sum = sum + n3*n3;
                return sum;
                //System.out.println(sum);
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

	        calculate(arr);
	        
	    }
	}

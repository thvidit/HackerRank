package Hackerrank;

import java.io.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
	
	public class listmax {
	    public static void main(String[] args){
	    	int operations=0;
	    	Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			int n = Integer.parseInt(str.split(" ")[0]);
			int m = Integer.parseInt(str.split(" ")[1]);
			ArrayList<Integer> arr = new ArrayList<Integer>(n);
			for(int i = 0; i < n; i++)
			{
				arr .add(0);
			}
			
			if(n >=1 && n <= 10000000 && m >= 1 && m <= 1000000)
			{
				while(operations != m)
				{
					String line = sc.nextLine();
					int a = Integer.parseInt(line.split(" ")[0]);
					int b = Integer.parseInt(line.split(" ")[1]);
					int k = Integer.parseInt(line.split(" ")[2]);
					
					if(a >= 1 && a <= n && b >= 1 && b <= n && k >=1 && k <= 1000000000)
					{
						addNumber(arr,a,b,k);
					}
					operations++;
				}
				Collections.sort(arr);
				System.out.println(arr.get(arr.size() -1 ));
			}
	      
	      
	      
	    }
	    
	    static void addNumber(ArrayList<Integer> arr,int a, int b, int k){
	    	for(int i =a-1;i<b;i++){
	    	int value = arr.get(i) +1;
	    	arr.set(i, value);
	    	
	    	}
	    }
	}
	    
	   



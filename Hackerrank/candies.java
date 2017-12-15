package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class candies {
	
	 static long getCandies(long n, long p) {
		  //  long n1 = n/2;
	        long[] arr = new long[(int) n];
	        int j=0;
	        long value =0 ;
	        for(int i=1;i<=n/2+1; i++){
	            if(n%i == 0){
	                arr[j] = i;
	                
	                if(j == p-1){
	  	        	  		value = arr[j];
	  	        	  		break;
	  	          }else{
	  	        	  value = 0;
	  	          }
	                j++;
	            }
	          
	        }

	       return value;
	        
	    }


	 public static void main(String[] args) throws IOException {
	        Scanner in = new Scanner(System.in);
	        final String fileName = System.getenv("OUTPUT_PATH");
	        BufferedWriter bw = null;
	        if (fileName != null) {
	            bw = new BufferedWriter(new FileWriter(fileName));
	        }
	        else {
	            bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        }

	        long res;
	        long n;
	        n = Long.parseLong(in.nextLine().trim());

	        long p;
	        p = Long.parseLong(in.nextLine().trim());

	        res = getCandies(n, p);
	        bw.write(String.valueOf(res));
	        bw.newLine();

	        bw.close();
	    }
	}



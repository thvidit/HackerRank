package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class primeornot {

	
	public static int smallestFactor(long num){
		 for (int i = 2; i*i<= num; i++) 
		    {   
		        if (num % i == 0)
		        {
		            return i;
		        }
		        
		    }
		 
		 int num1 = (int) num;

		    return num1;
	
	}
	   

	    static int isPrime(long n) {
	    	 boolean prime = true;
	    	 int sqrt = (int) Math.sqrt(n) + 1; 
	    	 for (int i = 2; i < sqrt; i++) { if (n % i == 0) { 
	    		 // number is perfectly divisible - no prime 
	    		 return smallestFactor(n);
	    		 } 
	    	 }
	    	 return 1;
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

	        int res;
	        long n;
	        n = Long.parseLong(in.nextLine().trim());

	        res = isPrime(n);
	        bw.write(String.valueOf(res));
	        bw.newLine();

	        bw.close();
	    }
	}

}

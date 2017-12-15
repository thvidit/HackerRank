package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class countingPairs {
	
	
	
	static int countPairs(int[] numbers, int k) {
		int n = numbers.length, count=0;
		int l = 0;
	    int r = 0;
	    Arrays.sort(numbers);
	    while(r < n)
	    {
	         if(numbers[r] - numbers[l] == k)
	        {
	              count++;
	              l++;
	              r++;
	        }
	         else if(numbers[r] - numbers[l] > k)
	              l++;
	         else 
	              r++;
	    }   
	    return count;
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
	        int numbers_size = 0;
	        numbers_size = Integer.parseInt(in.nextLine().trim());

	        int[] numbers = new int[numbers_size];
	        for(int i = 0; i < numbers_size; i++) {
	            int numbers_item;
	            numbers_item = Integer.parseInt(in.nextLine().trim());
	            numbers[i] = numbers_item;
	        }

	        int k;
	        k = Integer.parseInt(in.nextLine().trim());

	        res = countPairs(numbers, k);
	        bw.write(String.valueOf(res));
	        bw.newLine();

	        bw.close();
	    }
	}


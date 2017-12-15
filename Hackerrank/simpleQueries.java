package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class simpleQueries {
	
	 static int[] counts(int[] nums, int[] maxes) {
		Arrays.sort(nums);
		int[] arr = new int[maxes.length];
		for(int i=0; i<maxes.length; i++){
			 int index = checkIndex(nums, 0, maxes.length-1, nums.length);
			 arr[i] = index;
		}
		return arr;
	    }

	 static int checkIndex(int arr[], int l, int h, int x)
	    {
	        while (l <= h)
	        {
	            int mid = (l+h) / 2;
	      
	            // if 'x' is greater than or equal to arr[mid], 
	            // then search in arr[mid+1...h]
	            if (arr[mid] <= x)
	                l = mid + 1;
	      
	            // else search in arr[l...mid-1]    
	            else
	                h = mid - 1;    
	        }
	          
	        // required index
	        return h;
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

	        int[] res;
	        int nums_size = 0;
	        nums_size = Integer.parseInt(in.nextLine().trim());

	        int[] nums = new int[nums_size];
	        for(int i = 0; i < nums_size; i++) {
	            int nums_item;
	            nums_item = Integer.parseInt(in.nextLine().trim());
	            nums[i] = nums_item;
	        }

	        int maxes_size = 0;
	        maxes_size = Integer.parseInt(in.nextLine().trim());

	        int[] maxes = new int[maxes_size];
	        for(int i = 0; i < maxes_size; i++) {
	            int maxes_item;
	            maxes_item = Integer.parseInt(in.nextLine().trim());
	            maxes[i] = maxes_item;
	        }

	        res = counts(nums, maxes);
	        for(int res_i = 0; res_i < res.length; res_i++) {
	            bw.write(String.valueOf(res[res_i]));
	            bw.newLine();
	        }

	        bw.close();
	    }
	}


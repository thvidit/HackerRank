package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class power {

	 static int[] isPowerOf2(int[] nums) {
 		for(int i=0;i<nums.length;i++){
 			nums[i] = checkPower(nums[i]);
 			
 		}
 		
 		return nums;

	    }
	 
	 static int checkPower(int n){
		 if (n == 0)
			    return 0;
			  while (n != 1)
			  {
			    if (n%2 != 0)
			      return 0;
			    n = n/2;
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

	        int[] res;
	        int nums_size = 0;
	        nums_size = Integer.parseInt(in.nextLine().trim());

	        int[] nums = new int[nums_size];
	        for(int i = 0; i < nums_size; i++) {
	            int nums_item;
	            nums_item = Integer.parseInt(in.nextLine().trim());
	            nums[i] = nums_item;
	        }

	        res = isPowerOf2(nums);
	        for(int res_i = 0; res_i < res.length; res_i++) {
	            bw.write(String.valueOf(res[res_i]));
	            bw.newLine();
	        }

	        bw.close();
	    }
	}


package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class cutAStick {
	
	static int[] cutSticks(int[] lengths) {
		
		findMinimum(lengths);
		return countArray(lengths);
	}
	
	
	static int[] countArray(int[] arr){
	int[] countArray = new int[50];
	int min=0;
	Arrays.sort(arr);
	if(min =0){
		
	}
	min = arr[0];
	int j=0,count =0;
	for(int i=0;i<arr.length;i++){
		if(arr[i] >= 1){
			arr[i] = arr[i] -min;
			
			count++;
		}
	}
	countArray[j] = count;
	j++;
	countArray(arr,findMinimum(arr));
	
	return countArray;
		
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
	        int lengths_size = 0;
	        lengths_size = Integer.parseInt(in.nextLine().trim());

	        int[] lengths = new int[lengths_size];
	        for(int i = 0; i < lengths_size; i++) {
	            int lengths_item;
	            lengths_item = Integer.parseInt(in.nextLine().trim());
	            lengths[i] = lengths_item;
	        }

	        res = cutSticks(lengths);
	        for(int res_i = 0; res_i < res.length; res_i++) {
	            bw.write(String.valueOf(res[res_i]));
	            bw.newLine();
	        }

	        bw.close();
	    }
	}


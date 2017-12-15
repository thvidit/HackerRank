package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class minArrSumUnique {
	
	static int countOccurences(int num, int[] arr){
		 int res=0;
		 int length = arr.length;
		 for(int i=0;i<length;i++){
			 if(num == arr[i]){
				 res++;
				 if(res>1){
					 arr[i] = arr[i] +1;
					 countOccurences(arr[i],arr);
				 }
			 }
		 }
		 
		 return res;
		 
	 }
	
	static int getMinimumUniqueSum(int[] arr) {
		int num=0; int occurence=0;
		int sum=0;
			for(int i=0;i<arr.length;i++){
				num = arr[i];
				countOccurences(num,arr);
				
			}
			for(int j =0;j<arr.length;j++){
				
				sum = sum + arr[j];
			}
			return sum;
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
    int arr_size = 0;
    arr_size = Integer.parseInt(in.nextLine().trim());

    int[] arr = new int[arr_size];
    for(int i = 0; i < arr_size; i++) {
        int arr_item;
        arr_item = Integer.parseInt(in.nextLine().trim());
        arr[i] = arr_item;
    }

    res = getMinimumUniqueSum(arr);
    bw.write(String.valueOf(res));
    bw.newLine();

    bw.close();
}
}

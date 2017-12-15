package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sumTwoNumbers {

	static int numberOfPairs(int[] a, long k) {
		int count=0;
        Arrays.sort(a);
        //int l = a[a.length - 1] - a[0];
		HashMap<Integer,Integer> map = new HashMap<>();
			for(int i=0; i<a.length; i++){
				for(int j=i+1; j<a.length;j++){
					if(a[i] + a[j] == k){
						//if(arr[Math.abs(a[i] -a[j])] == 0){
						if(map.get(a[i])!=null && map.get(a[i])==a[j]){
							
						}else{
							count++;
							map.put(a[i], a[j]);
						}
						//	arr[Math.abs(a[i] -a[j])] = 1;
					//	}
						
					}
				}
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
	        int a_size = 0;
	        a_size = Integer.parseInt(in.nextLine().trim());

	        int[] a = new int[a_size];
	        for(int i = 0; i < a_size; i++) {
	            int a_item;
	            a_item = Integer.parseInt(in.nextLine().trim());
	            a[i] = a_item;
	        }

	        long k;
	        k = Long.parseLong(in.nextLine().trim());

	        res = numberOfPairs(a, k);
	        bw.write(String.valueOf(res));
	        bw.newLine();

	        bw.close();
	    }
	}



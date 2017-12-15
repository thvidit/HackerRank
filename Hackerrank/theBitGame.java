package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class theBitGame {

	static int maxXor(int left, int right, int k) {
		 int max= Integer.MIN_VALUE;
         for(int i=left;i<=right;i++){
             for(int j=left;j<=right;j++){
               int c = i^j;
               if(max < c && c <= k){
                   max =c;
               }
             }
         }
 
         return max;

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
	        int left;
	        left = Integer.parseInt(in.nextLine().trim());

	        int right;
	        right = Integer.parseInt(in.nextLine().trim());

	        int k;
	        k = Integer.parseInt(in.nextLine().trim());

	        res = maxXor(left, right, k);
	        bw.write(String.valueOf(res));
	        bw.newLine();

	        bw.close();
	    }
	}

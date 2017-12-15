package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class slotMachine {

	 static int slotGame(String[] spins) {
		int n = spins.length;
		int m= spins[0].length();
		int sum=0;
		int[][] arr = new int[n][m];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				char[] string = spins[i].toCharArray();
				Arrays.sort(string);
				arr[i][j] = string[j] - 48;
				System.out.println("Element" + "[" + i + "]" + "[" + j + "] " + arr[i][j]);
			}
		}
				
		for(int l=0; l < m; l++){
			int max = Integer.MIN_VALUE;
			for(int z=0;z < n; z++){
				if(max < arr[z][l]){
					 max = arr[z][l];
				} 
			 }
			sum = sum+ max; 
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
	        int spins_size = 0;
	        spins_size = Integer.parseInt(in.nextLine().trim());

	        String[] spins = new String[spins_size];
	        for(int i = 0; i < spins_size; i++) {
	            String spins_item;
	            try {
	                spins_item = in.nextLine();
	            } catch (Exception e) {
	                spins_item = null;
	            }
	            spins[i] = spins_item;
	        }

	        res = slotGame(spins);
	        bw.write(String.valueOf(res));
	        bw.newLine();

	        bw.close();
	    }
	}

package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class countingGroups {
	 static int[] countGroups(int[][] m, int[] t) {
		 int size = m.length;
		 int k=0;
		
		 int[] ret  = new int[t.length];
		 ArrayList<Integer> arr = new ArrayList<Integer>();
		 		for(int i=0; i<size;i++){
		 			for(int j=0; j<size;j++){
		 					if(m[i][j] ==1){
		 						arr.add(i+j);
		 						k++;
		 					}
		 		
		 			}
		 		}
		 		
		 for(int w=0;w<t.length;w++){
			 int group=t[w];
			 int count=0;
			 for(int l=0; l < arr.size();l++){
				 for(int z=l+1;z<arr.size();z++){
					 if(arr.get(l)- arr.get(z) == group){
						count++;
				 }
			 }
		 }
			 ret[w] = count;
			 System.out.println(" ret " + ret[w] + " group " + group);
	    }
		 return ret;
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
	        int m_rows = 0;
	        int m_cols = 0;
	        m_rows = Integer.parseInt(in.nextLine().trim());
	        m_cols = Integer.parseInt(in.nextLine().trim());

	        int[][] m = new int[m_rows][m_cols];
	        for(int m_i = 0; m_i < m_rows; m_i++) {
	            for(int m_j = 0; m_j < m_cols; m_j++) {
	                m[m_i][m_j] = in.nextInt();

	            }
	        }

	        if(in.hasNextLine()) {
	          in.nextLine();
	        }

	        int t_size = 0;
	        t_size = Integer.parseInt(in.nextLine().trim());

	        int[] t = new int[t_size];
	        for(int i = 0; i < t_size; i++) {
	            int t_item;
	            t_item = Integer.parseInt(in.nextLine().trim());
	            t[i] = t_item;
	        }

	        res = countGroups(m, t);
	        for(int res_i = 0; res_i < res.length; res_i++) {
	            bw.write(String.valueOf(res[res_i]));
	            bw.newLine();
	        }

	        bw.close();
	    }
	}

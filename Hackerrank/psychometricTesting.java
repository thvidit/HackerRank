package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class psychometricTesting {

	   
	    static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
	    	int n = lowerLimits.length;
	    	int num = scores.length;
	    	int[] answer= new int[n];
	    	for(int i=0;i < n;i++){
	    		int l = lowerLimits[i];
	    		int h = upperLimits[i];
	    		int count =0;
	    		for(int j=0;j<num;j++){
	    			if(scores[j] >= l && scores[j] <= h){
	    				count++;
	    			}
	    		}
	    		answer[i] = count;
	    	}
	    	
	    	
	    	
	    	return answer; // changed
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
	        int scores_size = 0;
	        scores_size = Integer.parseInt(in.nextLine().trim());

	        int[] scores = new int[scores_size];
	        for(int i = 0; i < scores_size; i++) {
	            int scores_item;
	            scores_item = Integer.parseInt(in.nextLine().trim());
	            scores[i] = scores_item;
	        }

	        int lowerLimits_size = 0;
	        lowerLimits_size = Integer.parseInt(in.nextLine().trim());

	        int[] lowerLimits = new int[lowerLimits_size];
	        for(int i = 0; i < lowerLimits_size; i++) {
	            int lowerLimits_item;
	            lowerLimits_item = Integer.parseInt(in.nextLine().trim());
	            lowerLimits[i] = lowerLimits_item;
	        }
	   }
}
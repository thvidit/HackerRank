package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class metalSurplus {
	
	  static int maxProfit(int costPerCut, int salePrice, int[] lengths) {

	    	int maxL = Integer.MIN_VALUE;
	    	int maxP = Integer.MIN_VALUE;
	    	
	    	for (int i=0;i<lengths.length;i++) {
	    		if (lengths[i] > maxL) {
	    			maxL = lengths[i];
	    		}
	    	}
	    	
	    	
	    	for (int i = 1; i < maxL; i++) {
	    		
	        	int wastesSum = 0, cutCountsSum=0, lengthSum = 0;
	        	
	    		for (int j=0; j<lengths.length; j++) {
	    			
	        		lengthSum = lengthSum + lengths[j];
	        		
	        		if (lengths[j] % i == 0) {
	        			cutCountsSum = cutCountsSum + (lengths[j]/i - 1);
	        		} else {
	        			cutCountsSum = cutCountsSum + (lengths[j]/i);
	        		}
	        		
	        		wastesSum = wastesSum + (lengths[j]%i);
	        	}
	    		
	    		int p = (lengthSum * salePrice) - (cutCountsSum * costPerCut) - (wastesSum * salePrice);
	    		
	    		if (p > maxP) {
	    			maxP  = p;
	    		}
	    	}
	    	
	    	return maxP;
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
        int costPerCut;
        costPerCut = Integer.parseInt(in.nextLine().trim());

        int salePrice;
        salePrice = Integer.parseInt(in.nextLine().trim());

        int lengths_size = 0;
        lengths_size = Integer.parseInt(in.nextLine().trim());

        int[] lengths = new int[lengths_size];
        for(int i = 0; i < lengths_size; i++) {
            int lengths_item;
            lengths_item = Integer.parseInt(in.nextLine().trim());
            lengths[i] = lengths_item;
        }

        res = maxProfit(costPerCut, salePrice, lengths);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}


package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class cheaterAlex {
	 static int verifyItems(String[] origItems, float[] origPrices, String[] items, float[] prices) {
		 int index1=0;
		 int index2=0;
		 int count=0;
		 for(int i =0 ; i < items.length; i++){
		 		for(int j = 0; j < origItems.length; j++){
		 		if(items[i].equals(origItems[j])){
		 			index1 = i;
		 			index2 = j;
		 			if(checkPrice(i,j,prices,origPrices)){
		 			count= count+1;
                    }
		 		}
		 		
		 		}
		 	}
		 return count;
		 
	    }
	 
	 static boolean checkPrice(int index1, int index2, float[] prices, float[] origPrices){
		 if(prices[index1] != origPrices[index2]){
			 return true;
		 }
		 return false;
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
	        int origItems_size = 0;
	        origItems_size = Integer.parseInt(in.nextLine().trim());

	        String[] origItems = new String[origItems_size];
	        for(int i = 0; i < origItems_size; i++) {
	            String origItems_item;
	            try {
	                origItems_item = in.nextLine();
	            } catch (Exception e) {
	                origItems_item = null;
	            }
	            origItems[i] = origItems_item;
	        }

	        int origPrices_size = 0;
	        origPrices_size = Integer.parseInt(in.nextLine().trim());

	        float[] origPrices = new float[origPrices_size];
	        for(int i = 0; i < origPrices_size; i++) {
	            float origPrices_item;
	            origPrices_item = Float.parseFloat(in.nextLine().trim());
	            origPrices[i] = origPrices_item;
	        }

	        int items_size = 0;
	        items_size = Integer.parseInt(in.nextLine().trim());

	        String[] items = new String[items_size];
	        for(int i = 0; i < items_size; i++) {
	            String items_item;
	            try {
	                items_item = in.nextLine();
	            } catch (Exception e) {
	                items_item = null;
	            }
	            items[i] = items_item;
	        }

	        int prices_size = 0;
	        prices_size = Integer.parseInt(in.nextLine().trim());

	        float[] prices = new float[prices_size];
	        for(int i = 0; i < prices_size; i++) {
	            float prices_item;
	            prices_item = Float.parseFloat(in.nextLine().trim());
	            prices[i] = prices_item;
	        }

	        res = verifyItems(origItems, origPrices, items, prices);
	        bw.write(String.valueOf(res));
	        bw.newLine();

	        bw.close();
	    }
	}


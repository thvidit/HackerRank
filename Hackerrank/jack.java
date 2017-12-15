package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jack {
	
	
	
	 static int maxStep(int n, int k) {
	        int steps=0;
	        int skip = 0;
	        int current =0;
	        for(int i=1;i<=n;i++){
	        steps = i;
	        skip =k;
	        if(current + steps == k){
	        	//Do Nothing
	        }else{
	        	current =current +i;
	        }
	        }
	        
	        
	        
	        return current;

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
    int n;
    n = Integer.parseInt(in.nextLine().trim());

    int k;
    k = Integer.parseInt(in.nextLine().trim());

    res = maxStep(n, k);
    bw.write(String.valueOf(res));
    bw.newLine();

    bw.close();
}
}

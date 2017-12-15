package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class complement {

	
	
	/*
	 * Complete the function below.
	 */
	 static int getIntegerComplement(int n) {
	       
		    String binaryString = Integer.toBinaryString(n);
		    int length= binaryString.length();
		    StringBuilder value = new StringBuilder("");
		    int i=0;
		    while(i<length){
		        if(binaryString.charAt(i)=='1')
		        {
		            value.append("0");
		            i++;
		        }else{
		            value.append("1");
		            i++;
		        }
		    }
		        
		    int answer = Integer.parseInt(value.toString());
		    return answer;

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

        res = getIntegerComplement(n);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}


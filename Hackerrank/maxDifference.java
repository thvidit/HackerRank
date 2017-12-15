package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class maxDifference {

	 static int maxDifference(int[] a) {
		int min = a[0];
		int maxDifference = a[1] - min;
		int length = a.length;
		for(int i=0; i<length;i++){
			if(a[i] - min > maxDifference){
				maxDifference = a[i] - min;
			}
			if(min>a[i]){
				min = a[i];
			}
		}
		if(maxDifference==0){
			maxDifference = -1;
		}
		return maxDifference;
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

    res = maxDifference(a);
    bw.write(String.valueOf(res));
    bw.newLine();

    bw.close();
}
}


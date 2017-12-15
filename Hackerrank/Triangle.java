package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Triangle {
	

    /*
     * Complete the function below.
     */
	static String[] triangleOrNot(int[] a, int[] b, int[] c) {
	int n = a.length;
	String[] myString = new String[n];
	int[] arr = new int[3];
	for(int i=0; i<n ;i++){
		arr[0] = a[i];
		arr[1] = b[i];
		arr[2]= c[i];
		Arrays.sort(arr);
		if(arr[0] + arr[1] >arr[2]){
			myString[i] ="Yes";
		
		}
		else{
			myString[i] = "No";
		}
	}
	
	
	return myString;
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

    String[] res;
    int a_size = 0;
    a_size = Integer.parseInt(in.nextLine().trim());

    int[] a = new int[a_size];
    for(int i = 0; i < a_size; i++) {
        int a_item;
        a_item = Integer.parseInt(in.nextLine().trim());
        a[i] = a_item;
    }

    int b_size = 0;
    b_size = Integer.parseInt(in.nextLine().trim());

    int[] b = new int[b_size];
    for(int i = 0; i < b_size; i++) {
        int b_item;
        b_item = Integer.parseInt(in.nextLine().trim());
        b[i] = b_item;
    }

    int c_size = 0;
    c_size = Integer.parseInt(in.nextLine().trim());

    int[] c = new int[c_size];
    for(int i = 0; i < c_size; i++) {
        int c_item;
        c_item = Integer.parseInt(in.nextLine().trim());
        c[i] = c_item;
    }

    res = triangleOrNot(a, b, c);
    for(int res_i = 0; res_i < res.length; res_i++) {
        bw.write(String.valueOf(res[res_i]));
        bw.newLine();
    }

    bw.close();
}
}


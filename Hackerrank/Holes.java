package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Holes {


static int countHoles(int num) {
	String myString = new String("");
	myString = Integer.toString(num);
	int length= myString.length();
	int sum =0;
	
	for(int i=0; i<length;i++){
		if(myString.charAt(i) == '0' || myString.charAt(i) == '4' || myString.charAt(i) == '6' 
				||myString.charAt(i) == '9'){
			sum = sum +1;
			
		}else if(myString.charAt(i) == '8'){
			sum = sum+2;
		}
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
    int num;
    num = Integer.parseInt(in.nextLine().trim());

    res = countHoles(num);
    bw.write(String.valueOf(res));
    bw.newLine();

    bw.close();
}
}

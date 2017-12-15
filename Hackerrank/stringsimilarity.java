package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class stringsimilarity {
	static int[] stringSimilarity(String[] inputs) {
		
		int[] arr = new int[inputs.length];
			for(int i=0;i<inputs.length;i++){
				int count =0 ;
				for(int j=0;j<inputs[i].length();j++){
					StringBuilder sb = new StringBuilder();
					sb.append(inputs[i].substring(j));
					int k=0;
                    while(k < sb.length() && inputs[i].charAt(k) == sb.charAt(k)){
                        System.out.println("sb is " + sb);

					if(inputs[i].charAt(k) == sb.charAt(k)){
						count++;
                        k++;
                        System.out.println("count is " + count);
					}else{
						break;
					}
				}
				
			}
			
    arr[i] = count;
}
	return arr;
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
    int inputs_size = 0;
    inputs_size = Integer.parseInt(in.nextLine().trim());

    String[] inputs = new String[inputs_size];
    for(int i = 0; i < inputs_size; i++) {
        String inputs_item;
        try {
            inputs_item = in.nextLine();
        } catch (Exception e) {
            inputs_item = null;
        }
        inputs[i] = inputs_item;
    }

    res = stringSimilarity(inputs);
    for(int res_i = 0; res_i < res.length; res_i++) {
        bw.write(String.valueOf(res[res_i]));
        bw.newLine();
    }

    bw.close();
}
}

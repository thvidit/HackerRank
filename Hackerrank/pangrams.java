package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class pangrams {

	    static String isPangram(String[] strings) {
	    		StringBuilder s = new StringBuilder();
	    		for(int i=0;i<strings.length;i++){
	    			int n = checkPangrams(strings[i]);
	    			s.append(n);
	    		}
	    		
	    		return s.toString();
	    }
	    
	    
	    
	    static int checkPangrams(String s){
	    	
	    	boolean[] alphabets = new boolean[26];
	    	int value=1;
	    	int index = 0;
	    	for(int i=0; i<s.length();i++){
	    		if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
	    			index = s.charAt(i) - 'a';
	    			
	    		alphabets[index] = true;	
	    	}
	    	
	    	for(int j=0;j<=25;j++){
	    		if(alphabets[j] == false)	    			
	    			value = 0;		
	    	}
	    	
	    	return value;
	    	
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

	        String res;
	        int strings_size = 0;
	        strings_size = Integer.parseInt(in.nextLine().trim());

	        String[] strings = new String[strings_size];
	        for(int i = 0; i < strings_size; i++) {
	            String strings_item;
	            try {
	                strings_item = in.nextLine();
	            } catch (Exception e) {
	                strings_item = null;
	            }
	            strings[i] = strings_item;
	        }

	        res = isPangram(strings);
	        bw.write(res);
	        bw.newLine();

	        bw.close();
	    }
	}


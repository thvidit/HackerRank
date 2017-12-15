package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class approximateMatching {

	static String calculateScore(String text, String prefix, String suffix) {
		int value=Integer.MIN_VALUE; String string=null;
		int test=0;
		String s1 = text.substring(0,1);
		test = findScore(s1,prefix, suffix);
		if(value<test){
			value= test;
			string = s1;
		}
		for(int j=0; j<text.length();j++){
			
			for(int i=j+1;i<=text.length();i++){
				StringBuilder sb = new StringBuilder();
				if(i<=text.length()+2){
				sb.append(text.substring(j,i));
				System.out.println(" Sub " + text.substring(j,i));
				test = findScore(sb.toString(),prefix, suffix);
				
				
				if(value< test){
					value =  test;
					string = sb.toString();
				}else if(value==test && string.compareTo(sb.toString()) > 0){
					string = sb.toString();
				}
				}
			}
			}
			System.out.println(" value " + value);							
			return string;
	    }
	  
	  static int findScore(String sub, String prefix, String suffix){
		  int prefixScore = 0,suffixScore=0,textScore=0;
		  int i=0,j=0;
		  //System.out.print(" substringCome: " + sub);
		  for(int k=1; k<=sub.length();k++){
			 String s = sub.substring(0,k);
			//System.out.print(" substring " + s);
			 // && prefix.lastIndexOf(s)-1 == prefix.length()-1
			 if(prefix.contains(s) == true){
				// System.out.print("index" + prefix.lastIndexOf(s) + " " + prefix.length());
				 //System.out.print(" mYprefix: " + (prefix.lastIndexOf(s)) + s.length()-1);

				 if((prefix.lastIndexOf(s) + s.length() -1) == (prefix.length()-1)){
					
				 prefixScore = prefixScore + s.length();
				// System.out.print(" prefix: " + prefixScore);
				 }
			 }
			  
		  }
		  
		  for(int l=sub.length()-1;l>=0;l--){
				 String s = sub.substring(l);
				//System.out.print(" substring " + s);
				 if(suffix.contains(s) == true){
					 if((suffix.lastIndexOf(s)) == 0){
					 suffixScore = suffixScore + s.length();
					
					// System.out.print(" suffix " + suffixScore);
					 }
				 }
				  
			  }
		  textScore = prefixScore + suffixScore;
		  return textScore;
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

	        String res=null;
	        String text;
	        try {
	            text = in.nextLine();
	        } catch (Exception e) {
	            text = null;
	        }

	        String prefix;
	        try {
	            prefix = in.nextLine();
	        } catch (Exception e) {
	            prefix = null;
	        }

	        String suffix;
	        try {
	            suffix = in.nextLine();
	        } catch (Exception e) {
	            suffix = null;
	        }

	        try{
	        res = calculateScore(text, prefix, suffix);
	        bw.write(res);
	        bw.newLine();
	        }catch(NullPointerException n){
	        	//
	        	System.out.println(res);
	        }
	        bw.close();
	    }
	}


package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
    

public class mergestrings {

	

    static String mergeStrings(String a, String b) {
    
        
        int n1= a.length();
        int n2 = b.length();
        int n3 = n1 +n2;
        StringBuilder value = new StringBuilder("");
        boolean flag= true;
        int k=0; int l =0;
        for(int i=0; i<n3;i++){
        	if(n1 > 0 && n2 >0){
        	if(flag){
        		value.append(a.charAt(k));
        		k++;
        		flag = false;
        		n1=n1-1;
        		
        	}else{
        		value.append(b.charAt(l));
        		l++;
        		flag = true;
        		n2 =n2-1;
        	}
        	}
        	else if(n1>0){
        		value.append(a.charAt(k));
        		k++;
        		n1 =n1-1;
        	
        	}else if(n2>0){
        		value.append(b.charAt(l));
        		l++;
        		n2=n2-1;
        	}
        }
        
        String answer = value.toString();
        return answer;

    }



public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    final String fileName = System.getenv("OUTPUT_PATH");
    BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
    String res;
    String _a;
    try {
        _a = in.nextLine();
    } catch (Exception e) {
        _a = null;
    }
    
    String _b;
    try {
        _b = in.nextLine();
    } catch (Exception e) {
        _b = null;
    }
    
    res = mergeStrings(_a, _b);
    bw.write(res);
    bw.newLine();
    
    bw.close();
}
}

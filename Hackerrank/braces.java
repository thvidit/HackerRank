package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class braces {
	
	static class stack 
    {
        int top=-1;
        char items[] = new char[100];
 
        void push(char x) 
        {
            if (top == 99) 
            {
                System.out.println("Stack full");
            } 
            else
            {
                items[++top] = x;
            }
        }
 
        char pop() 
        {
            if (top == -1) 
            {
                System.out.println("Underflow error");
                return '\0';
            } 
            else
            {
                char element = items[top];
                top--;
                return element;
            }
        }
 
        boolean isEmpty() 
        {
            return (top == -1) ? true : false;
        }
    }
   

	static boolean match(char c1, char c2){
		if(c1 == '(' && c1 == ')')
			return true;
		if(c1 == '{' && c1 == '}')
			return true;
		if(c1 == '[' && c1 == ']')
			return true;
		else
		return false;
	}
	
	 static String[] braces(String[] values) {
	       String[] arr = new String[values.length];
	       for(int i=0; i < values.length; i++){
	    	   if(balanced(values[i])){
	    		   arr[i] = "YES";
	    	   }else{
	    		   arr[i] ="NO";
	    	   }
	       }
	       return arr;
	        	}
	 
	 static boolean balanced(String string){
		 Stack stack = new Stack();
	        int k=0;
	        	for(int j=0; j<string.length();j++){
	        	
	        	if(string.charAt(j)== '(' || string.charAt(j)== '{' || string.charAt(j)== '[')
	        	{
	        		stack.push(string.charAt(j));  
	        	}
	        	if(string.charAt(j)== ')' || string.charAt(j)== '}' || string.charAt(j)== ']'){
	        		if(stack.isEmpty()){
	        			return false;
	        		}
	        		else if ( !match((char) stack.pop(), string.charAt(j)) )
	                {
	        			return false;
	                }
	        	}
	        	}
	        	if (stack.isEmpty()){
		           return true;
		        	}
		          else
		            {   
		                return false;
		            } 
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
	        int values_size = 0;
	        values_size = Integer.parseInt(in.nextLine().trim());

	        String[] values = new String[values_size];
	        for(int i = 0; i < values_size; i++) {
	            String values_item;
	            try {
	                values_item = in.nextLine();
	            } catch (Exception e) {
	                values_item = null;
	            }
	            values[i] = values_item;
	        }

	        res = braces(values);
	        for(int res_i = 0; res_i < res.length; res_i++) {
	            bw.write(String.valueOf(res[res_i]));
	            bw.newLine();
	        }

	        bw.close();
	    }
	}

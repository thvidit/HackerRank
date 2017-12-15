package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class superStack {
	static void superStack(String[] operations) {
		  final int MAX = 1000;
		    int top=-1;
		    int a[] = new int[MAX];
	        for(int i=0; i<operations.length; i++){
	        	for(int j=0; j<operations[i].length(); j++){
	        		String string = operations[i];
	        	   /* String operation= string.replaceAll("[^a-z]", "");
	        	    int num = Integer.parseInt(string.replaceAll("[^0-9]", "")); */
	        	    String[] tokens = string.split(" ");
	        	    String[] ary = new String[tokens.length];

	        	    int k = 0;
	        	    for (String token : tokens){
	        	    ary[k++] = token; 
	        	    }
	        	    String operation = ary[0];
                  int num1=0,num2=0,num3=0;
                  if(k==2){
	        	    num1 = Integer.parseInt(ary[1]);
                  }
	        	    
	        	    if(k==3){
                      num3 = Integer.parseInt(ary[1]);
	        	    	num2 = Integer.parseInt(ary[2]);
	        	    }
	        	    if(operation.equals("push")){
	        	    	
	        	    	
                          top = push(num1,top,MAX,a);
                      	System.out.println(a[top]);
	        	             break;
	        	    }else if(operation.equals("pop")){
	        	    	if(pop(top,a) == -1){
                          top = pop(top,a);
	        	    		System.out.println("EMPTY");
                          break;
	        	    	}else{
                          top = pop(top,a);
	        	    		System.out.println(a[top]);
                          break;
	        	    	}
	        	    }else if(operation.equals("inc")){
	        	    	inc(num3,num2,a);
      	    		System.out.println(a[top]);
                      break;
	        	    }
	        	    }
	        	}
	        }
	    /* 0 0 0 0 0 0 0 0 0 0   
	     0 1 2 3 4 5 6 7 8 9 */
	    
	  
	  static void inc(int e ,int k,int[] a){
		  for(int i = 0; i<e; i++){
			  a[i] = a[i] + k;
		  }
	  }
	  
	static int push(int x,int top,int MAX,int[] a)
	    {
	        if (top >= MAX)
	        {
	            System.out.println("Stack Overflow");
	            return 0;
	        }
	        else
	        {
	            a[++top] = x;
	            return top;
	        }
	    }
	 
	    static int pop(int top,int[] a)
	    {
	        if (top < 0)
	        {
	            //System.out.println("Stack Underflow");
	            return top;
	        }
	        else
	        {
	            int x = a[top--];
	            return top;
	        }
	    }

	    public static void main(String[] args)  {
	        Scanner in = new Scanner(System.in);
	        int operations_size = 0;
	        operations_size = Integer.parseInt(in.nextLine().trim());

	        String[] operations = new String[operations_size];
	        for(int i = 0; i < operations_size; i++) {
	            String operations_item;
	            try {
	                operations_item = in.nextLine();
	            } catch (Exception e) {
	                operations_item = null;
	            }
	            operations[i] = operations_item;
	        }

	        superStack(operations);
	        
	    }
	}

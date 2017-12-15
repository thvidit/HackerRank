package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class occurences {
	
	//0 0 0 6 6 5 7 8 4 5 1 2 3 2 4
	//0 0 0 1 2 2 3 4 4 5 5 6 6 7 8
	//7 8 1 3 6 6 5 5 4 4 2 2 0 0 0
	static Map<Integer,Integer> numbers = new HashMap<>();
	 static void customSort(int[] arr) {
		 

	     for(int number : arr) {
	         if(numbers.containsKey(number)) {
	             Integer  count = numbers.get(number);
	             numbers.put(number, ++count);
	         } else {
	             numbers.put(number,1);
	         }
	     }
	     
	         }
	 
	 static boolean isMatchingPair(char character1, char character2)
	    {
	       if (character1 == '(' && character2 == ')')
	         return true;
	       else if (character1 == '{' && character2 == '}')
	         return true;
	       else if (character1 == '[' && character2 == ']')
	         return true;
	       else
	         return false;
	    }
	     
	    /* Return true if expression has balanced 
	       Parenthesis */
	    static boolean areParenthesisBalanced(char exp[])
	    {
	       
	       stack st=new stack();
	      
	     
	       for(int i=0;i<exp.length;i++)
	       {
	           
	          
	          if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
	            st.push(exp[i]);
	      
	         
	          if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']')
	          {
	                  
	            
	             if (st.isEmpty())
	               {
	                   return false;
	               } 
	      
	             else if ( !isMatchingPair(st.pop(), exp[i]) )
	               {
	                   return false;
	               }
	          }
	           
	       }
	         
	       /* If there is something left in expression 
	          then there is a starting parenthesis without 
	          a closing parenthesis */
	       
	       if (st.isEmpty())
	         return true; /*balanced*/
	       else
	         {   /*not balanced*/
	             return false;
	         } 
	    } 
	    
final class FrequencyComparator implements Comparator<Integer> {
    Map<Integer,Integer> refMap;
    public FrequencyComparator(Map<Integer,Integer> base) {
        this.refMap = base;
    }

    @Override
    public int compare(Integer k1, Integer k2) {
        Integer val1 = refMap.get(k1);
        Integer val2 = refMap.get(k2);

        int num = val1.compareTo(val2)  ;
        // if frequencies are same then compare number itself
        return  num == 0 ? k1.compareTo(k2)   : num;
    
}


	   
	 
 static void main(String[] args)  {
	        Scanner in = new Scanner(System.in);
	        int arr_size = 0;
	        arr_size = Integer.parseInt(in.nextLine().trim());

	        int[] arr = new int[arr_size];
	        for(int i = 0; i < arr_size; i++) {
	            int arr_item;
	            arr_item = Integer.parseInt(in.nextLine().trim());
	            arr[i] = arr_item;
	        }

	        customSort(arr);
	        
	    }
}






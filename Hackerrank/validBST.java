package Hackerrank;

import java.util.*;

public class validBST {
	
	static boolean validBstOrNot(int[] a,int n){
		Stack<Integer> stack = new Stack<Integer>();
		int root = Integer.MIN_VALUE;
		for(int i =0; i<n; i++){
			if(a[i] < root){
				return false;
			}
		
		
		while(!stack.empty() && stack.peek() <  a[i]){
			root = stack.peek();
			stack.pop();
		}
	
		stack.push(a[i]);
		}
		return true;
	}
	
	 public static void main(String[] args) throws Exception {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		 Scanner scanner = new Scanner(System.in);
		 int queries= scanner.nextInt();
		
		 
		 for(int i=0;i<queries;i++){
			 int values = scanner.nextInt();
			 int[] preorder = new int[values];
			 for(int j=0;j<values;j++){
				 preorder[j] = scanner.nextInt();
				 
			 }
			 boolean answer = validBstOrNot(preorder, values);
			 if(answer){
				 
				 System.out.println("YES");
			 }else{
				 System.out.println("NO");
			 }
		 }
		 
	    }
	}

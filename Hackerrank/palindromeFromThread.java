package Hackerrank;

import java.util.Scanner;

public class palindromeFromThread{
	
	public static void main(String[] args){
	
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a = in.nextInt();
		RunThread thread = new RunThread(a);
	
		thread.start();
		
	}
	
}


class RunThread extends Thread{
	
	int a=-1;
	
	RunThread(int a){
		this.a =a;
	}
	
	public void run(){
		int num =0, remainder =0, initial = a;
		
		while(a>0){
			remainder = a%10;
			num = (num*10) + remainder;
			a = a/10;
		}
		
		if(num == initial)
			System.out.println("Number is a palindrome!");
		else
			System.out.println("Number is not a palindrome!");
		       
	}
	
}

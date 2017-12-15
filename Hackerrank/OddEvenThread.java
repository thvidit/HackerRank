package Hackerrank;

import java.util.Scanner;

public class OddEvenThread{
	
	public static void main(String[] args) {
	
		MyThread thread = new MyThread();
		Thread t = new Thread(thread);
		t.start();
		
	}

}

class MyThread implements Runnable{
	
	@Override
	public void run() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int  number = in.nextInt();
		
		if(number%2==0)
			System.out.println("Number is even!");
		else
			System.out.println("Number is odd!");
		
	}
	
	
}

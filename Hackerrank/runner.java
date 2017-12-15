package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class runner {
	
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the department");
		String department = in.nextLine();
		System.out.println("Enter the Name");
		String name = in.nextLine();
		System.out.println("Enter the Phone");
		String phone = in.nextLine();
		System.out.println("Enter the address");
		String address = in.nextLine();
		
		String[][] records = new String[4][4];
		records[0][0] = "IT";
		records[0][1] = "Vidit";
		records[0][2] = "8130587533";
		records[0][3] = "mindtree";
		records[1][0] = "Admin";
		records[1][1] = "Gourab";
		records[1][2] = "8130587533";
		records[1][3] = "mindtree";
		records[2][0] = "Account";
		records[2][1] = "Shonit";
		records[2][2] = "8130587533";
		records[2][3] = "mindtree";
		records[3][0] = "Admin";
		records[3][1] = "god";
		records[3][2] = "0000000000";
		records[3][3] = "heaven";
		
		
		Arrays.sort(records);
		for()
		
		
	}
	
	static void addEmployee(String[][] database,String department,String name, String phone, String address, int end){
		
		database[end+1][0] = department;
		database[end+1][1] = name;
		database[end+1][2] = phone;
		database[end+1][3] = address;
		
	}
	

}

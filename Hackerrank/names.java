package Hackerrank;

public class names {
	
	public static void main(String[] args){
		String[] arr = {"mahesh","vidit","vidit","vidit","mahesh","vidit"};
		String string = "ramesh";
		String string2 = "vidit";
		int value = getName(string2, arr);
		System.out.print(value);
	}
	
	
	static int getName(String name, String[] names){
		int value = countOccurences(name,names);
		int num =0 ;
		
		if(value ==0){
			num=-1;
		}
		else{
			num= value;
		}
	
		return num;
	}
	
	static int countOccurences(String num, String[] arr){
		 int res=0;
		 int length = arr.length;
		 for(int i=0;i<length;i++){
			 if(num.equals(arr[i])){
				 res++;
			 }
		 }
		 return res;
		 
	 }
	
	
	
	
	
	
	
	
	
	/*
	static boolean match(String one, String two){
		for(int i=0; i<one.length();i++){
			//if(one)
		}
		return true;
	} */

}

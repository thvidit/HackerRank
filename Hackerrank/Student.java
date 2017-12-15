package Hackerrank;

public class Student {
	
	     int rollno;  
	     String name;  
	     static String college = "JSS NOIDA";  
	       
	     static void change(){  
	     college = "Mindtree";  
	     }  
	     
	     void nonStaticChange(){
	    	 college = "Not MiNdTrEe";
	     }
	  
	     Student(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }  
	  
	    void display (){ System.out.println(rollno + " " + name + " " + college);}  
	  
	    public static void main(String args[]){  
	    Student.change();  
	  //  Student.nonStaticChange();
	  
	    Student s1 = new Student (1,"Vidit");  
	    Student s2  = new Student (2,"Shivanshu");  
	    Student s3 = new Student (3,"SimranJeet Singh");  
	  
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    
	    }  
	}  

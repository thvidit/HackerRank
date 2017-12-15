package Hackerrank;

//Java program to demonstrate Anonymous inner class
interface Age
{
  int x = 21;
  void getAge();
}

class anonymousClass
{
	public static void main(String[] args){
	  
      Age obj = new Age() {
          @Override
          public void getAge() {
               // printing  age
              System.out.print("Age is " + x);
          }
      };
      obj.getAge();
  }
}
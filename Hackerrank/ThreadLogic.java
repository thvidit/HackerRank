package Hackerrank;

import java.util.ArrayList;  
import java.util.Date;  
import java.util.List;  
  
public class ThreadLogic implements Runnable   
{  
  public boolean running = false;  
    
  public ThreadLogic()  
  {  
    Thread thread = new Thread(this);  
    thread.start();  
  }  
    
  public static void main (String[] args) throws InterruptedException  
  {  
    List<ThreadLogic> tl = new ArrayList<ThreadLogic>();  
      
    System.out.println("Main Thread," +  
        "the id is: " + Thread.currentThread().getId());  
  
    Date start = new Date();  
  
   
    for (int i=0; i<5; i++)  
    {  
      tl.add(new ThreadLogic());   
    }  
      
    
    for (ThreadLogic threadLogic : tl)  
    {  
      while (threadLogic.running)  
      {  
        Thread.sleep(100);  
      }  
    }  
      
    Date end = new Date();  
    
    long difference = end.getTime() - start.getTime();  
      
    System.out.println ("This whole process took: " + difference/1000 + " seconds.");  
  }  
    
  @Override  
  public void run()   
  {  
    this.running = true;  
    System.out.println("Separate thread, " +  
        "the id is: " + Thread.currentThread().getId());  
      
    try   
    {  
      
      Thread.sleep(5000);  
    }   
    catch (InterruptedException e)   
    {    
      Thread.currentThread().interrupt();  
    }  
    this.running = false;  
  }  
}  
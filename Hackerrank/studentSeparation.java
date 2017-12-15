import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class studentSeparation {
	
	  static int minMoves(int[] avg) {

		  for(int i=0;i<avg.length;i++){
			  int a = avg[i];
			  for(int j=0;j<avg.length;j++){
				// if(a)
			  }
		  }
		  
	    }
	  
	  
	  public static void main(String[] args) throws IOException {
	        Scanner in = new Scanner(System.in);
	        final String fileName = System.getenv("OUTPUT_PATH");
	        BufferedWriter bw = null;
	        if (fileName != null) {
	            bw = new BufferedWriter(new FileWriter(fileName));
	        }
	        else {
	            bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        }

	        int res;
	        int avg_size = 0;
	        avg_size = Integer.parseInt(in.nextLine().trim());

	        int[] avg = new int[avg_size];
	        for(int i = 0; i < avg_size; i++) {
	            int avg_item;
	            avg_item = Integer.parseInt(in.nextLine().trim());
	            avg[i] = avg_item;
	        }

	        res = minMoves(avg);
	        bw.write(String.valueOf(res));
	        bw.newLine();

	        bw.close();
	    }
	}

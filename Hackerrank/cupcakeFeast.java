package Hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class cupcakeFeast {
	
static void maximumCupcakes(String[] trips) {
	
	
	
	int n = trips[0]);
	int c = Integer.parseInt(trips[1]);
	int m = Integer.parseInt(trips[2]);
	
	int cupCakes;
	int cakeFromWraps;
	int wrappers;
	cupCakes= n/c;
	wrappers = cupCakes;
	
	while(wrappers/m >1){
		cakeFromWraps= wrappers/m;
		wrappers = cakeFromWraps;
		cupCakes = cupCakes + cakeFromWraps;
	}
	
	 System.out.print(cupCakes);
	
	

}


public static void main(String[] args)  {
    Scanner in = new Scanner(System.in);
    int trips_size = 0;
    trips_size = Integer.parseInt(in.nextLine().trim());

    String[] trips = new String[trips_size];
    for(int i = 0; i < trips_size; i++) {
        String trips_item;
        try {
            trips_item = in.nextLine();
        } catch (Exception e) {
            trips_item = null;
        }
        trips[i] = trips_item;
    }

    maximumCupcakes(trips);
    
}
}


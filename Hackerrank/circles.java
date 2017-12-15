package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class circles {

	static int[] Circles(int distance, int[] radius, int[] cost) {
		int[] result = new int[radius.length]; 
	    for (int i = 0; i < radius.length; i++) { 
	       // List<Integer> tmp = new ArrayList<Integer>(); 
	    	int[] arr = new int[100000];
	    	int k=0;
	        for (int j = 0; j < radius.length; j++) 
	            if (radius[j] >= distance - radius[i]) {
	                arr[k] = j; 
	                k++;
	            }
	        result[i] = getSmallest(radius, cost, arr, i); 
	    }
	    return result; 
	} 

	static int getSmallest(int[] radius, int[] cost, int[] tmp, int i) { 
	    if (tmp.length == 0) 
	    	return 0; 
	    int result = tmp[0]; 
	    int mincost = cost[i] + cost[tmp[0]]; 
	    for (int j = 1; j < tmp.length; j++) 
	        if (cost[i] + cost[tmp[j]] < mincost) { 
	            mincost = cost[i] + cost[tmp[j]]; 
	            result = tmp[j]; 
	        } 
	    return result + 1;
	}
	 

	 public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        final String fileName = System.getenv("OUTPUT_PATH");
	        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	        int[] res;
	        int _radius_size = 0;
	        _radius_size = in.nextInt();
	        
	        int _distance;
	        _distance = in.nextInt();
	        
	        
	        
	        int[] _radius = new int[_radius_size];
	        int _radius_item;
	        for(int _radius_i = 0; _radius_i < _radius_size; _radius_i++) {
	            _radius_item = in.nextInt();
	            _radius[_radius_i] = _radius_item;
	        }
	        
	        
	        int _cost_size = _radius_size;
	        int[] _cost = new int[_cost_size];
	        int _cost_item;
	        for(int _cost_i = 0; _cost_i < _cost_size; _cost_i++) {
	            _cost_item = in.nextInt();
	            _cost[_cost_i] = _cost_item;
	        }
	        
	        res = Circles(_distance, _radius, _cost);
	        for(int res_i=0; res_i < res.length; res_i++) {
	            bw.write(String.valueOf(res[res_i]));
	            bw.write(' ');
	        }
	        
	        bw.close();
	    }
	}
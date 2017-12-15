package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class minWeight {
	

	 static int minCost(int g_nodes, int[] g_from, int[] g_to, int[] g_weight) {
		int[] costs = dijkstra(makeGraph(g_nodes,g_from,g_to,g_weight),0,g_nodes);
		//int[][] graph = makeGraph(g_nodes,g_from,g_to,g_weight);
		int minCost = costs[1];
		for(int i =1;i<costs.length;i++){
			
			if(minCost > costs[i]){
				minCost = costs[i];
			}
			} 
		int a,b;
		int c= a^b;
	     }
		
		return minCost;
		    }
	 
	
	 
	 static int[][] makeGraph(int g_nodes, int[] g_from, int[] g_to, int[] g_weight){
		 int[][] graph = new int[g_nodes][g_nodes];
		 int length = g_from.length;
		 for(int i =0;i<length;i++){
			 graph[g_from[i]-1][g_to[i]-1] = g_weight[i];
		 }
		 
		 for(int i=0;i<g_nodes;i++){
			 for(int j=0;j<g_nodes;j++){
				 if(graph[i][j] == 0 && i!=j){
					 graph[i][j] = 1;
				 }
			 }
		 }
		 
		 
		return graph;
	 }
	 
	 
	 static int[] dijkstra(int graph[][], int src,int V)
	    {
	        int dist[] = new int[V]; // The output array. dist[i] will hold
	                                 // the shortest distance from src to i
	 
	        // sptSet[i] will true if vertex i is included in shortest
	        // path tree or shortest distance from src to i is finalized
	        Boolean sptSet[] = new Boolean[V];
	 
	        // Initialize all distances as INFINITE and stpSet[] as false
	        for (int i = 0; i < V; i++)
	        {
	            dist[i] = Integer.MAX_VALUE;
	            sptSet[i] = false;
	        }
	 
	        // Distance of source vertex from itself is always 0
	        dist[src] = 0;
	 
	        // Find shortest path for all vertices
	        for (int count = 0; count < V-1; count++)
	        {
	            // Pick the minimum distance vertex from the set of vertices
	            // not yet processed. u is always equal to src in first
	            // iteration.
	            int u = minDistance(dist, sptSet,V);
	 
	            // Mark the picked vertex as processed
	            sptSet[u] = true;
	 
	            // Update dist value of the adjacent vertices of the
	            // picked vertex.
	            for (int v = 0; v < V; v++)
	 
	                // Update dist[v] only if is not in sptSet, there is an
	                // edge from u to v, and total weight of path from src to
	                // v through u is smaller than current value of dist[v]
	                if (!sptSet[v] && graph[u][v]!=0 &&
	                        dist[u] != Integer.MAX_VALUE &&
	                        dist[u]+graph[u][v] < dist[v])
	                    dist[v] = dist[u] + graph[u][v];
	        }
	 
	        // print the constructed distance array
	       // printSolution(dist, V);
	        return dist;
	    }
	 
	 static int minDistance(int dist[], Boolean sptSet[],int V)
	    {
	        // Initialize min value
	        int min = Integer.MAX_VALUE, min_index=-1;
	 
	        for (int v = 0; v < V; v++)
	            if (sptSet[v] == false && dist[v] <= min)
	            {
	                min = dist[v];
	                min_index = v;
	            }
	 
	        return min_index;
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
	        String[] g_nodesm = in.nextLine().split(" ");
	        int g_nodes = Integer.parseInt(g_nodesm[0]);
	        int g_edges = Integer.parseInt(g_nodesm[1]);

	        int[] g_from = new int[g_edges];
	        int[] g_to = new int[g_edges];
	        int[] g_weight = new int[g_edges];

	        for (int g_i = 0; g_i < g_edges; g_i++) {
	            String[] g_fromvw = in.nextLine().split(" ");
	            g_from[g_i] = Integer.parseInt(g_fromvw[0]);
	            g_to[g_i] = Integer.parseInt(g_fromvw[1]);
	            g_weight[g_i] = Integer.parseInt(g_fromvw[2]);
	        }

	        res = minCost(g_nodes, g_from, g_to, g_weight);
	        bw.write(String.valueOf(res));
	        bw.newLine();

	        bw.close();
	    }
	}

package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class zombieClusters {
	
	 static int zombieCluster(String[] zombies) {
		 int n = zombies.length;
		 int V =n;  
		 int count =0;
		 LinkedList<Integer> adj[];
		 int[][] graph = new int[n][n];
		 adj = new LinkedList[n];
		 
		 
		 for(int k=0; k<n; ++k)
	         adj[k] = new LinkedList();
		 
		 for(int i=0;i<n;i++){
			 for(int j=0;j<n;j++){
				graph[i][j] = zombies[i].charAt(j)- 48;
				 if(graph[i][j] == 1){
					 adj[i].add(j);
				 }
				 //char array ASCII value subtracted
			 }
		 }
		 int q=0,w=0;
		 for(int l=0;l<n;l++){
			 for(int z=1;z<n;z++){
				if(isReachable(l,z,adj,V)){
					count++;
				}
				 
			 }
			 }

		 return count;
	    }
	 
	 
	 
	 static void addEdge(int v,int w,LinkedList<Integer> adj[])  {   adj[v].add(w);   }
	 
	    //prints BFS traversal from a given source s
	    static Boolean isReachable(int s, int d,LinkedList<Integer> adj[], int V)
	    {
	        LinkedList<Integer>temp;
	 
	        // Mark all the vertices as not visited(By default set
	        // as false)
	        boolean visited[] = new boolean[V];
	 
	        // Create a queue for BFS
	        LinkedList<Integer> queue = new LinkedList<Integer>();
	 
	        // Mark the current node as visited and enqueue it
	        visited[s]=true;
	        queue.add(s);
	 
	        // 'i' will be used to get all adjacent vertices of a vertex
	        Iterator<Integer> i;
	        while (queue.size()!=0)
	        {
	            // Dequeue a vertex from queue and print it
	            s = queue.poll();
	 
	            int n;
	            i = adj[s].listIterator();
	 
	            // Get all adjacent vertices of the dequeued vertex s
	            // If a adjacent has not been visited, then mark it
	            // visited and enqueue it
	            while (i.hasNext())
	            {
	                n = i.next();
	 
	                // If this adjacent node is the destination node,
	                // then return true
	                if (n==d)
	                    return true;
	 
	                // Else, continue to do BFS
	                if (!visited[n])
	                {
	                    visited[n] = true;
	                    queue.add(n);
	                }
	            }
	        }
	        
	        
	        // If BFS is complete without visited d
	        return false;
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
	        int zombies_size = 0;
	        zombies_size = Integer.parseInt(in.nextLine().trim());

	        String[] zombies = new String[zombies_size];
	        for(int i = 0; i < zombies_size; i++) {
	            String zombies_item;
	            try {
	                zombies_item = in.nextLine();
	            } catch (Exception e) {
	                zombies_item = null;
	            }
	            zombies[i] = zombies_item;
	        }

	        res = zombieCluster(zombies);
	        bw.write(String.valueOf(res));
	        bw.newLine();

	        bw.close();
	    }
	}


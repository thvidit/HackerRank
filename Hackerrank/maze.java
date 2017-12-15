package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class maze {
//vidit's code
	
	  static int minMoves(int[][] maze, int x, int y) {
		  
		  
		  
		  
		  return 0; //change this
	    }
	  
	  static int findCheese(int[][] maze, int x, int y){
		  ArrayList<Integer> a1 = new ArrayList<>();
		  ArrayList<Integer> a2 = new ArrayList<>();
		  
		  int minDistance= Integer.MAX_VALUE;
		  int startPointX =0, startPointY =0;
		  int step =0,distance=0;
		  
	//finding coordinates of all Cheese!
		  for(int i =0; i<maze.length; i++){
			  for(int j=0; j<maze.length; j++){
				  if(maze[i][j] == 2){
					  a1.add(i);
					  a2.add(j);
				  }
			  }
		  } 
		  
		  int newStartPointX =0;
		  int newStartPointY = 0;
		  int delete = -1;
		  
	//check for minimum path length	  
		  if(a1.size()<=10){
		  while(a1.size() != 0 && a2.size() != 0){
			  minDistance=Integer.MAX_VALUE;
			  for(int k=0; k<a1.size(); k++){
				  int pointX = a1.get(k);
				  int pointY = a2.get(k);
				  distance = findDistance(startPointX, startPointY, pointX,pointY,maze);
				  if(distance == -1){
					  return -1;
				  }
				  if(distance < minDistance){
					  minDistance = distance;
					  newStartPointX = a1.get(k);
					  newStartPointY = a2.get(k);
					  delete = k;
				  }
			  }
			step = step + minDistance;
			a1.remove(delete);
			a2.remove(delete);
			startPointX = newStartPointX;
			startPointY = newStartPointY;
		  }
		  
	//call on new function
		  findDistance(startPointX,startPointY,x,y,maze);
		  return distance ==-1 ? -1 : step + distance;
	  }
		  return -1;
	  }
	  
	  static int findDistance(int pointX1, int pointY1, int pointX2, int pointY2, int[][] maze){
	//store values of neighbors
		  int[] rowNum = {0,-1,0,1};
		  int[] columnNum = {-1,0,1,0};
		 
		  int count=0;
		  
	//creating queues for storing pointX and pointY
		  Queue<Integer> queueX = new LinkedList<>();
		  Queue<Integer> queueY = new LinkedList<>();
		  Queue<Integer> distance = new LinkedList<>();
		  queueX.add(pointX1);
		  queueY.add(pointY1);
		  distance.add(0);
		  
	//check if the node has been visited
		  boolean visited[][] = new boolean[maze.length][maze.length];
		  visited[pointX1][pointY1] = true;
		  
		  while(!queueX.isEmpty()){
			  int point1 = queueX.poll();
			  int point2 = queueY.poll();
			  int dist = distance.poll();
			  
			  if(point1==pointX2 && point2==pointY2){
				  return dist;
			  }else{
				  
				  for(int i=0; i < rowNum.length;i++){
		    			int possibleX = point1 + rowNum[i];
		    			int possibleY = point2 + columnNum[i];

		    			if(isValid(possibleX,possibleY,maze) && !visited[possibleX][possibleY] && maze[possibleX][possibleY]!=1){

		    				visited[possibleX][possibleY]=true;
		    				queueX.add(possibleX);
		    				queueY.add(possibleY);
		    				queueX.add(dist+1);
		    			}
		    		}
			  
		  }
		  
	  }
		  return -1; //change this
	  }
	  
	  public static boolean isValid(int possibleX,int possibleY,int[][] arr){
	        return(possibleX < arr.length && possibleX >=0 && possibleY < arr[0].length && possibleY >=0 );
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
	        int maze_rows = 0;
	        int maze_cols = 0;
	        maze_rows = Integer.parseInt(in.nextLine().trim());
	        maze_cols = Integer.parseInt(in.nextLine().trim());

	        int[][] maze = new int[maze_rows][maze_cols];
	        for(int maze_i = 0; maze_i < maze_rows; maze_i++) {
	            for(int maze_j = 0; maze_j < maze_cols; maze_j++) {
	                maze[maze_i][maze_j] = in.nextInt();

	            }
	        }

	        if(in.hasNextLine()) {
	          in.nextLine();
	        }

	        int x;
	        x = Integer.parseInt(in.nextLine().trim());

	        int y;
	        y = Integer.parseInt(in.nextLine().trim());

	        res = minMoves(maze, x, y);
	        bw.write(String.valueOf(res));
	        bw.newLine();

	        bw.close();
	    }
	}

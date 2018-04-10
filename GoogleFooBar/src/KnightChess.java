import java.lang.System;
import java.util.ArrayList;

public class KnightChess {
	
	public static void main(String[] args) {
		int number = NumberOfMoves(0,15);
		System.out.print(number);
	}
	
	public static int NumberOfMoves(int src,int dest) {
	    ArrayList<Integer> PosMovs = new ArrayList<Integer>();
	    ArrayList<Integer> NewList = new ArrayList<Integer>();
	    ArrayList<Integer> FullList = new ArrayList<Integer>();
	    FullList.add(src);
	    boolean flag = false;
	    int NumberOfMoves = 0;
	    int[] Moves = {6,-6,10,-10,15,-15,17,-17};
	    PosMovs.add(src);
	    while (flag == false){
	    for (int i : PosMovs) {
	        //breaks loop when found dest
	        
	        //populates list with every possible move
	        for (int n : Moves){
	        	//checks to see if move is out of bounds
	            if (i%8 == 6){
	                if (n == -6 || n == 10) {
	                    continue;
	                }
	            }
	            if (i%8 == 1){ 
	                if (n == 6 || n == -10) {
	                    continue;
	                }
	            }
	            if (i%8 == 0){
	                if (n == 6 || n == -17 || n == 15){
	                    continue;
	                }
	            }
	            if (i%8 == 7){
	                if (n == -6 || n == 17 || n == -15){
	                    continue;
	                }
	            }
	            if (i + n > 63 || i + n < 0){
	                continue;
	            }
	            //checks list for repeat moves
	            for (int k : FullList) {
	            	if ((i + n) == k){
	            		continue;
	            	}
	            }
	            if ((i + n) == dest){
		        	flag = true;
		            break;
		        }
	            //adds the new move to the list
	            FullList.add(i + n);
	            NewList.add(i + n);
	        }
	        // rests the list into a new set of moves and increments the number of moves

	    }
        PosMovs = NewList;
        NewList = new ArrayList<Integer>();
        NumberOfMoves += 1;
	    }
	    if (src == dest) {
	        NumberOfMoves = 0;
	    }
	    return NumberOfMoves;
	}
}




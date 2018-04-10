import java.lang.System;
import java.util.ArrayList;
/*
 * write a function called answer(src, dest) which takes in two parameters: the source square, 
 * on which you start, and the destination square, which is where you need to land to solve the
 * puzzle. The function should return an integer representing the smallest number of moves it will
 * take for you to travel from the source square to the destination square using a chess knight's 
 * moves (that is, two squares in any direction immediately followed by one square perpendicular to
 * that direction, or vice versa, in an "L" shape). Both the source and destination squares will 
 * be an integer between 0 and 63, inclusive
 */

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
			//breaks loop when found dest
	            if ((i + n) == dest){
		        	flag = true;
		            break;
		        }
	            //adds the new move to the list
	            FullList.add(i + n);
	            NewList.add(i + n);
	        }
	       

	    }
         // rests the list into a new set of moves and increments the number of moves
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




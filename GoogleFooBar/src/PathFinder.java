/*
 * The fuel control mechanisms have three operations:
   1) Add one fuel pellet
   2) Remove one fuel pellet
   3) Divide the entire group of fuel pellets by 2 (due to the destructive energy released when a 
   quantum antimatter pellet is cut in half, the safety controls will only allow this to happen if 
   there is an even number of pellets)
   Write a function called answer(n) which takes a positive integer as a string and returns the 
   minimum number of operations needed to transform the number of pellets to 1. The fuel intake 
   control panel can only display a number up to 309 digits long, so there won't ever be more pellets
   than you can express in that many digits.

 */
public class PathFinder {
	public static int Numbers;
	public static void main(String[] args) {
		int number = PathFinderfunc("15");
		System.out.print(number);
	}
	
	public static int PathFinderfunc(String n) {
		    Numbers = Integer.valueOf(n);
		    int NumberOfOperations = 0;
		    while (Numbers != 1){
		        int NumberAndOperations = division();
		        NumberOfOperations = NumberAndOperations + NumberOfOperations;
		    }
		    return NumberOfOperations; 
		
	}
	
	public static int division(){ 
	    int NumberOfOperations = 0;      
	    if (Numbers%2 == 0){
	    	Numbers = Numbers/2;
	        NumberOfOperations += 1;
	    }
	    else {
	        if (Numbers == 3){
	        	Numbers -= 1;
	            NumberOfOperations += 1; 
	            return NumberOfOperations;
	        }
	        if (((Numbers+1)/2)%2 == 0){
	        	Numbers += 1;
	            NumberOfOperations += 1; 
	            return NumberOfOperations;
	        }
	        if (((Numbers-1)/2)%2 == 0){
	        	Numbers -= 1;
	            NumberOfOperations += 1; 
	            return NumberOfOperations;
	        }
	    }
	    return NumberOfOperations; 
	    }
}

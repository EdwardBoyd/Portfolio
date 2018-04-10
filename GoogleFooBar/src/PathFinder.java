
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

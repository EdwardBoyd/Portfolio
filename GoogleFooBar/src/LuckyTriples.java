import java.util.ArrayList;

/*
 *Write a function answer(l) that takes a list of positive integers l and counts the number of "lucky triples" of (lst[i], lst[j], lst[k])
 * where i < j < k. The length of l is between 2 and 2000 inclusive. The elements of l are between 1 and 999999 inclusive.
 *  The answer fits within a signed 32-bit integer. Some of the lists are purposely generated without 
 *  any access codes to throw off spies, so if no triples are found, return 0. 
 */

public class LuckyTriples {
	public static void main(String[] args) {
		int[] list = {1,1,1,2,2,2};
		int number = Luckys(list);
		System.out.print(number);
	}
	
	public static int Luckys(int[] l) {
	    int Listlen = l.length;
	    int NumberOfCodes = 0;
	    while (Listlen >= 2){
	        Listlen -= 1;
	        int mult = (Multiples(l, Listlen)).size();
	        int div = (Dividers(l, Listlen)).size();
	        NumberOfCodes += mult * div;
	    }
	    return NumberOfCodes;
	}
	
	public static ArrayList<Integer> Multiples(int[] l, int index) {
		ArrayList<Integer> List = new ArrayList<Integer>();
	    	    int Number = l[index];
	    	    for (int i = index + 1; i < l.length; i++){
	    	        if (l[i] % Number == 0){
	    	            List.add(l[i]);	    	            
	    	        }
	    	    }
	    	    System.out.print("LIST1"+List+"");
	    	    return List;
	}
	public static ArrayList<Integer> Dividers(int[] l, int index) {
		ArrayList<Integer> List = new ArrayList<Integer>();
		ArrayList<Integer> NewList = SliceList(l, index);
	    	    int Number = l[index];
	    	    for (int i : NewList){
	    	        if (Number % i == 0){
	    	            List.add(i);     
	    	        }
	    	    }
	    	    System.out.print("LIST2"+List+"");
	    	    return List;
	}
	public static ArrayList<Integer> SliceList(int[] List, int Index) {
		ArrayList<Integer> NewList = new ArrayList<Integer>();
		for ( int i = Index - 1; i >= 0; i-- ) {
			NewList.add(List[i]);
		}
		return NewList;
		
	}
}

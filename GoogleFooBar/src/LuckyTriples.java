import java.util.ArrayList;

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

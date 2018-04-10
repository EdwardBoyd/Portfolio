
public class Saultes {
	
	public static void main(String[] args) {
		int number = Soultion(">---<");
		System.out.print(number);
	}
	public static int Soultion(String s){
		int Saultes = 0;
		String[] sList = s.split("");
		int slen = sList.length;
		int Index = 0;
		for (int i = 0; i < slen; i++){
			if ((sList[i]).equals(">")){
				for (int x = Index; x < slen; x++){
					if (sList[x].equals("<")){
						Saultes += 2;
		                }
		            }
		}
	Index += 1;
	}
	return Saultes;
	}
}



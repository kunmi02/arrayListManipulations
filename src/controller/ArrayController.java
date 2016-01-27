package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayController {
//	This method creates two-dim Array List 
	@SafeVarargs
	public static List<List<Integer>> combiningArrayListIntoOne2D(List<Integer> ... givenArrayList){
			List<List<Integer>> nowaPodwojnaLista = new ArrayList<List<Integer>>();
			for (int i = 0; i < givenArrayList.length; i++) {
				nowaPodwojnaLista.add(givenArrayList[i]);
			}
			return nowaPodwojnaLista;
	}
	public static int findBiggestNumber(List<List<Integer>> twoArr){
		int maxOfTwo = 0;
		for (int i = 0; i < twoArr.size(); i++) {
			List<Integer> tempArr = twoArr.get(i);
			ListIterator<Integer> fInt = tempArr.listIterator();
			while(fInt.hasNext()){
				int te = fInt.next();
				maxOfTwo = maxOfTwo>=te? maxOfTwo:te;
			}
		}
		return maxOfTwo;
		
	}
}

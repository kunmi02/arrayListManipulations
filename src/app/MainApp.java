package app;

import java.util.ArrayList;
import java.util.List;

import data.ArraysData;
import controller.ArrayController;
public class MainApp {

	public static void main(String[] args) {
		int base = 4;
		int noOfEls = 3;
		//Using default constructor
		ArraysData defArr1 = new ArraysData();
		//Obtaining created and filled array
		List<Integer> tar1 = defArr1.getArray();
		//Using constructor taking ArryList as an argument
		ArrayList<Integer> tar2 = new ArrayList<Integer>();
		ArraysData defArr2 = new ArraysData(tar2, base, noOfEls);
		tar2 = defArr2.getArray();
		//Combining two ArrayList into 2D array
		List<List<Integer>> tar2D = ArrayController.combiningArrayListIntoOne2D(tar1, tar2);
		System.out.println("This is Array List no.1 => "+ tar1 + " and its largest number is: " +  defArr1.getMaxInt());
		System.out.println("This is Array List no.2 => "+ tar2 + " and its largest number is: " +  defArr2.getMaxInt());
		System.out.println("This is 2D Array List: "+ tar2D + " and its largest number is: "+ArrayController.findBiggestNumber(tar2D));
		ArrayController.findBiggestNumber(tar2D);
		
	}


}

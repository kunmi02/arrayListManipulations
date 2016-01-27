package data;

import java.util.ArrayList;
import java.util.Random;

public class ArraysData{
	private ArrayList<Integer> tarArr = new ArrayList<Integer>();
	private int initialBase = 10;
	private int initialNoOfElelemnts = 3;
	private int maxInt = 0;

	public ArraysData(){
		fillingArrayWithRandoms(tarArr, initialBase, initialNoOfElelemnts);
	}
	public ArraysData(ArrayList<Integer> givenArr, int base, int noOfElelemnts){
		setArray(givenArr, base, noOfElelemnts);
		fillingArrayWithRandoms(tarArr, initialBase, initialNoOfElelemnts);
	}
	private void setArray(ArrayList<Integer> givenArr, int base, int noOfElelemnts){
		this.tarArr = givenArr;
		this.initialBase = base;
		this.initialNoOfElelemnts = noOfElelemnts;
	}
	public ArrayList<Integer> getArray(){
		return this.tarArr;
	}
	private void setMaxInt(int givenInt){
		this.maxInt = givenInt;
	}
	public int getMaxInt(){
		return this.maxInt;
	}
//	This methods fills ArrayList with specified number of random elements
	private void fillingArrayWithRandoms(ArrayList<Integer> tarArray, int base, int noOfElelemnts){
		int maxInt2 = 0;
		for(int i  = 0; i<noOfElelemnts; i++){
			Random nRand = new Random();
			int res = nRand.nextInt(base);
			tarArray.add(res);
			maxInt2 = maxInt2>=res?maxInt2:res;
		}
		setMaxInt(maxInt2);
	}
}

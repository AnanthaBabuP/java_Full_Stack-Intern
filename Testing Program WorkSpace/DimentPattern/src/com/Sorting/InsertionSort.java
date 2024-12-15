package com.Sorting;

public class InsertionSort {

	public static void main(String[] args) {

		CommonMethods cm = new CommonMethods();

		System.out.println("Enter the Array Length : ");
		int row = cm.getNumberUsingScanner();

		int[] arry = new int[row];
		System.out.println("Enter the number's one by one :");
		for (int i = 0; i < row; i++)
			arry[i] = cm.getNumberUsingScanner();

		System.out.println("Print Data on Ascending Order");
		cm.printArray(insertionSortingAss(arry));
		System.out.println("Print Data on Decenting Order");
		cm.printArray(insertionSortingDec(arry));
	}

	public static int[] insertionSortingAss(int[] array) {
		int lengthArray = array.length;

		for (int i = 1; i < lengthArray; i++) {
			int key = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}

			array[j + 1] = key;
		}

		return array;
	}
	
	public static int[] insertionSortingDec(int[] array) {
		int lengthArray = array.length;

		for (int i = 1; i < lengthArray; i++) {
			int key = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] < key) {
				array[j + 1] = array[j];
				j--;
			}

			array[j + 1] = key;
		}

		return array;
	}

}

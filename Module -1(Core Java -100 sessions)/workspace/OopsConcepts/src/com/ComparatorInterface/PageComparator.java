package com.ComparatorInterface;

import java.util.Comparator;

public class PageComparator implements Comparator<Books> {
	
	public int compare(Books x, Books y) {
		return x.pages - y.pages;
	}
}

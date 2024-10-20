package com.StringClass;

public class StringClass {

	public static void main(String[] args) {
		// public char charAt(int Index)
		// public int compareTo(String anotherString)
		// public int compareToIgnoreCase(String anotherString)
		// public boolean contains(CharaterSequence sequence)
		// public boolean startWith(String anotherString)
		// public boolean endWith()
		// public boolean equals(Object anotherObject)
		// public boolean equalsIgnoreCase(Object anotherObject)
		// public byte[] getByte()
		// public void getChars(int start, int end, char c[],int start)
		// public char[] toCharArray()
		// public boolean isEmpty()
		// public int length()
		

		String s1 = "java is a programing language";
		String s2 = "JAVA";
		
		System.out.println(s1.charAt(2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		System.out.println(s1.contains("v"));
		System.out.println(s1.startsWith("j"));
		System.out.println(s1.startsWith("i", 5)); // chat int position check
		System.out.println(s1.endsWith("e")); // check end character
		
		System.out.println(s1.equals(s2)); // check to ascii code to ascii table
		System.out.println(s1.equalsIgnoreCase(s2)); // check to ignore case sensitive
		
		byte bytes[] = s2.getBytes(); // store and show on byte code
		for(byte b : bytes)
			System.out.println(b);
		
		char[] c1 = s2.toCharArray();
		for(char c : c1)
			System.out.println(c);
		
		
		
	}

}

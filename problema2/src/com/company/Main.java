package com.company;

public class Main {

    public static void main(String[] args) {
	String fraza = "Print each word.";
	int i;
	int j = 0;
	for(i = 0; i <= fraza.length() - 1; i++) {
	    if( fraza.substring(i).startsWith(" ") || i ==0){
	        for (j = i+1; j <= fraza.length() -1; j++) {
	            if(fraza.substring(j).startsWith(" ") || j == fraza.length() -1 ) {
                    System.out.println(fraza.substring(i, j));
                    i = j;
                }
            }
        }
    }
    }
}

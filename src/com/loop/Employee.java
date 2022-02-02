package com.loop;

public class Employee {
	
	public static void main(String[] args) {
		
		//Nested for loop
		
for (int i = 1; i <=3;  i++) {
	for (int j =1 ; j<i ; j++) {
	System.out.print("");
	}
	for (int k = 3; k>=i; k--) {
		
	
	System.out.print(k);
	}		
	System.out.println();	
}}
}
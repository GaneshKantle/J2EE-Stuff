package com.basics;

public class Patterns {

	public static void main(String[] args) {
	
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=1; j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

		System.out.println();
		
		for(int i=5; i>=1; i--) {
			for(int j=5; j>=1; j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

		System.out.println();
		
		for(int i=5; i>=1; i--) {
			for(int j=5; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int row = 5;
		for(int i=1; i<=row; i++) {
			for(int j=row; j>=row+1-i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}

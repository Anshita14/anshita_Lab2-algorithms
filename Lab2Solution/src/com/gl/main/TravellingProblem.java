package com.gl.main;

import java.util.Scanner;

public class TravellingProblem {
	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the no. of different denominations available");
		int noOfDenomination = sc.nextInt();
		System.out.println("Enter the value of denominations available");

		int denominationsArray[] = new int[noOfDenomination];
		for (int index = 0; index < noOfDenomination; index++) {
			denominationsArray[index] = sc.nextInt();
		}
		
	System.out.println("Enter the value to be paid off=");
    int target = sc.nextInt();

	MergeSort merge_sort = new MergeSort();
			merge_sort.mergeSort(denominationsArray, 0, (denominationsArray.length-1));
			for(int i =0; i < denominationsArray.length; i++) {
				System.out.println(denominationsArray[i]);
				System.out.println(",");
			}
			
			NotesCounter notesCounter = new NotesCounter();
		    int[] notesCounterArray = notesCounter.notesCount(denominationsArray, target);
		    
		    System.out.println(" No. of denominations required are");
		    for(int i=0; i<notesCounterArray.length;i++) {
		    		System.out.println(denominationsArray[i] + ":" +notesCounterArray[i]);
		    	}
		    	
	}}
			
	
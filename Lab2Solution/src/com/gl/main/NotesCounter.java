package com.gl.main;

public class NotesCounter {
	public int[] notesCount(int[] denominationsArray, int target) {
		int notesCounter[] = new int[denominationsArray.length];
		for (int i = 0; i < denominationsArray.length; i++) {
			if (target >= denominationsArray[i]) {
				notesCounter[i] = target / denominationsArray[i];
				target = target%denominationsArray[i];
			}
		}

		if (target > 0) {
			System.out.println("the exact target amount is not reachable with this ");
			return notesCounter;
		} else {
			return notesCounter;
		}

	}
}

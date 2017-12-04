package trailPackage;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Trail {
	private int[] markers;

	public Trail() {
		markers = new int[13];
		importTrail();
	}

	public boolean isLevelTrailSegment(int start, int end) { // Andrew Shen
		int max = 0;
		int min = 0;
		for (int i = start; i < end; i++) { // Finds the max and mins of the Trail Segment
			if (markers[i] > max) {
				max = markers[i];
			} else if (markers[i] < min) {
				min = markers[i];
			}
		}
		if (max - min <= 10) { // Checks if difference between the max and min is less than 10
			return true; // If less than or equal to 10, return true
		} else {
			return false; // If more than 10, return false
		}
	}

	public boolean isDifficult() { // Shivam Gangal
		int temp = 0;
		for (int i = 0; i < markers.length; i++) {
			if ((int) (markers[i] - markers[i + 1]) > 30) {
				temp = 75;
			} else {
				temp = 0;
			}

		}
		if (temp == 75) {
			return true;
		} else {
			return false;
		}
	}

	public int findMaxElevation() { // Andrew Shen
		int max = 0;
		for (int i = 0; i < markers.length; i++) { // Finds max value
			if (markers[i] > max) {
				max = markers[i];
			}
		}
		return max;
	}

	public int findMaxElevation(int start, int end) // Maggie Feng
	{
		int max = markers[start];
		for (int i = start; i < end; i++) {
			if (markers[i] > max) {
				max = markers[i];
			}
		}
		return max;
	}

	public int findMinElevation() // Saket Nekkanti
	{
		return 1; // Here so that the program will compile, can delete this
	}

	public int findMinElevation(int start, int end) // Srujan Pandari
	{
		int compare = markers[start];
		for(int i = start; i < end; i++)
		{
			if(markers[i] < compare)
			{
				compare = markers[i];
			}
		}
		return compare; // here so that
	}

	// Do not edit this method, no touchy
	private void importTrail() {
		try {
			Scanner sn = new Scanner(new File("Trail.txt"));
			for (int i = 0; i < markers.length; i++) {
				markers[i] = Integer.parseInt(sn.nextLine());
			}

		} catch (FileNotFoundException e) {
			String s = "File not found! Make sure that Trail.txt ";
			s = s + "is in the same folder as the class.";
			System.out.println(s);
		}
	}
}

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
	public boolean isLevelTrailSegment(int start, int end) {
		return false; //Here so that the program will compile, can delete this
	}
	
	public boolean isDifficult() {
		return false; //Here so that the program will compile, can delete this
	}
	public int findMaxElevation() {
		return 1;  //Here so that the program will compile, can delete this
	}
	public int findMaxElevation(int start, int end) {
		return 1;  //Here so that the program will compile, can delete this
	}
	public int findMinElevation() {
		return 1;  //Here so that the program will compile, can delete this
	}
	public int findMinElevation(int start, int end) {
		return 1;  //Here so that the program will compile, can delete this
	}
	//Do not edit this method, no touchy
	private void importTrail() {
		try {
			Scanner sn = new Scanner(new File("Trail.txt"));
			for(int i = 0;i < markers.length; i++) {
				markers[i] = Integer.parseInt(sn.nextLine());
			}
			
		} catch(FileNotFoundException e) {
			String s = "File not found! Make sure that Trail.txt " ;
			s = s + "is in the same folder as the class.";
			System.out.println(s);
		}
	}
}

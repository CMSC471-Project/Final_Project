package travlingSalesman;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private Traveler traveler;
	private ArrayList<City> cities = new ArrayList<City>();
	private Scanner scanner;
	private FileInputStream inFile;
	private FileOutputStream outFile;
	
	public Main(FileInputStream inFile, FileOutputStream outFile){
		this.inFile = inFile;
		this.outFile = outFile;
		traveler = new Traveler();
		scanner = new Scanner(inFile);
		
	}
	
	public static void main(String args[]){
		FileInputStream inFile;
		FileOutputStream outFile;
		try {
			inFile = new FileInputStream(args[0]);
			outFile = new FileOutputStream(args[1]);
			Main main = new Main(inFile, outFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



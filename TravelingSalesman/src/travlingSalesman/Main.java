package travlingSalesman;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class readFile {
	
	private Traveler traveler;
	private ArrayList<City> cities = new ArrayList<City>();
	private Scanner scanner;
	private FileInputStream inFile;
	private FileWriter outFile;
	private BufferedWriter writer;
	private boolean isGoal;
	private City startCity;
	
	/**
	 * Check to see if all states visited
	 * @return
	 */
	public boolean isGoalState(){
		isGoal = true;
		for(int i = 0; i < cities.size(); i++){
			if(!cities.get(i).getIsVisited()){
				isGoal = false;
				i = cities.size();
			}
		}

		return isGoal;
	}
	
	public int findDistance(City city1, City city2){
		int distance = 0;
		
		
		
		return distance;
	}
	
	/**
	 * read data from the file
	 * @param inFile
	 * @param outFile
	 */
	public readFile(FileInputStream inFile, FileWriter outFile){
		this.inFile = inFile;
		this.outFile = outFile;
		traveler = new Traveler();
		scanner = new Scanner(inFile);
		
		//reading in each coordinates of the cities and adding it to the ArrayList, cities
		while(scanner.hasNext()){
			City city = new City(scanner.nextInt(), scanner.nextInt(), false);
			cities.add(city);
		}
		
		//setting up the start city of the traveler
		startCity = new City(cities.get(0).getCityX(), cities.get(0).getCityY(), false);
		cities.remove(0);
		traveler.setXPosition(startCity.getCityX());
		traveler.setYPosition(startCity.getCityY());
		
		test();
	}
	/**
	 * test function
	 */
	public void test(){
		System.out.println(isGoalState());
		System.out.println(startCity.getCityX() + " " + startCity.getCityY());
		for(int i = 0; i < cities.size(); i++){
			System.out.println(cities.get(i).getCityX() + " " + cities.get(i).getCityY());
		}
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){
		FileInputStream inFile;
		FileWriter outFile;
		try {
			inFile = new FileInputStream(args[0]);
			outFile = new FileWriter(args[1]);
			readFile file = new readFile(inFile, outFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



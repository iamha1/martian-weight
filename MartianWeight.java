package practice;

import java.util.Scanner;

public class MartianWeight {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Wanna know your Matian weight?");
		
		System.out.print("If this is your weight on Earth: ");
		
		String earthStr = scanner.nextLine();
		
		String[] weightArr  = earthStr.split(" ");
		
		for (int i = 0; i < weightArr.length; ++i) {
			double weight = Double.parseDouble(weightArr[i]);
			
			double mars = weight * 0.378;
			
			System.out.println("Then this is your weight on Mars: \n" + mars);
			
			System.out.println("Hurraaaahhh!");
			
		scanner.close();	
		}
	}
}



/**
 * Print out the names for which 100 or fewer babies were born in a chosen CSV file of baby name data.
 * 
 * @author Duke Software Team 
 */
import duke.*;
import csv.*;

public class BabyBirths {
	public static void printNames() {
		FileResource fr = new FileResource();
		for (CSVRecord rec : fr.getCSVParser(false)) {
			int numBorn = Integer.parseInt(rec.get(2));
			if (numBorn <= 100) {
				System.out.println("Name " + rec.get(0) +
						" Gender " + rec.get(1) +
						" Num Born " + rec.get(2));
			}
		}
	}

	public static void main(String[] args) {
		printNames();
	}
}

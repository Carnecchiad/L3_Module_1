package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}

		}
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		int amount = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				amount++;
			}
		}
		return amount;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		int longest = 0;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > words.get(longest).length()) {
				longest = i;
			}
		}
		return words.get(longest);
	}

	public static boolean containsSOS(List<String> message) {
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;

	}

//	public static List<Double> sortScores(List<Double> results) {
//		List<Double> y = new ArrayList<Double>();
//		double smallest = 10000.0;
//		double previousSmallest = 0.0;
//		for (int i = 0; i < results.size(); i++) {
//			for (int j = 0; j < results.size(); j++) {
//				if(results.get(j) < smallest && results.get(j) > previousSmallest) {
//					smallest = results.get(j);
//					results.remove(j);
//				}
//			}
//			y.add(smallest);
//			previousSmallest = smallest;
//			smallest = 0;
//			
//		}
//		
//		
//
//		return y;
//	}
	
	public static List<String> sortDNA(List<String> unsortedSequences) {
		List<String> newList = new ArrayList<String>();
		
		for (int i = 0; i < unsortedSequences.size(); i++) {
			
		}
		return newList;
	}
	}
}
// Add other methods here

package solutions.Ch08RecursionandDynamicProgramming.Q8_04_Power_Set;

import java.util.*;

public class QuestionB {
	
	public static ArrayList<Integer> convertIntToSet(int x, ArrayList<Integer> set) {
		ArrayList<Integer> subset = new ArrayList<Integer>(); 
		int index = 0;
		for (int k = x; k > 0; k >>= 1) {
			int i = k & 1;
			if (i == 1) {
				subset.add(set.get(index));
			}
			index++;
		}
		return subset;
	}
	
	public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set) {
		ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<ArrayList<Integer>>();
		int max = 1 << set.size(); /* Compute 2^n */
		// This this in this way
		// set size = 3, i.e {0,1,2}
		// max = 8
		//{0 1 2}
		// -----
		// 0 0 0 - 0 {}
		// 0 0 1 - 1 {2}
		// 0 1 0 - 2 {1}
		// 0 1 1 - 3 {1, 2}
		// 1 0 0 - 4 {0}
		// 1 0 1 - 5 {0, 2}
		// 1 1 0 - 6 {0, 1}
		// 1 1 1 - 7 {0, 1, 2}
		// Add all the arrays together. in ArrayList of list
		for (int k = 0; k < max; k++) {
			ArrayList<Integer> subset = convertIntToSet(k, set);
			allsubsets.add(subset);
		}
		return allsubsets;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			list.add(i);
		}
		
		ArrayList<ArrayList<Integer>> subsets2 = getSubsets(list);
		System.out.println(subsets2.toString());		
	}

}

package com.futurefry.designPattern.decorates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {

		// wrong
		InstrumentedHashSet<String> instrumentedHashSet = new InstrumentedHashSet<String>();
		instrumentedHashSet.addAll(Arrays.asList("Snap", "Cracle", "Pop"));

		System.out.println("Total Insertion count should be 3 but got : " + instrumentedHashSet.getAddCount());

		// right way \ Decorator pattern

		Set<String> s = new HashSet<>();
		InstrumentedHashSetComposition<String> hashSetComposition = 
				new InstrumentedHashSetComposition<String>(s);
		hashSetComposition.addAll(Arrays.asList("snap", "Cracle", "pop"));

		System.out.println("Total Insertion count should be 3 but got : " + hashSetComposition.getAddCount());

		//
		
	}
}

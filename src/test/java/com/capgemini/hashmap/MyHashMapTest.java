package com.capgemini.hashmap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyHashMapTest {

	@Test
	public void WhenGivenASentence_AddsTheWordsInList_ReturnsTheFrequency() {
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.add(word, value);
		}
		Integer frequency = myHashMap.get("to");
		System.out.println(myHashMap);
		assertEquals(2, frequency.intValue());

	}

}

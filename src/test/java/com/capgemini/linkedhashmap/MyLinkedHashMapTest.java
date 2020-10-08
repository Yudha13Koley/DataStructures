package com.capgemini.linkedhashmap;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyLinkedHashMapTest {

	@Test
	public void GivenASentence_WhenAddedIntoALinkedHashSet_ReturnsTheNumberOfParanoidWord() {
		String sentence = "Paranoids are not paranoid because they are paranoid"
				+ " but because they keep putting themselves deliberately into paranoid avoidable situations";
		LinkedHashMap<String,Integer> hash=new LinkedHashMap<>();
		String[] words=sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = hash.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			hash.add(word, value);
	}
		System.out.println(hash);
		int frequency=hash.get("paranoid");
		assertEquals(3,frequency);

}
}

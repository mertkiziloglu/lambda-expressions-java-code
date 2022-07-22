package org.meroot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class CreatingCompartors {

	public static void main(String[] args) {

		List<String> strings = 
				Arrays.asList("one", "two", "three", "four", "five", 
						"six", "seven", "eight", "nine");
		
		Comparator<String> cmp = 
				(s1, s2) -> s1.compareTo(s2);// harf sayisima gore karsilastirma yapiyor
		strings.sort(cmp);
		System.out.println(strings);
		
		ToIntFunction<String> toLength = s -> s.length();
		
		Comparator<String> cmp2 = Comparator.comparingInt(toLength); //harf sayisina gore siralama yapiyor
				
		strings.sort(cmp2);
		System.out.println(strings);


		List<Integer> numbers = Arrays.asList(11, 20, 333, 44, 5, 6, 7, 8, 9);

		Comparator<Integer> cmp3 = (i1, i2) -> i1.compareTo(i2);
		numbers.sort(cmp3);
		System.out.println(numbers);
	}
}

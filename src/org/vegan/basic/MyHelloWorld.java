/**
 * 
 */
package org.vegan.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * I added a comment from the GitHub repository.
 * See https://www.mkyong.com/java8/java-8-streams-filter-examples/
 *
 */
public class MyHelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Example of Streams\n");
		
		String stooge = "Larry";
		List<String> lstResults = filterStooge(stooge);
		
		//print results.
		lstResults.forEach(System.out::println);			//output : spring node

	}

	/**
	 * Method uses Java 8 Streams to filter out elements of a List.
	 * 
	 * @param stooge - Name of the Stooge that we want to filter out.
	 * @return 
	 */
	private static List<String> filterStooge(String stooge) {
		List<String> lines = Arrays.asList("Larry", "Curly", "Moe");

		List<String> lstResults = lines.stream() 			//convert list to stream
			.filter(line -> !stooge. equals (line))	//filters the line, equals to stooge
			.collect(Collectors.toList());			//collect the output and convert streams to a List

		return lstResults;
	}

}

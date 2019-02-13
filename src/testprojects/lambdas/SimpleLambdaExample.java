package testprojects.lambdas;

import static testproject.utils.Util.say;

import java.util.Comparator;

public class SimpleLambdaExample {
	public static void main(String[] args) {
		Comparator<Integer> integerComparator = (Integer a, Integer b) -> {
			return a - b;
		};
		int difference = integerComparator.compare(4, 7);
		say("Here is the number: " + difference);
		difference = integerComparator.compare(14, 2);
		say("Here is the number: " + difference);
		difference = integerComparator.compare(41, 72);
		say("Here is the number: " + difference);
	}
}

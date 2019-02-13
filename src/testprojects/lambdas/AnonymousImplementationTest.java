package testprojects.lambdas;
import java.util.Comparator;
import static testproject.utils.Util.say;

public class AnonymousImplementationTest{
	public static void main(String[] args) {
		Comparator<Integer> integerComparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return a - b;
			}
		};
		
		int difference = integerComparator.compare(4, 7);
		say("Here is the number: " + difference);	
		difference = integerComparator.compare(14, 2);
		say("Here is the number: " + difference);	
		difference = integerComparator.compare(41, 72);
		say("Here is the number: " + difference);	
	}
}

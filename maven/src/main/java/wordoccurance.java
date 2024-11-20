import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class wordoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "this is an example sentence and , this is a test sentence. this test is? just a test";
		String[] normalised = input.replaceAll("[?.!,]", "").strip().toLowerCase().split("\\s+"); //[\\s+] is incorrect
		
		Map<String, Integer> wordcount = Arrays.stream(normalised)
                .collect(Collectors.groupingBy(k -> k, Collectors.summingInt(e->1)));  //when map is integer
		
		Map<String, Long> wordcoun = Arrays.stream(normalised)
                .collect(Collectors.groupingBy(k -> k, Collectors.counting()));  //value in map to be long

// Print the counts
		wordcount.forEach((k, v) -> System.out.println(k + ": " + v));
		wordcoun.forEach((k, v) -> System.out.println(k + ": " + v));

		

	}

}

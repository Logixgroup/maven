import java.util.List;
import java.util.Map;

public class MapIteration {
    public static void main(String[] args) {
        Map<String, Integer> fruitCount = Map.of("Apple", 3, "Banana", 2, "Cherry", 5);
        List<String> fruits = List.of("Apple", "Banana", "Cherry");
      
        fruits.forEach(System.out::println);
        fruitCount.forEach ((k, v) ->  System.out.println(k + ": " + v));
        
        
        

    }
}


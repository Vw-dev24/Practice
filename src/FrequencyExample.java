import java.util.*;

public class FrequencyExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Ball", "Apple", "Cat", "Ball", "A");
        Map<String, Integer> frequencyMap = new HashMap<>();
        Set<String> uniqueSet= new HashSet<>(list);
        System.out.println(uniqueSet);
        for (String s : list) {
            frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
        }
        System.out.println(frequencyMap);

    }
}


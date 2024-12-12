import java.util.ArrayList;
import java.util.List;

public class FlattenListRecursive {
    public static void main(String[] args) {
        List<Object> input = List.of(List.of(1), 2, List.of(3, 4));

        List<Integer> output = new ArrayList<>();
        flatten(input, output);
        SumimplImpl sumimpl= new SumimplImpl();
        System.out.println(output); // [1, 2, 3, 4]
        int a=5; int b=10; int c=0;
        sumimpl.sum(a, b, c);
        System.out.println(c);
    }

    private static void flatten(List<Object> input, List<Integer> output) {
        for (Object item : input) {
            if (item instanceof List) {
                flatten((List<Object>) item, output);
            } else {
                output.add((Integer) item);
            }

        }
    }

}


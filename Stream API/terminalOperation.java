import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BinaryOperator;

public class terminalOperation {
    public static void main(String[] args) {
     ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2,3,4,5));

        Integer sum = arr2.stream()

        .filter(new java.util.function.Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0; 
            }
        })

        .map(new java.util.function.Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * integer; 
            }
        })

        .reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer int1, Integer int2) {
                return int1 + int2; 
            }
        });
        System.out.println(sum);

////------------ lamda expression
///
Integer sum2 = arr2.stream()
.filter(integer -> integer % 2 == 0) 
.map(integer -> integer * integer)  
.reduce(0, (int1, int2) -> int1 + int2); 

        System.out.println(sum2);
    }
}

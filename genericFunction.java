import java.util.*;
public class genericFunction {
    public static <T> int Target(T []arr, T target){
       int sum=0;
       for(int i=0;i<arr.length;i++){
            if(arr[i].equals(target)){ // Compare each element with the target
                sum++;
            }
       }
        return sum;
    }
    public static void main(String[] args) {
        Integer []arr={12,34,5,6,78,34};
        System.out.println(Target(arr, 34)); // Output should now be 2
    }
}

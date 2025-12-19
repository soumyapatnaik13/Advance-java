import java.util.*;
class customDesign {
    interface Predicate<T> {
        boolean test(T t);
    }
    static class EvenPredicate implements Predicate<Integer> {
        @Override
        public boolean test(Integer t) {
            return t % 2 == 0;   // true if even, false if odd
        }
    }
    static List<Integer> filter(List<Integer> arr, Predicate<Integer> p) {
        List<Integer> ans = new ArrayList<>();

        for (Integer i : arr) {          
            if (p.test(i)) {             
                ans.add(i);              
            }
        }

        return ans;                      
    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 4, 5, 7, 10);
    
        Predicate<Integer> p = new EvenPredicate();
    
        List<Integer> ans = filter(arr, p);
    
        for (Integer x : ans) {
            System.out.println(x);
        }
    

        // Using Stream API
        arr.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
        
       
    }
}

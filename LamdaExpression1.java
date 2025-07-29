import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate; 

/*class printEven implements Predicate<Integer> {
    
    @Override // It's good practice to use @Override when implementing an interface method.
    public boolean test(Integer x) {
       
        return x % 2 == 0;
    }
}
    */
public class LamdaExpression1 {
    public static void main(String[] args) {
       
        ArrayList<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

     /*    Predicate <Integer> p = new Predicate<Integer>(){//abstract
            public boolean test(Integer x) {
       
                return x % 2 == 0;
            }
        };
        */
        checkValue(l, (x)-> x% 2 ==0);
    }

   
    static void checkValue(Collection<Integer> c, Predicate<Integer> x) {
       
        for (Integer i : c) {
            
            if (x.test(i)) {
                System.out.println(i);
            }
        }
    }
}
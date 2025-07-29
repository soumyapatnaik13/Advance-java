import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
interface checkNum{
    void check(Integer p);
}
//tradional approach
/*class checknumIsEven implements checkNum{
    public void check(Integer p){
        if(p%2 ==0){
            System.out.println(p);
        }
    }
}
 */
public class LamdaExpressionWithsingleparameter {
    public static void main (String []args){
        // using abstract method
     /*    checkNum c = new checkNum(){
            public void check(Integer p){
                if(p%2 ==0){
                    System.out.println(p);
                }
            }
        };
        */
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        printValue(a,c -> { // lamda expression
            if(c%2 == 0){
                System.out.println(c);
            }
        });
    }
    static void printValue(Collection <Integer> c, checkNum a){
        for (Integer i=0;i<c.size();i++){
              a.check(i);
            }
        }
    }


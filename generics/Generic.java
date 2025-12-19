class printDataGeneric <T>{
    T data;
     printDataGeneric (T data){
       this.data=data;
     }
     public T getValue(){
        return data;
     }
}
public class Generic {
    public static void main(String[] args) {
        printDataGeneric<Integer> p = new printDataGeneric<>(42);
        printDataGeneric<Double> v = new printDataGeneric<>(40.2);
        System.out.println(p.getValue() + " " + v.getValue());
    
    }
}

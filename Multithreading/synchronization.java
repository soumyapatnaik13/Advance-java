package Multithreading;

class printBracket{
    //once thread-1 will comlete then thread-2 will proceed
  public synchronized void printNumber(String s){
    for(int i=0;i<50;i++){
        System.out.println(s);
    }
  }
}
class threadImplement extends Thread{
printBracket p;
String s;
threadImplement(printBracket p,String s){
    this.p=p;
    this.s=s;
}
public void run(){
  p.printNumber(s);
}
}
public class synchronization{
    public static void main(String []args){
        printBracket p = new printBracket();
        threadImplement t1 = new threadImplement(p,"(");
        threadImplement t2 = new threadImplement(p,")");
        t1.start();
        t2.start();
    }
}
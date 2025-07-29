enum PlaceOrder{
    PENDING,PROCESSING,SHIPPED,
    DELIVERED,CANCELLED
}

class orderStatus{
private int OrderID;
private PlaceOrder status;
//constructer
  public orderStatus(int orderId,PlaceOrder status){
    this.OrderID=orderId;
    this.status=status;
  }
  public void updateStatus(PlaceOrder status){
       this.status=status;
  }
  public void printOrderStatus(){
    switch(status){
        case PENDING:
        System.out.println("ORDER ID"+ OrderID + "STATUS IS PENDING");
        break;
        case PROCESSING:
        System.out.println("ORDER ID"+ OrderID + "STATUS IS Processing");
        break;
        case SHIPPED:
                System.out.println("Order " + OrderID + " has been shipped.");
                break;
            case DELIVERED:
                System.out.println("Order " + OrderID + " has been delivered.");
                break;
            case CANCELLED:
                System.out.println("Order " + OrderID + " has been cancelled.");
                break;
    }
  }
}
public class EnumWithRealLifeExample {
    public static void main(String[] args) {
        orderStatus order1= new orderStatus(1, PlaceOrder.PENDING);
        order1.updateStatus(PlaceOrder.DELIVERED);
        orderStatus order2= new orderStatus(2,PlaceOrder.PROCESSING);
        order2.updateStatus(PlaceOrder.CANCELLED);
        order1.printOrderStatus();
        order2.printOrderStatus();

        //so in future if i add certain charachteristic in the orderMode then i dont need to
        //worry about code tweaks as i can just change in the enum class .
    }
}

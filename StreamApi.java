import java.util.ArrayList;
class Employee{
   String name;
   int salary;
   Employee(String name, int salary){
    this.name=name;
    this.salary=salary;
   }
   public int getSalary(){
    return salary;
   }
   public String getName(){
    return name;
   }
}
public class StreamApi {
   public static void main(String[] args) {
    ArrayList<Employee> empList = new ArrayList<>();
    empList.add(new Employee("Alice", 5000));
    empList.add(new Employee("Bob", 7000));
    empList.add(new Employee("Charlie", 6000));
    empList.add(new Employee("David", 4000));
    empList.add(new Employee("Eve", 8000));

    // Using Stream API to filter employees with salary > 5000 and print their names
    empList.stream()
           .filter(emp -> emp.getSalary() > 5000)
           .map(Employee::getName)
           .forEach(System.out::println);
   } 
}

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import java.io.Serializable;

class Student implements Serializable{
    @SuppressWarnings("unused")
    private static final Long serialVersionId= 1L;
 
    private String n;
    private int age;
    private transient String password;//exclude from the serialization part

    public Student(String name, int age, String password){
        this.n=name;
        this.age=age;
        this.password=password;
    }
    @Override
    public String toString(){
            return "name"+" "+ age ;

    }
}

public class serializationExample {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 25, "password123");

        try (FileOutputStream fileOut = new FileOutputStream("student.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            // Serialize the object
            out.writeObject(student);
            System.out.println(student);
            System.out.println("Object serialized and saved to student.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        student s = null;

        try (FileInputStream fileIn = new FileInputStream("student.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            // Deserialize the object
            s = (student) in.readObject();
            System.out.println("Object deserialized from student.ser");
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

 
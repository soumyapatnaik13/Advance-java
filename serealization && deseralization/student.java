import java.io.Serializable;

class student implements Serializable{
    @SuppressWarnings("unused")
    private static final Long serialVersionId= 1L;
 
    private String name ;
    private int age;
    private transient String password;//exclude from the serialization part

    public student(String name, int age, String password){
        this.name=name;
        this.age=age;
        this.password=password;
    }
    @Override
    public String toString(){
            return "name"+" "+ age+ " "+ password;

    }
}

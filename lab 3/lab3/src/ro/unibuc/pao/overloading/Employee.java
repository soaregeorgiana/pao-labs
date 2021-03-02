package ro.unibuc.pao.overloading;

/**
 * Constructor overloading is a concept of having more than one constructor with different parameters list
 */
public class Employee {

    private String name;
    private long id;
    private int age;

    public Employee(){
        this.name = "Employee";
        this.id= 100;
        this.age = 18;
    }

    public Employee(String name, long id, int age){
        this.name = name;
        this.id= id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

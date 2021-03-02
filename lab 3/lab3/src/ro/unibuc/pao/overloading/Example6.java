package ro.unibuc.pao.overloading;

public class Example6 {
    public static void main(String[] args) {
        Employee empOne = new Employee();
        System.out.println(empOne.getName());
        System.out.println(empOne.getId());
        System.out.println(empOne.getAge());

        Employee empTwo = new Employee("MyName", 1010, 25);
        System.out.println(empTwo.getName());
        System.out.println(empTwo.getId());
        System.out.println(empTwo.getAge());
    }
}

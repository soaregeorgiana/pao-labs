package ro.unibuc.pao.encapsulation;

public class Example5 {

    public static void main(String[] args) {
        Room roomOne = new Room();
        roomOne.setNumber(101);
        System.out.println(roomOne.getNumber());
        roomOne.setNumber(12);
    }
}

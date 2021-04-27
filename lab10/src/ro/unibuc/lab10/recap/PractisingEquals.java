package ro.unibuc.lab10.recap;


import ro.unibuc.lab10.dto.Cat;

public class PractisingEquals {

    public static void main(String[] args) {
        Cat firstCat = new Cat("Blacky", 99);
        Cat secondCat = new Cat("Blacky", 99);
        Cat thirdCat = new Cat("Batman", 150);
        Cat fourthCat = firstCat;

        System.out.println(firstCat == secondCat); // False
        System.out.println(firstCat.equals(secondCat)); // True
        System.out.println(firstCat.equals(thirdCat)); // False
        System.out.println(firstCat == fourthCat); // True
    }
}

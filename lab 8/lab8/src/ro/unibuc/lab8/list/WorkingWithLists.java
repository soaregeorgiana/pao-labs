package ro.unibuc.lab8.list;

import ro.unibuc.lab8.model.Element;

public class WorkingWithLists {

    public static void main(String[] args) {

//        ArrayListExample arrayListService = ArrayListExample.getInstance();
//
//        arrayListService.add(new Element(1, "Doi", "Trei"));
//        arrayListService.add(new Element(2, "Trei", "Patru"));
//        arrayListService.add(new Element(3, "Patru", "Cinci"));
//        arrayListService.displayListUsingIterator();
//
//        //index: 0->size()-1
//        arrayListService.remove(2);
//        arrayListService.displayListUsingIterator();
//
//        arrayListService.add(1, new Element(4, "Unu", "Doi"));
//        arrayListService.displayListUsingIterator();
//
//        arrayListService.add(2, new Element(5, "Doi", "Trei"));
//        arrayListService.displayListUsingIterator();


        LinkedListExample linkedListService = LinkedListExample.getInstance();

        linkedListService.add(new Element(1, "Doi", "Trei"));
        linkedListService.add(new Element(2, "Trei", "Patru"));
        linkedListService.add(new Element(3, "Patru", "Cinci"));
        linkedListService.displayLinkedListUsingForEach();

        System.out.println(linkedListService.contain(new Element(3, "Patru", "Cinci")));
    }
}

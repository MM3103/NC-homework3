package homework3.collection;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        int n = 100000;
        long startTime = 0;
        long endTime = 0;

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        startTime = System.nanoTime();
        for (int i = 0; i < n; ++i) {
            linkedList.add("Number" + i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("LinkedList.Add-method: " + endTime);

        startTime = System.nanoTime();
        for (int i = 0; i < n; ++i) {
            myLinkedList.add("Number" + i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("MyLinkedList.Add-method: " + endTime);



/*        startTime = System.nanoTime();
        for (int i = 0; i < n; ++i) {
            linkedList.add(i, "Number" + i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("LinkedList.Add by index - method: " + endTime);

        startTime = System.nanoTime();
        for (int i = 0; i < n; ++i) {
            myLinkedList.add(i, "Number" + i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("MyLinkedList.Add by index - method: " + endTime);*/



/*        startTime = System.nanoTime();
        for (int i = n - 1; i >= 0; --i) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("LinkedList.Remove-method: " + endTime);

        startTime = System.nanoTime();
        for (int i = n - 1; i >= 0; --i) {
            myLinkedList.remove(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("MyLinkedList.Remove-method: " + endTime);*/



/*        startTime = System.nanoTime();
        for (int i = 0; i < n; ++i) {
            linkedList.get(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("LinkedList.Get-method: " + endTime);

        startTime = System.nanoTime();
        for (int i = 0; i < n; ++i) {
            myLinkedList.get(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("MyLinkedList.Get-method: " + endTime);*/



        startTime = System.nanoTime();
        linkedList.clear();
        endTime = System.nanoTime() - startTime;
        System.out.println("LinkedList.Clear-method: " + endTime);

        startTime = System.nanoTime();
        myLinkedList.clear();
        endTime = System.nanoTime() - startTime;
        System.out.println("MyLinkedList.Clear-method: " + endTime);

    }
}

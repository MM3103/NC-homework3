package homework3.comparison;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task1 {

    private LinkedList<Integer> linkedList = new LinkedList<>();
    private ArrayList<Integer> arrayList = new ArrayList<>();
    private int size = 10000;
    private long startTime;
    private long endTime;

    public Task1(int size) {
        this.size = size;
    }

    public void testAddList() {
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            linkedList.addFirst(10);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("LinkedList.AddFirst-method: " + endTime);

        linkedList.clear();

        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            linkedList.addLast(10);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("LinkedList.AddLast-method: " + endTime);

        linkedList.clear();

        startTime = System.nanoTime();
        for (int i = 0; i <  size; ++i) {
            linkedList.add(i, 10);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("LinkedList.Add-method: " + endTime);

        linkedList.clear();

        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            arrayList.add(0, 10);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("ArrayList.AddFirst-method: " + endTime);

        arrayList.clear();

        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            arrayList.add(i, 10);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("ArrayList.AddLast-method: " + endTime);

        arrayList.clear();

        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            arrayList.add(i, 10);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("ArrayList.Add-method: " + endTime);

        arrayList.clear();
    }


    public void testGetList() {
        for (int i = 0; i < size; ++i) {
            linkedList.addFirst(10);
        }

        for (int i = 0; i < size; ++i) {
            arrayList.add(0, 10);
        }


        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            linkedList.get(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("LinkedList.Get-method: " + endTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            arrayList.get(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("ArrayList.Get-method: " + endTime);

        linkedList.clear();
        arrayList.clear();
    }


    public void testRemoveList() {
        for (int i = 0; i <2* size; ++i) {
            linkedList.addFirst(10);
        }

        startTime = System.nanoTime();
        for (int i = size - 1; i >= 0; --i) {
            linkedList.remove();
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("LinkedList.Remove from the middle-method: " + endTime);

        linkedList.clear();

        for (int i = 0; i < size; ++i) {
            linkedList.addFirst(10);
        }

        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            linkedList.removeFirst();
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("LinkedList.Remove from the begin-method: " + endTime);

        linkedList.clear();

        for (int i = 0; i < size; ++i) {
            linkedList.addFirst(10);
        }

        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            linkedList.removeLast();
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("LinkedList.Remove from the end-method: " + endTime);

        linkedList.clear();

        for (int i = 0; i < 2*size; ++i) {
            arrayList.add(0, 10);
        }

        startTime = System.nanoTime();
        for (int i = size - 1; i >= 0; --i) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("ArrayList.Remove from the middle-method: " + endTime);

        arrayList.clear();

        for (int i = 0; i < size; ++i) {
            arrayList.add(0, 10);
        }

        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            arrayList.remove(0);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("ArrayList.Remove from the begin-method: " + endTime);

        arrayList.clear();

        for (int i = 0; i < size; ++i) {
            arrayList.add(0, 10);
        }
        startTime = System.nanoTime();
        for (int i = size - 1; i >= 0; --i) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("ArrayList.Remove from the end-method: " + endTime);

        arrayList.clear();
    }

}

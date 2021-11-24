package homework3.comparison;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task2 {

    private HashSet<Integer> hashSet = new HashSet<>();
    private LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
    private TreeSet<Integer> treeSet = new TreeSet<>();
    private int size = 10000;
    private long startTime;
    private long endTime;

    public Task2(int size) {
        this.size = size;
    }

    public void testAddSet() {
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            hashSet.add(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("HashSet.Add-method: " + endTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            linkedHashSet.add(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashSet.Add-method: " + endTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            treeSet.add(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("TreeSet.Add-method: " + endTime);

        hashSet.clear();
        treeSet.clear();
        linkedHashSet.clear();
    }


    public void testContainsSet() {
        for (int i = 0; i < size; ++i) {
            hashSet.add(i);
        }
        for (int i = 0; i < size; ++i) {
            linkedHashSet.add(i);
        }
        for (int i = 0; i < size; ++i) {
            treeSet.add(i);
        }

        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            hashSet.contains(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("HashSet.Contains-method: " + endTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            linkedHashSet.contains(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashSet.Contains-method: " + endTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            treeSet.contains(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("TreeSet.Contains-method: " + endTime);

        hashSet.clear();
        treeSet.clear();
        linkedHashSet.clear();
    }


    public void testRemoveSet() {
        for (int i = 0; i < size; ++i) {
            hashSet.add(i);
        }
        for (int i = 0; i < size; ++i) {
            linkedHashSet.add(i);
        }
        for (int i = 0; i < size; ++i) {
            treeSet.add(i);
        }

        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            hashSet.remove(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("HashSet.Remove-method: " + endTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            linkedHashSet.remove(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashSet.Remove-method: " + endTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            treeSet.remove(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("TreeSet.Remove-method: " + endTime);

        hashSet.clear();
        treeSet.clear();
        linkedHashSet.clear();
    }

}

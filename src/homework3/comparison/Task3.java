package homework3.comparison;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Task3 {

    private HashMap<Integer, Integer> hashMap = new HashMap<>();
    private LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
    private TreeMap<Integer, Integer> treeMap = treeMap = new TreeMap<>();
    private int size = 10000;
    private long startTime;
    private long endTime;

    public Task3(int size) {
        this.size = size;
    }

    public void testAddMap() {
        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            hashMap.put(i, i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("HashMap.Add-method: " + endTime);


        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            linkedHashMap.put(i, i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashMap.Add-method: " + endTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            treeMap.put(i, i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("TreeMap.Add-method: " + endTime);

        hashMap.clear();
        treeMap.clear();
        linkedHashMap.clear();
    }

    public void testGetMap() {
        for (int i = 0; i < size; ++i) {
            hashMap.put(i, i);
        }

        for (int i = 0; i < size; ++i) {
            linkedHashMap.put(i, i);
        }

        for (int i = 0; i < size; ++i) {
            treeMap.put(i, i);
        }

        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            hashMap.get(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("HashMap.Get-method: " + endTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            linkedHashMap.get(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashMap.Get-method: " + endTime);

        startTime = System.nanoTime();
        for (int i = 0; i < size; ++i) {
            treeMap.get(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("TreeMap.Get-method: " + endTime);

        hashMap.clear();
        treeMap.clear();
        linkedHashMap.clear();
    }

    public void testRemoveMap() {
        for (int i = 0; i < size; ++i) {
            hashMap.put(i, i);
        }

        for (int i = 0; i < size; ++i) {
            linkedHashMap.put(i, i);
        }

        for (int i = 0; i < size; ++i) {
            treeMap.put(i, i);
        }

        startTime = System.nanoTime();
        for (int i = size - 1; i >= 0; --i) {
            hashMap.remove(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("HashMap.Remove-method: " + endTime);

        startTime = System.nanoTime();
        for (int i = size - 1; i >= 0; --i) {
            linkedHashMap.remove(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashMap.Remove-method: " + endTime);

        startTime = System.nanoTime();
        for (int i = size - 1; i >= 0; --i) {
            treeMap.remove(i);
        }
        endTime = System.nanoTime() - startTime;
        System.out.println("TreeMap.Remove-method: " + endTime);

    }

}

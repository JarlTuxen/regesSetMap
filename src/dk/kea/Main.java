package dk.kea;

import java.util.*;

public class Main {

    public static void sortAndRemoveDuplicates(List<Integer> list) {
        Set<Integer> set = new TreeSet<Integer>(list);
        list.clear();
        for (Integer i : set) {
            list.add(i);
        }
    }

    public static int countUnique(List<Integer> list) {
        Set<Integer> set = new HashSet<Integer>();
        for (int value : list) {
            set.add(value);
        }
        return set.size();
    }

    public static void main(String[] args) {
        Integer[] duplicateArray = {7, 4, -9, 4, 15, 8, 27, 7, 11, -5, 32, -9, -9};
	    List<Integer> duplicates = new LinkedList<>(List.of(duplicateArray));
        System.out.println("Sort and Remove Duplicates");
        System.out.println("Tal: " + duplicates);
        sortAndRemoveDuplicates(duplicates);
        System.out.println("Sorteret uden kopier " + duplicates);
        System.out.println();

        Integer[] notUnique = {3, 7, 3, -1, 2, 3, 7, 2, 15, 15};
        List<Integer> notUniqueList = new LinkedList<>(List.of(notUnique));
        System.out.println("Count Unique");
        System.out.println("Tal: " + notUniqueList);
        System.out.println("Unikke tal: " + countUnique(notUniqueList));

    }
}

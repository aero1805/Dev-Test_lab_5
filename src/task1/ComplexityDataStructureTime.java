package task1;

import java.util.*;

public class ComplexityDataStructureTime {
    private static int COUNT_100000_ELEMETS = 100000;
    private static int COUNT_1_000_000_ELEMETS = 1000000;
    private static ArrayList arrayList100_000;
    private static LinkedList linkedList100_000;
    private static TreeSet<Integer> integerTreeSet1_000_000;
    private static HashSet<Integer> integerHashSet1_000_000;
    private static ArrayList arrayList1_000_000;
    private static LinkedList linkedList1_000_000;
    private static TreeSet<Integer> integerTreeSet100_000;
    private static HashSet<Integer> integerHashSet100_000;

    public static void main(String[] args) {
        System.out.println("------------Insert time complexity 1 00 000 elements--------\n");
        arrayList100_000 = new ArrayList();
        linkedList100_000 = new LinkedList();
        arrayList1_000_000 = new ArrayList();
        linkedList1_000_000 = new LinkedList();
        integerTreeSet1_000_000 = new TreeSet<>();
        integerHashSet1_000_000 = new HashSet<>();
        integerTreeSet100_000 = new TreeSet<>();
        integerHashSet100_000 = new HashSet<>();

        long insertTimeArrayList = getInsertTimeList(arrayList100_000, COUNT_100000_ELEMETS);
        long insertTimeLinkedList = getInsertTimeList(linkedList100_000, COUNT_100000_ELEMETS);
        double resList = (insertTimeArrayList * 1.0 / insertTimeLinkedList);

        System.out.println(String.format("%s%d%s", "ArrayList insert time  : ", insertTimeArrayList, " nanoseconds"));
        System.out.println(String.format("%s%d%s", "LinkedList insert time : ", insertTimeLinkedList, " nanoseconds"));
        System.out.println("Inserting LinkedList/ArrayList : " + resList + "\n");


        long insertTreeTimeSet = getInsertTimeSet(integerTreeSet100_000, COUNT_100000_ELEMETS);
        long insertTimeHAshSet = getInsertTimeSet(integerHashSet100_000, COUNT_100000_ELEMETS);
        double resSet = (insertTreeTimeSet * 1.0 / insertTimeHAshSet);

        System.out.println(String.format("%s%d%s", "TreeSet insert time : ", insertTreeTimeSet, " nanoseconds"));
        System.out.println(String.format("%s%d%s", "HashSet insert time : ", insertTimeHAshSet, " nanoseconds"));
        System.out.println("Inserting TreeSet/HashSet : " + resSet + "\n");


        System.out.println("\n------------Insert time complexity 1 000 000 elements--------\n");
        long insertTimeArrayList1 = getInsertTimeList(arrayList1_000_000, COUNT_1_000_000_ELEMETS);
        long insertTimeLinkedList1 = getInsertTimeList(linkedList1_000_000, COUNT_1_000_000_ELEMETS);
        double resList1 = (insertTimeArrayList1 * 1.0 / insertTimeLinkedList1);

        System.out.println(String.format("%s%d%s", "ArrayList insert time  : ", insertTimeArrayList1, " nanoseconds"));
        System.out.println(String.format("%s%d%s", "LinkedList insert time : ", insertTimeLinkedList1, " nanoseconds"));
        System.out.println("Inserting LinkedList/ArrayList : " + resList1 + "\n");

        long insertTreeTimeSet1 = getInsertTimeSet(integerTreeSet1_000_000, COUNT_1_000_000_ELEMETS);
        long insertTimeHAshSet1 = getInsertTimeSet(integerHashSet1_000_000, COUNT_1_000_000_ELEMETS);
        double resSet1 = (insertTreeTimeSet1 * 1.0 / insertTimeHAshSet1);

        System.out.println(String.format("%s%d%s", "TreeSet insert time : ", insertTreeTimeSet1, " nanoseconds"));
        System.out.println(String.format("%s%d%s", "HashSet insert time : ", insertTimeHAshSet1, " nanoseconds"));
        System.out.println("Inserting TreeSet/HashSet : " + resSet1 + "\n");

        System.out.println("\n------------Remove time complexity 1 000 000 elements--------\n");

        long removeTimeArrayList = removeTimeElementsFromList(arrayList100_000);
        long removeTimeLinkedList1 = removeTimeElementsFromList(linkedList100_000);
        double resListRemove = (insertTimeArrayList1 * 1.0 / insertTimeLinkedList1);

        System.out.println(String.format("%s%d%s", "ArrayList Remove time  : ", removeTimeArrayList, " nanoseconds"));
        System.out.println(String.format("%s%d%s", "LinkedList Remove time : ", removeTimeLinkedList1, " nanoseconds"));
        System.out.println("Removing LinkedList/ArrayList : " + resListRemove + "\n");

        long removeTimeTreeSet = removeTimeElementsFromSet(integerTreeSet1_000_000);
        long removeTimeHashSet = removeTimeElementsFromSet(integerHashSet1_000_000);
        double resSetRemove = (insertTimeArrayList1 * 1.0 / insertTimeLinkedList1);

        System.out.println(String.format("%s%d%s", "TreeSet Remove time  : ", removeTimeTreeSet, " nanoseconds"));
        System.out.println(String.format("%s%d%s", "HashSet Remove time : ", removeTimeHashSet, " nanoseconds"));
        System.out.println("Removing TreeSet/HashSet : " + resSetRemove + "\n");

        System.out.println("\n------------Search time complexity 1 00 000 elements--------\n");

        long searchTimeArrayList = getValueByTimeList(arrayList100_000, 75000);
        long searchTimeLinkedList = getValueByTimeList(linkedList100_000,75000);
        double resListSearch = (searchTimeArrayList * 1.0 / searchTimeLinkedList);

        System.out.println(String.format("%s%d%s", "ArrayList search time  : ", searchTimeArrayList, " nanoseconds"));
        System.out.println(String.format("%s%d%s", "LinkedList search time : ", searchTimeLinkedList, " nanoseconds"));
        System.out.println("Search LinkedList/ArrayList : " + resListSearch + "\n");

        long searchTimeTreeSet = getValueByTimeSet(integerTreeSet100_000, 75000);
        long searchTimeHashSet = getValueByTimeSet(integerHashSet100_000,75000);
        double resSetSearch = (searchTimeTreeSet * 1.0 / searchTimeHashSet);

        System.out.println(String.format("%s%d%s", "TreeSet search time  : ", searchTimeTreeSet, " nanoseconds"));
        System.out.println(String.format("%s%d%s", "HashSet search time : ", searchTimeHashSet, " nanoseconds"));
        System.out.println("Search TreeSet/HashSet : " + resSetSearch + "\n");

        System.out.println("\n------------Search time complexity 1 000 000 elements--------\n");

        long searchTimeArrayList1 = getValueByTimeList(arrayList1_000_000, 750000);
        long searchTimeLinkedList1 = getValueByTimeList(linkedList1_000_000,750000);
        double resListSearch1 = (searchTimeArrayList1 * 1.0 / searchTimeLinkedList1);

        System.out.println(String.format("%s%d%s", "ArrayList search time  : ", searchTimeArrayList1, " nanoseconds"));
        System.out.println(String.format("%s%d%s", "LinkedList search time : ", searchTimeLinkedList1, " nanoseconds"));
        System.out.println("Search LinkedList/ArrayList : " + resListSearch1 + "\n");

        long searchTimeTreeSet1 = getValueByTimeSet(integerTreeSet1_000_000, 750000);
        long searchTimeHashSet1 = getValueByTimeSet(integerHashSet1_000_000,750000);
        double resSetSearch1 = (searchTimeTreeSet1 * 1.0 / searchTimeHashSet1);

        System.out.println(String.format("%s%d%s", "TreeSet search time  : ", searchTimeTreeSet1, " nanoseconds"));
        System.out.println(String.format("%s%d%s", "HashSet search time : ", searchTimeHashSet1, " nanoseconds"));
        System.out.println("Search TreeSet/HashSet : " + resSetSearch1 + "\n");

    }

    private static long getInsertTimeList(List list, int count) {
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            list.add(new Object());
        }
        return System.nanoTime() - start;
    }

    private static long getInsertTimeSet(Set<Integer> list, int count) {
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        return System.nanoTime() - start;
    }

    private static long removeTimeElementsFromList(List list) {
        long start = System.nanoTime();
        for (int j = list.size() - 1; j >= 0; j--) {
            list.remove(list.get(j));
        }
        return System.nanoTime() - start;
    }

    private static long removeTimeElementsFromSet(Set<Integer> list) {
        long start = System.nanoTime();
        Iterator<Integer> iterator = list.iterator();
        if (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        return System.nanoTime() - start;
    }

    private static long getValueByTimeList(List list, int value) {
        long start = System.nanoTime();
        list.contains(value);
        return System.nanoTime() - start;
    }

    private static long getValueByTimeSet(Set<Integer> set, int value) {
        long start = System.nanoTime();
        set.contains(value);
        return System.nanoTime() - start;
    }
}

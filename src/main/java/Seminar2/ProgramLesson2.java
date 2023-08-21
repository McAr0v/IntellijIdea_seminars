package Seminar2;

import java.util.concurrent.atomic.AtomicInteger;

public class ProgramLesson2 {

    public static void main(String[] args) {

        int [] array = ArrayUtils.prepareArray();

        ArrayUtils.printArray(array);

        SortUtils.quickSort(array);

        ArrayUtils.printArray(array);

        int index = SearchUtils.binarySearch(array, 0, array.length-1, 5);

        System.out.println();
        System.out.println(index);

    }
}

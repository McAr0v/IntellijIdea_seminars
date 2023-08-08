package Seminar2;

import java.util.concurrent.atomic.AtomicInteger;

public class ProgramLesson2 {

    public static void main(String[] args) {

        int [] array = ArrayUtils.prepareArray();

        ArrayUtils.printArray(array);

        SortUtils.directSort(array);

        ArrayUtils.printArray(array);




    }
}

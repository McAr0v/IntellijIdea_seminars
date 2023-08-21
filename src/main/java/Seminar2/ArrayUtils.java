package Seminar2;

import java.util.Random;

public class ArrayUtils {

    private static Random random = new Random();
    public static int [] prepareArray(){

        return prepareArray(random.nextInt(10, 16));
    }

    public static int [] prepareArray(int length){
        int [] array = new int [length];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(0, 20);
        }

        return array;
    }

    public static void printArray (int[] array){
        for (int e: array){
            System.out.printf("%d\t", e);
        }

        System.out.println();
    }

}

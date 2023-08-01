package lesson1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ProgramLessonOne {

    public static void main(String[] args) {

        int hello = 5;
        AtomicInteger counter = new AtomicInteger();

        System.out.printf("Простые числа от 1 до %d: \n%s\n", hello, SimpleNumbers(hello, counter));
        System.out.println("Количество операций: " + counter.get());


    }

    public static int SumOfNumbers(int number, AtomicInteger counter){
        int sum = 0;

        for (int i = 1; i<= number; i++)
        {
            sum += i;
            counter.getAndIncrement(); // counter ++
        }

        return sum;
    }

    public static int SumOfNumbersVTwo (int lastNumber)
    {
        return ((1+lastNumber)*lastNumber) / 2;
    }

    public static ArrayList<Integer> SimpleNumbers(int number, AtomicInteger counter)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 1; i <= number; i++)
        {
            boolean flag = true;
            for (int j = 2; j<i; j++)
            {
                counter.getAndIncrement();
                if (i%j == 0) {
                    flag = false;
                    break;
                }

            }
            if (flag) arrayList.add(i);
        }

        return arrayList;
    }

}

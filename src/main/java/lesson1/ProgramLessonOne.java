package lesson1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ProgramLessonOne {

    public static void main(String[] args) {

        int hello = 43;
        AtomicInteger counter = new AtomicInteger();
//
//        System.out.printf("Простые числа от 1 до %d: \n%s\n", hello, SimpleNumbers(hello, counter));
//        System.out.println("Количество операций: " + counter.get());

        // recurcion(hello);
        long startTime = System.currentTimeMillis();
        System.out.println(Fibonacci2(hello, counter));
        long finishTime = System.currentTimeMillis();

        System.out.printf("Операция выполнена за %d мс, количество операций - %d", finishTime-startTime, counter.get());


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

    static void recurcion (int n)
    {
        System.out.println(n);
        if (n>=3){
            recurcion(n-1);
            recurcion(n-2);
            recurcion(n-2);
        }
    }

    public static int Fibonacci (int n, AtomicInteger counter)
    {
        counter.getAndIncrement();
        if (n == 0 || n == 1) return n;
        return  Fibonacci(n-1, counter) + Fibonacci(n-2, counter);
    }

    public static int Fibonacci2(int num, AtomicInteger counter)
    {

        if (num == 0 || num == 1) return num;

        int[] array = new int[num+1];
        array[0] = 0;
        array[1] = 1;

        for(int i = 3; i<array.length; i++ )
        {
            counter.getAndIncrement();
            array[i] = array[i-1]+array[i-2];
        }

        return array[num];

    }

}

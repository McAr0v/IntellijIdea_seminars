package Seminar2;

public class SortUtils {

    // Сортировка выбором

    public static void directSort(int[]array){
        for (int i = 0; i<array.length -1; i++){
            int minIndex = i;
            for (int j = i+1; j<array.length; j++){
                if (array[j]<array[minIndex]){
                    minIndex = j;
                }
            }

            if (i != minIndex){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

}

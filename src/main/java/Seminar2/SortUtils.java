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

    public static void quickSort(int[]array){
        if (array == null) return;
        quickSort(array, 0, array.length-1);
    }

    private static void quickSort(int[]array, int startIndex, int endIndex)
    {
        // Создадим переменные для работы
        // Эти переменные будут видоизменяться
        // Создаем, чтобы не затереть startIndex и endIndex
        int left = startIndex;
        int right = endIndex;

        // Вычисляем опорный элемент (середину массива)
        int middle = array[(startIndex+endIndex)/2];

        // Двигаем стартовый индекс и конечный к опорному элементу
        // Делаем действия ниже, пока не пересекутся старт и энд
        do {
            // Двигаемся от 0 индекса к нашему опорному элементу
            while (array[left] < middle){
                // Если элемент меньше, сдвигаем стартовый индекс
                // к опорному
                left++;
            }
            // Идем от конечного индекса к опорному
            while (array[right] > middle){
                // Если элемент больше чем опорный, сдвигаем конечный индекс
                // к опорному
                right--;
            }

            // После вышеописанный действий сравниваем
            if (left<= right){
                // Если левый меньше правого
                if (left<right){
                    // Меняем элементы местами
                    int temp = array[left];
                    array[left] = array[right];
                    array[right] = temp;
                }
                // Увеличиваем левый и уменьшаем правый
                left++;
                right--;
            }
        } while (left <= right);

        // Теперь сортируем 2 разные части
        //
        // левую от опорного элемента
        if (left < endIndex){
            quickSort(array, left, endIndex);
        }

        // Правую от опорного элемента
        if (right > startIndex){
            quickSort(array, startIndex, right);
        }

    }

}

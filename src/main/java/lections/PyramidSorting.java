package lections;

public class PyramidSorting {

    public static void main (String[] args){
        int [] array = new int[] {1,4,6,10,12,3,1,2,6, 5};

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }

        System.out.println("");
        HeapSort(array);

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }

    }

    public static void HeapSort (int[]array){
        // Построение кучи (перегруппируем массив)
        for (int i = array.length / 2 -1; i>=0; i--) pyramidSorting(array, array.length, i);

        // ОДин за другим извлекаем элементы из кучи
        for (int i = array.length-1; i>=0; i--)
        {
            // Перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Вызываем pyramidSorting на уменьшеной куче
            pyramidSorting(array, i, 0);
        }
    }


    public static void pyramidSorting (int[]array, int heapSize, int rootIndex)
    {
        int largest = rootIndex; // Инициализируем наибольний элемент как корень
        int leftChild = 2*rootIndex +1; // левый
        int rightChild = 2*rootIndex +2;

        // Если левый дочерний элемент больше корня
        if (leftChild<heapSize && array[leftChild]>array[largest]) largest = leftChild;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (rightChild<heapSize && array[rightChild]>array[largest]) largest = rightChild;

        // Если самый большой элемент не корень
        if (largest != rootIndex){
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            pyramidSorting(array, heapSize, largest);
        }

    }

}

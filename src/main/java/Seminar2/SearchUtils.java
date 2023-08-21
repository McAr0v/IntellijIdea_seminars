package Seminar2;

public class SearchUtils {

    public static int binarySearch(int [] array, int startIndex, int endIndex, int searchNumber) {


        if (endIndex < startIndex) return -1;

        int middle = (endIndex + startIndex) / 2;

        if (array[middle] == searchNumber) {
            return middle;
        } else if (array[middle] < searchNumber) {
            return binarySearch(array, middle + 1, endIndex, searchNumber);
        } else {
            return binarySearch(array, startIndex, middle - 1, searchNumber);
        }
    }
}

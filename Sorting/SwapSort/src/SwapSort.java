public class SwapSort {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1000, 2, 3, -100, 20};
        sort(array);
        printArray(array);
    }

    public static int smallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }  

    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                index = i;
            }
        }
        return index;
    }   

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int index = 0;
        int smallest = Integer.MAX_VALUE;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }   

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void printArray(int[] array) {
        String output = "{";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                output += array[i] + "}";
            } else {
                output += (array[i] + ", ");
            }
        }
        System.out.println(output);
    }

    public static void sort(int[] array) {
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            int indexOfSmallest = indexOfSmallestFrom(array, currentIndex);
            swap(array, currentIndex, indexOfSmallest);
        }
    }
}
public class Tester {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 15;
        int[] arr1 = getArray(ARRAY_SIZE);
        int[] arr2 = getArray(ARRAY_SIZE);

        printArray(arr1);
        printArray(arr2);
        System.out.println(getBigNumber(arr1, 4));
    }

    public static int[] getArray(int arraySize) {
        int[] newArray = new int[arraySize];
        for (int counter = 0; counter < newArray.length; counter++) {
            newArray[counter] = (int) (Math.random() * 10);
        }
        return newArray;
    }

    public static void printArray(int[] array) {
        for (int counter = 0; counter < array.length; counter++) {
            System.out.print(array[counter] + " ");
        }
        System.out.println();
    }
    //1,2,3,4
    //1234

    public static int getBigNumber(int[] array, int numberSize) {
        int bigNumber = 0;
        for (int counter = 0; counter < array.length - numberSize; counter++) {
            int myNumber = 0;
            for (int index = counter; index < counter+numberSize; index++) {
                myNumber = myNumber * 10 + array[index];
            }
            if (myNumber > bigNumber) {
                bigNumber = myNumber;
            }
        }
        return bigNumber;
    }
}


//-1,-1,-1,-1,-1,-1,-1,-1;
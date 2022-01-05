public class Tester {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 15;
        int[] arr1 = getArray(ARRAY_SIZE);
        int[] arr2 = getArray(ARRAY_SIZE);

        printArray(arr1);
        printArray(arr2);
        System.out.println(getBigNumber(arr1, 4));

        //int[] distinct = getDistinct(arr1,arr2,ARRAY_SIZE);
        printArray(getDistinct(arr1,arr2,ARRAY_SIZE));

    }

    public static int[] getDistinct(int[] arr1, int[] arr2, int size){
        int[] distinct = fillMinus(size);
        int pointer=0;
        boolean isfound=false;
        //make it a function also.......
        for (int indexArr1 = 0; indexArr1 < arr1.length; indexArr1++) {
            isfound=false;
            for (int indexArr2 = 0; indexArr2 < arr2.length; indexArr2++) {
                if (arr1[indexArr1]==arr2[indexArr2]){
                    isfound=true;
                    break;
                }

            }
            if (!isExists(distinct,arr1[indexArr1]) && !isfound){
                distinct[pointer]=arr1[indexArr1];
                pointer++;
            }
        }
        return distinct;
    }

    public static boolean isExists(int[] distinct, int number){
        for (int index = 0; index < distinct.length; index++) {
            if (distinct[index]==number){
                return true;
            }
        }
        return false;
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

    public static int[] fillMinus(int size){
        int[] myArray = new int[size];
        for (int index = 0; index < myArray.length; index++) {
            myArray[index]=-1;
        }
        return myArray;
    }
}



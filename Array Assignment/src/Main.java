public class Main {

    //create an array with n elements and assign value for each element
    public static int[] createArray( int n) {
        int[] arr1 = new int[n];
        for (int i=0; i<arr1.length;i++) {
            arr1[i] = i*10;
        }
        return arr1;
    }
    //Print content of an array by giving it an array name
    public static void printArray(int[] arr) {
        for ( int i=0; i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    // Chooses an array and its index position that is to be deleted
    public static int[] deleteItem(int[] array,int n) {
        int[] deletedArray = array;
        int[] resultArr = new int[deletedArray.length -1];// Shrinks the size of the chosen array
        int[] tempArr2 = new int[n];// Temporary array that keeps element with index less than n
        int[] tempArr3 = new int[deletedArray.length];// Another temporary array that keeps element with index greater than or equal to n
        for (int i=0;i<deletedArray.length-1;i++) {
            if (i <n ) {
                tempArr2[i] = deletedArray[i];// index pos <n will be stored elements into a temporary array- tempArr2
                resultArr[i] = tempArr2[i];// store elements from temArr2 to result array
            }
            else {
                tempArr3[i] = deletedArray[i+1];// index pos >= n will store elements into tempArr3
                resultArr[i] = tempArr3[i];// Store elements from tempArr3 to resultArr
            }
        }
        return resultArr;
    }
    // Adds an element to the end of chosen array with a value of v
    public static int[] addItem(int[] array, int n, int v) {
        int[] addedArray = array;// Increases size of added array
        int[] resultArr = new int[array.length + 1];
        int[] tempArr1 = new int[array.length + 1];
        for (int i=0; i<resultArr.length-1;i++) {
            if ( i<n ) {
                tempArr1[i] = addedArray[i];
                resultArr[i] = tempArr1[i];
            }
            else if (i==n){
                tempArr1[i+1] = addedArray[i];
                resultArr[i+1] = tempArr1[i+1];
                resultArr[i] = v;
            }
            else {
                tempArr1[i+1] = addedArray[i];
                resultArr[i+1] = tempArr1[i+1];
            }
        }
        return resultArr;
    }

    public static void main (String args[]) {
        System.out.println("Creating an array:");
        int[] arr = createArray(8);
        printArray(arr);
        int n1 = 5;
        System.out.println("Deleting item at position: "+n1);

        int[] deleteArr = deleteItem(arr,n1);
        System.out.println("Array after deletion of item at position: "+n1);
        printArray(deleteArr);
        int m = 99;
        int n2 = 3;
        System.out.println("Add a new item to position "+ n2 + " with value of "+m);
        int[] addArr = addItem(deleteArr,n2,m);
        printArray(addArr);
    }
}



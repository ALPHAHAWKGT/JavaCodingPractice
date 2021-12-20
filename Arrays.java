public class Arrays {
    public static void main(String[] args) {
        //System.out.println("Hello World");
        Arrays object = new Arrays();
        //object.arrayInitialize(6);
        int[] arr = new int[3];
        arr[0] = -3;
        arr[1] = -8;
        arr[2] = -3;
        //System.out.println(object.arrayAverage(arr));
        //System.out.println(object.searchElement(arr, 7));
        //System.out.println(object.productSign(arr));
        //System.out.println(object.occur(arr,7));
       int[] result = object.maxMin(arr);
       System.out.println(result[0]);
       System.out.println(result[1]);
    }

    public void arrayInitialize(int length) {
        int[] arr = new int[length];
        //index
        for (int i = 0; i < length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }

    public double arrayAverage(int [] arr) {
        //System.out.println(arr.length);
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / arr.length;
    }

    /*Q1. [10 pts] Write a method that takes an array of integer and an integer called searchElement return the index of the searchElement in the array. If the element doesn’t exists in the array return -1
eg1:
arr = [1,2,3,4,5], searchElement = 3
O/P: 2 (3 exists at 2nd index)
eg2:
arr = [1,2,3,4,5], searchElement = 7
O/P: -1 (since 7 doesn’t exist so return -1)*/

    //TODO (Question 1)
    public int searchElement(int [] arr, int search) {
        //traversing array
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num == search) {
                return i;
            }
        }
        return -1;
    }
/*Q2. [10 pts] Given an array of integers return 0 if product is 0, -1 if product is -ve, ‘1’ if product is +ve.
            Note: You are not allowed to use multiplication
    eg1: [-1,2,3,4,5] O/P: -1 (since the product will be -ve)
    eg2: [1,0,4,5,3] O/P: 0 (since the product will be 0)
    eg3: [-1,-1,1,2,3] O/P: 1 (since the product will be +ve)
    eg3: [1,1,1,2,3] O/P: 1 (since the product will be +ve)

    Create variable results and create the array. The use 3 if statements for the 3 cases. */
/*
return 1 cases: no negatives, even number of negatives
return 0 cases: if there is a zero in the array
return -1 cases: if there is an odd number of negatives
 */

    //TODO (Question 2)
    public int productSign(int [] arr) {
        int neg = 0;
        //traversing array
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            //return 0 cases: if there is a zero in the array
            if (num == 0) {
                return 0;
            }
            //counting negative numbers
            if (num < 0) {
                neg = neg + 1;
            }

        }
        int rem = neg % 2;
        //return -1 cases: if there is an odd number of negatives
        if (rem == 1) {
            return -1;
        }
        //return 1 cases: no negatives, even number of negatives
        return 1;
    }
// Example: array = 3,8,3 Max = ? Min = ?
    public int[] maxMin(int [] arr) {
        // Integer.MIN_VALUE is the greatest integer value in java and is equivalent to -2147483648
        int max = Integer.MIN_VALUE;
        // Integer.MAX_VALUE is the greatest integer value in java and is equivalent to 2147483647
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //initializing array
        int[] answer = new int[2];
        answer[0] = min;
        answer[1] = max;
        return answer;
    }
// Example: array = 1,2,3  term = 2
    public int occur(int [] arr, int term) {
        int count = 0;
        for (int i=0; i < arr.length; i++) {
            if (arr[i] == term) {
                count = count + 1;
            }
        }
    return count;
    }
}


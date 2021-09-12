public class Arrays {
    public static void main (String [] args) {
    System.out.println("Hello World");
    Arrays object = new Arrays ();
    object.arrayInitialize(6);
    }
    public void arrayInitialize(int length) {
        int [] arr = new int [length];
        //index
        for (int i = 0; i < length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }
}
/*
1. Given an array, write a method that calculates the average of an array.
Ex. [1,2,3,4,5] Average = 1+2+3+4+5/5 = 15/5 = 3
Hint: Use forLoop to iterate the array. arr.length tells you the size of the array.
2. Given an array of strings and a search word, return if the word exists in the array or not.
Hint: String [] array = new String [Length]
["Dhruv","Akshay","Munni","Anip","Abha"]
If word is not one of these, will print not found. If exists, will print found.
Use "Dhruv".equals("Anip") method
 */
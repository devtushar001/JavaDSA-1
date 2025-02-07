package JavaDSA02;

public class javaArray {
  public static void main(String[] args) {
    // int myArry[] = {
    // 1, 2, 3, 4, 5, 6, 7, 8, 9
    // };
    // System.out.println(myArry[8]);

    // int arr[] = { 2, 1, 27, 21, 10 };
    // for(int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);
    // };

    // System.out.println(arr[3]); // 21
    // System.out.println(arr[-1]); // Index -1 out of bounds for length 5
    // System.out.println(arr[5]); // Index -1 out of bounds for length 5

    // System.out.println(arr); //[I@372f7a8d address of array
    // System.out.println("Array length: "+arr.length);

    // char arr[] = {
    // 'A', 'b', 'h', 'a', 'y'
    // };
    // System.out.println(arr); // Abhay

    int arr[] = { 4, 1, 2, 3, 6, 7, 4 };

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+", ");
      // arr[i] = 5; // changing all array values to 5
    } // first way or indexed base loop

    // Value based loop is faster than indexed based loop range based loop works on
    // only for loop
    for (int x : arr) {
      x = 6;
      System.out.print(x + ", ");
    } // faster way but updation not allowed and index can not be accessed.
    for (int x: arr) {
      System.out.print(x+", ");
    }
  }
}

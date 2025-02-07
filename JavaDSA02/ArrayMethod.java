package JavaDSA02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethod {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt(); //1, 2, 4, 6, 7, 
    }

    // Traditional way to get sum
    // int sum = 0;
    // for (int x : arr) {
    //   sum += x;
    // }

    // System.out.println(sum);

    // int sum = Arrays.stream(arr).sum();
    // System.out.println(sum);  // it's uses the value based travercing in array

    // System.out.println(Arrays.stream(arr).sum()); //15
    // System.out.println(Arrays.stream(arr)); // java.util.stream.IntPipeline$Head@1d81eb93

    // System.out.println(Arrays.sort(arr));
    Arrays.sort(arr);
 
    for(int x: arr) {
      System.out.print(x+", ");
    }

    sc.close();
  }
} // Traditional way to get sum

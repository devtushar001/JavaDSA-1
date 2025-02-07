package JavaDSA02;

import java.util.Scanner;

public class Array {
   public static void main(String[] args) {
      System.out.print("Enter array length");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      String[] cars = new String[n];
      for(int i = 0; i < n; i++) {
        cars[i] = sc.next();
      }

      for(String x: cars) {
         System.out.print(x);
      }
      sc.close();
    }
}

package JavaDSA02;

import java.util.Scanner;

public class ArrayData {
  public static void main(String[] args) {
    System.out.print("Enter your car's name: ");
    Scanner sc = new Scanner(System.in);
       String[] cars = new String[5]; // Automatically initialized memory size of arry  by default with null
      //  System.out.print(cars[0]+", ");
      //  System.out.print(cars[1]+", ");
      //  System.out.print(cars[2]+", ");
      //  System.out.print(cars[3]);

       // Arrays in java are automatic initialized with the default value of that particular datatype

       for(int i = 0; i < 5; i++) {
        cars[i] = sc.next();
        // cars[0] = 'Baleno';
        // cars[1] = 'BMW';
       }

       for(String x : cars) {
        System.out.print(x + ", ");
       }

       sc.close();
   }
}

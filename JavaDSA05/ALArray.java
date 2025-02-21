package JavaDSA05;

import java.util.ArrayList;
import java.util.List;

public class ALArray {
  public static void main(String[] args) {
    // Array List Java

    ArrayList<Integer> ArrList = new ArrayList<>();
    // List<Integer> ArrList = new ArrayList<>();
    // Integer is generic class every inbuild data structure in java collection are
    // all inbuild data structure in java collection can printed data structure
    // generics

    // class<E> generice

    ArrList.add(1);
    ArrList.add(3);
    ArrList.add(4);

    System.out.println(ArrList); // printing array with stored data
    System.out.println(ArrList.size()); // checking size

    ArrList.add(2, 5);// index, value (example of method overloading// number of parameter or change
                      // type of parameter)
    System.out.println(ArrList);
    // System.out.println(ArrList[i]); //error

    System.out.println(ArrList.get(3));
    ArrList.add(0, 10);
    System.out.println(ArrList);

    ArrList.remove(3); //Pass index

    System.out.println(ArrList.remove(3)); //4

    // add(index, value) get(index) size() remove(index)
    
  }
}

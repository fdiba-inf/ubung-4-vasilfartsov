package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayReversal{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();
    char[] array = new char[n];
    char[] newarray = new char[array.length];

    for(int i = 0; i < array.length; i++){
      array[i] = input.next().charAt(0);
    }

    for(int i = 0; i < array.length; i++){
      newarray[newarray.length - i - 1] = array[i];
    }

    String newchars = Arrays.toString(newarray);

    System.out.println("Reversed symbols: " + newchars);
  }

}
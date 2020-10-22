package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal{

  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    char ArraySize = input.nextInt();
    char[]Array = new char[ArraySize];
    char[]reversedArray = new char[ArraySize];

    for(int i=0;i<Array.length;i++){
      Array[i]=input.nextLine().charAt(0);
    }
     for(int i=0;i<Array.length;i++){
       reversedArray[i]=Array[Array.length-1-i];
     }
     System.out.println(reversedArray);
  }
}
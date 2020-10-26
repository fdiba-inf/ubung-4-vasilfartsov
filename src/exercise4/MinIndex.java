package exercise4;

import java.util.Scanner;

public class MinIndex{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int index = 0;
    float minValue = Float.MAX_VALUE;
    int n = input.nextInt();
    float[] array = new float[n];

    for(int i = 0; i < array.length; i++){
      array[i] = input.nextFloat();
    }

    for(int i = 0; i < array.length; i++){

      if(array[i] < minValue){
        minValue = array[i];
        index = i;
      }
    }

    System.out.println("Min index: " + index);
  }
}
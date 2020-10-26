package exercise4;

import java.util.Scanner;

public class MaxElement{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();
    float[] array = new float[n];

    float maxValue = 0;

    for(int i = 0; i < array.length; i++){
      array[i] = input.nextFloat();
    }
    for(int i = 0; i < array.length; i++){
      if(array[i] > maxValue){
        maxValue = array [i];
      }
    }

    System.out.println("Max number: " + maxValue);
  }
}
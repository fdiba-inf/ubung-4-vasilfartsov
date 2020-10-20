package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] number = new int[count];
        for(int a = 0; a<number.length;a++){
          number[a] = input.nextInt();
        }

        int space = 0;
        for(int a = 0; a<number.length; a++){
          for(int b = 0; b < space; b++){
            System.out.print(" ");

          }
          space++;
          System.out.println(number[a]);
        }
    }
} 
package gr.codehub.JavaExercise1;

import java.util.Scanner;

public class DecimalCounter {

    public static void main(String[] args) {
      float number;
        System.out.println("Enter a float number using ',' ");
        Scanner input = new Scanner(System.in);
        String text = Float.toString(input.nextFloat());
        String[] splitter = text.split("\\.");
        System.out.println("The decimal part of the number is 0." + splitter[1]);
    }

}

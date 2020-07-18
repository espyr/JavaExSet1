package gr.codehub.JavaExercise1;

import java.util.Scanner;

public class DigitCounter {

    public static void main(String[] args) {

        System.out.println("Enter a long number");
        Scanner input = new Scanner(System.in);

            long number = input.nextLong();
        System.out.println(number);
        String text = Long.toString(Math.abs(number));
        System.out.println(text);
            System.out.println("The number of digits is " + text.length());
        }


    }




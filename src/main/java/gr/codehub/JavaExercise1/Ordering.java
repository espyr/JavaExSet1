package gr.codehub.JavaExercise1;

import java.util.Arrays;
import java.util.Scanner;

public class Ordering {

    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        Integer number = input.nextInt();
        String text = Integer.toString(Math.abs(number));
        char tempArray[] = text.toCharArray();
        Arrays.sort(tempArray);
        System.out.println(new String(tempArray));

    }
}

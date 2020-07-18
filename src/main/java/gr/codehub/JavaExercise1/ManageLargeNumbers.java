package gr.codehub.JavaExercise1;

import java.math.BigInteger;
import java.util.Scanner;

public class ManageLargeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        try{
        Integer number = input.nextInt();
        System.out.println(number);
        }
        catch(Exception e){
            System.out.println("Very Large Number Entered");
            BigInteger number = input.nextBigInteger();
            System.out.println(number);
        }


    }
}

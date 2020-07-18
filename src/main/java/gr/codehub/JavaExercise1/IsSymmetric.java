package gr.codehub.JavaExercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsSymmetric {
    public static String revereWord(String str) {

        int n = str.length();
        char[] temp = new char[n];
        for (int i = 0; i < n; i++)
            temp[n - i - 1] = str.charAt(i);

        return String.copyValueOf(temp);
    }

    public static boolean isSymmetric(String w) {
        String word = w.toLowerCase();
        int halfLength = word.length() / 2;
        String firstHalf = word.substring(0, halfLength);
        if ((word.length() % 2) == 1) {
            String secondHalf = word.substring(halfLength + 1, word.length());
            return firstHalf.equals(revereWord(secondHalf));
        } else {
            String secondHalf = word.substring(halfLength, word.length());
            return firstHalf.equals(revereWord(secondHalf));
        }
    }

    public static void main(String[] args) {
        boolean flag = false;
        List<Integer> userList = new ArrayList<Integer>();

        System.out.println("Enter a word ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        if(isSymmetric(word))
        System.out.println("The word is symmetric");
        else
            System.out.println("The word isn't symmetric");


    }
}

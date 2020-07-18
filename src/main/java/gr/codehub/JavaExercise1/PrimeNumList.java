package gr.codehub.JavaExercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumList {


    static boolean checkPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            return false;
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            if (flag == 0) return true;
        }//end of else
        return false;
    }


    public static void main(String[] args) {
        boolean flag = false;
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> primeList = new ArrayList<Integer>();
        System.out.println("Enter some number and then 'ok' ");
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            list.add(input.nextInt());
        }

        for (Integer f : list) {
            flag = checkPrime(f);
            if (flag)
                primeList.add(f);
        }

        System.out.println(primeList);


    }

}

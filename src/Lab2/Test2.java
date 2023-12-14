package Lab2;

import java.util.Scanner;


public class Test2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int x = in.nextInt();

        int result = x % 5;
        System.out.println("result =" + result);
        if (result == 2) {
            System.out.println("При делении числа на пять в остатке получается два ");
        } else {
            System.out.println("При делении числа на пять в остатке в остатке не получается два");

            System.out.println("Введите любое целое число");
            int y = in.nextInt();

            int result_2 = y % 7;
            System.out.println("result =" + result_2);
            if (result_2 == 1) {
                System.out.println("При делении числа на семь в остатке получается один ");
            } else {
                System.out.println("При делении числа на семь в остатке в остатке не получается один");


            }
        }

    }
}

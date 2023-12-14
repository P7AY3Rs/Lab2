package Lab2;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");

        int x = in.nextInt();

        if (x > 5  && x < 10)
            System.out.println("Число попадает в диапазон");
        else
            System.out.println("Число не попадает в диапазон");
    }
}

package Lab2;

import java.util.Scanner;


public class Test3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число больше 10 и которое делится на 4 без остатка");

        int x = in.nextInt();

        if (x % 4  == 0 && x > 10)
            System.out.println("Число соотвествует условиям");
        else
            System.out.println("Число не соотвествует условиям");
    }

}

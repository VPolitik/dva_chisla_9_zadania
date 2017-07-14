package com.courses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, y;
        double pol_sum, proizv;
        System.out.println("Введите число X: ");
        x = in.nextInt();
        System.out.println("Введите число Y: ");
        y = in.nextInt();
        if (x > y) {
            pol_sum = (x + y) / 2;
            x = x * y;
            y = pol_sum;
            System.out.println("Меньшее число мы заменили на половину их сум Y = " + y + ", а большее на их удвоенно произведение X = " + x);
        } else {
            pol_sum = (x + y) / 2;
            y = x * y;
            x = pol_sum;
            System.out.println("Меньшее число мы заменили на половину их сум X = " + x + ", а большее на их удвоенно произведение Y = " + y);
        }
    }
}

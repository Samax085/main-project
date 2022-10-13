package homework.myTest;

import java.util.Scanner;

public class basicCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество метров");
        int a = scanner.nextInt();
        double b = a * 0.00062137;
        double c = a * 1.0936133;
        double d = a * 3.2808399;

        if (b > 0 & b < 1) {
            System.out.println(b + "Миль");
        }
        if (b > 1) {
            System.out.println(b + " Миль");
        } else {
            System.out.println(b + " Миля");
        }
        if (c > 1 & c <= 4) {
            System.out.println(c + " Ярда");
        }
        if (c == 1) {
            System.out.println(c + " Ярд");
        } else {
            System.out.println(c + " Ярдов");
        }
        if (d == 1) {
            System.out.println(d + " Фут");
        }
        if (d > 1 & d < 5) {
            System.out.println(d + " Фута");
        } else {
            System.out.println(d + " Футов");
        }

    }
}

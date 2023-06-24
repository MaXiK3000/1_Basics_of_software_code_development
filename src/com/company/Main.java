package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1_1();
//        task1_2();
//        task1_3();
//        task1_4();
//        task1_5();
//        task1_6();
//        task2_1();
//        task2_2();
//        task2_3();
//        task2_4();
//        task2_5();
//        task3_1();
//        task3_2();
//        task3_3();
//        task3_4();
//        task3_5();
//        task3_6();
//        task3_7();
//        task3_8();
    }

    private static void task1_1() {
        float a = 4f, b = 2f, c = 1f;
        float z = ((a - 3) * b / 2) + c;
        System.out.print("Ответ: " + z);
    }

    private static void task1_2() {
        float a = 4f, b = 2f, c = 1f;
        double result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.print("Ответ: " + result);
    }

    private static void task1_3() {
        float x = 2f, y = 4f;
        double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.print("Ответ: " + result);
    }

    private static void task1_4() {
        float r = 123.456f;
        short n = (short) r;
        short d = (short) ((r - n) * 1000);
        String new_R = d + "." + n;
        float result = Float.parseFloat(new_R);
        System.out.print("Изначальное число: " + r + "\nОтвет: " + result);
    }

    private static void task1_5() {
        long t = 43456;
        short h = (short) (t / 3600);
        short m = (short) ((t - h * 3600) / 60);
        short s = (short) (t - h * 3600 - m * 60);
        System.out.print(h + ("ч ") + m + "мин " + s + "с");
    }

    private static void task1_6() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        byte x = in.nextByte();
        System.out.print("Введите y: ");
        byte y = in.nextByte();
        boolean result = x >= -2 && x <= 2 && y >= 0 && y <= 4
                || x >= -4 && x <= 4 && y >= -3 && y <= 0;
        System.out.print(result);
    }

    private static void task2_1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первый градус треугольника: ");
        float degree1 = in.nextFloat();
        System.out.print("Введите второй градус треугольника: ");
        float degree2 = in.nextFloat();
        String result;
        if (degree1 + degree2 < 180) {
            result = "Такой треугольник существует";
            if (degree1 == 90 || degree2 == 90 || 180 - degree1 - degree2 == 90) {
                result = "Треугольник прямоугольный";
            }
        } else {
            result = "Такого треугольника не существует";
        }
        System.out.print(result);
    }

    private static void task2_2() {
        int a = 1, b = 2, c = 3, d = 4;
        System.out.print(max(min(a, b), min(c, d)));
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int min(int a, int b) {
        return (a > b) ? b : a;
    }

    private static void task2_3() {
        float x1 = 3, y1 = 2, x2 = 6, y2 = 4, x3 = 12, y3 = 8;
        boolean result = x1 / y1 == x2 / y2 && x1 / y1 == x3 / y3;
        System.out.print(result);
    }

    private static void task2_4() {
        int a = 10, b = 12, x = 8, y = 4, z = 9;
        boolean result = min(a, b) > max(x, max(y, z));
        System.out.print(result);
    }

    private static void task2_5() {
        Scanner in = new Scanner(System.in);
        float f, x;
        System.out.print("Введите x: ");
        x = in.nextFloat();
        if (x <= 3) {
            f = (float) Math.pow(x, 2) - 3 * x + 9;
        } else {
            f = (float) (1 / (Math.pow(x, 3) + 6));
        }
        System.out.print("Ответ: " + f);
    }

    private static void task3_1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число: ");
        long a = in.nextLong();
        if (a <= 0) {
            System.out.print("Число отрицательное");
            System.exit(1);
        }
        long result = 0;
        for (int i = 0; i < a; i++) {
            result += i + 1;
        }
        System.out.print("Ответ: " + result);
    }

    private static void task3_2() {
        double a = -5, b = 5, h = 0.5, y;
        for (double x = a; x < b; x += h) {
            if (x > 2) {
                y = x;
                System.out.println(y);
            } else {
                y = -x;
                System.out.println(y);
            }
        }
    }

    private static void task3_3() {
        long result = 0;
        for (int i = 0; i < 100; i++) {
            result += Math.pow(i + 1, 2);
        }
        System.out.print(result);
    }

    private static void task3_4() {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 0; i < 200; i++) {
            result = result.multiply(BigInteger.valueOf((long) Math.pow(i + 1, 2)));
        }
        System.out.print("Ответ: " + result);
    }

    private static void task3_5() {
        int n = 1;
        double e = 0.1, result = 0;
        while (Math.abs(1 / Math.pow(2, n) + 1 / Math.pow(3, n)) >= e) {
            result += 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            n++;
        }
        System.out.print("Ответ: " + result);
    }

    private static void task3_6() {
        for (int i = 0; i < Character.MAX_VALUE; i++) {
            System.out.println("Числу " + i + " соответсвует символ " + (char) i);
        }
    }

    private static void task3_7() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите начало промежутка: ");
        int m = in.nextInt();
        System.out.print("Введите конец промежутка: ");
        int n = in.nextInt();
        StringBuilder result;
        for (int i = m; i <= n; i++) {
            if (i > 2) {
                result = new StringBuilder("");
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        result.append(j).append(" ");
                    }
                }
                System.out.println("Число " + i + " имеет делители: " + result);
            }
        }
    }

    private static void task3_8() {
        int[] arr = new int[10];
        int a = 495300236;
        while (a != 0) {
            arr[a % 10]++;
            a /= 10;
        }
        int b = 590;
        while (b != 0) {
            if (arr[b % 10] != 0)
                System.out.print(b % 10 + " ");
            b /= 10;
        }
    }
}
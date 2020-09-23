package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**
         Линейные программы
         **/
        // Task_1
//        System.out.print("Введите a: ");
//        double a = scan.nextDouble();
//        System.out.print("Введите b: ");
//        double b = scan.nextDouble();
//        System.out.print("Введите c: ");
//        double c = scan.nextDouble();
//        double z = ((a - 3) * (b / 2)) + c;
//        System.out.println("Результат: " + z);

        // Task_2
//        System.out.print("Введите a: ");
//        double a = scan.nextDouble();
//        System.out.print("Введите b: ");
//        double b = scan.nextDouble();
//        System.out.print("Введите c: ");
//        double c = scan.nextDouble();
//        System.out.println("Answer: " + (((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a)) - (a * a * a * c) + Math.pow(b, -2)));

        // Task_3
//        System.out.print("Введите x: ");
//        double x = scan.nextDouble();
//        System.out.print("Введите y: ");
//        double y = scan.nextDouble();
//        System.out.println(((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y));

        // Task_4
//        System.out.print("Введите дробное 6-значное число: 3 знака до и после запятой: ");
//        double number = scan.nextDouble();
//        int integerPart = (int) number;
//        int doublePart = (int) Math.round((number % 1) * 1000);
//        double newNumber = doublePart + (integerPart / 1000d);
//        System.out.println(newNumber);


        // Task_5
//        System.out.print("Введите натуральное число - прошеднее время в секундах: ");
//        int time = scan.nextInt();
//        int hours = time / 3600;
//        int minutes = (time - (hours * 3600)) / 60;
//        int seconds = time - ((hours * 3600) + (minutes * 60));
//        System.out.println("Прошедшее время: " + timeConverter(hours) + ":" + timeConverter(minutes) + ":" + timeConverter(seconds));

        // Task_6
//        System.out.println("Введите координаты числа: ");
//        System.out.print(" x = ");
//        int x = scan.nextInt();
//        System.out.print(" y = ");
//        int y = scan.nextInt();
//        if (((x >= -2 && x <= 2) && (y <= 4 && y >= -3)) || ((x >= -4 && x <= 4) && (y <= 0 && y >= -3))) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }


        /**
         Ветвления
         **/
        // Task_1
//        System.out.println("Введите два угла треугольника:");
//        System.out.print("Угол a = ");
//        int a = scan.nextInt();
//        System.out.print("Угол b = ");
//        int b = scan.nextInt();
//        if (a >= 90 && b >= 90) {
//            System.out.println("Треугольника не существует");
//        } else {
//            System.out.println("Треугольник существует");
//            if (a == 90 || b == 90) {
//                System.out.println("И треугольник прямоугольный");
//            }
//        }

        // Task_2
//        System.out.println("Введите числа:");
//        System.out.print("a = ");
//        double a = scan.nextDouble();
//        System.out.print("b = ");
//        double b = scan.nextDouble();
//        System.out.print("c = ");
//        double c = scan.nextDouble();
//        System.out.print("d = ");
//        double d = scan.nextDouble();
//        if (min(a, b) > min(c, d)) {
//            System.out.println("max = " + min(a, b));
//        } else {
//            System.out.println("max = " + min(c, d));
//        }

        // Task_3
//        System.out.println("Введите три координаты 3-х точек");
//        System.out.print("A: x1 = ");
//        int x1 = scan.nextInt();
//        System.out.print("y1 = ");
//        int y1 = scan.nextInt();
//        System.out.println();
//        System.out.print("B: x2 = ");
//        int x2 = scan.nextInt();
//        System.out.print("y2 = ");
//        int y2 = scan.nextInt();
//        System.out.println();
//        System.out.print("C: x3 = ");
//        int x3 = scan.nextInt();
//        System.out.print("y3 = ");
//        int y3 = scan.nextInt();
//        if ((x1 - x3) / (x2 - x3) == (y1 - y3) / (y2 - y3)) {
//            System.out.println("Точки лежат на одной прямой");
//        } else {
//            System.out.println("Точки не лежат на одной прямой");
//        }

        // Task_4
//        System.out.println("Введите размеры прямоугольного отверстия:");
//        System.out.print("A = ");
//        double a = scan.nextDouble();
//        System.out.print("B = ");
//        double b = scan.nextDouble();
//        System.out.println("Введите размеры кирпича:");
//        System.out.print("x = ");
//        double x = scan.nextDouble();
//        System.out.print("y = ");
//        double y = scan.nextDouble();
//        System.out.print("z = ");
//        double z = scan.nextDouble();
//        if (((x <= a) && (y <= b)) || ((x <= b) && (y <= a))) {
//            System.out.println("Пройдет");
//        } else if (((x <= a) && (z <= b)) || ((x <= b) && (z <= a))) {
//            System.out.println("Пройдет");
//        } else if (((y <= a) && (z <= b)) || ((y <= b) && (z <= a))) {
//            System.out.println("Пройдет");
//        } else {
//            System.out.println("Не пройдет");
//        }

        // Task_5
//        System.out.print("Введите x: ");
//        double x = scan.nextDouble();
//        if (x > 3) {
//            System.out.println("Значение функции = " + (1 / (x * x * x + 6)));
//        } else {
//            System.out.println("Значение функции = " + (x * x - 3 * x + 9));
//        }


        /**
         Циклы
         **/
        // Task_1
//        System.out.print("Введите любое положительное число: ");
//        int number = scan.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= number; i++) {
//            sum += i;
//        }
//        System.out.println("Сигма = " + sum);

        // Task_2
//        System.out.println("Введите интервал [a,b]:");
//        System.out.print("a = ");
//        double a = scan.nextDouble();
//        System.out.print("b = ");
//        double b = scan.nextDouble();
//        System.out.print("Введите шаг h: ");
//        double h = scan.nextDouble();
//        double x = a;
//        double y = 0;
//        while (x <= b) {
//            if (x > 2) {
//                y = x;
//            } else {
//                y = -x;
//            }
//            System.out.println("y = " + y + " при x = " + x);
//            x += h;
//        }

        // Task_3
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum += i * i;
//        }
//        System.out.println("Сигма = " + sum);

        // Task_4
//        BigInteger mul = new BigInteger("1");
//        for (int i = 1; i <= 200; i++) {
//            mul = mul.multiply(BigInteger.valueOf(i * i));
//        }
//        System.out.println("Mul = " + mul);

        // Task_5
//        System.out.print("Введите число e: ");
//        double e = scan.nextDouble();
//        double row = (1 / 2d) + (1 / 3d);
//        double sum = 0;
//        int i = 1;
//        System.out.println("Сумму членов ряда, модуль которых >= " + e + ":");
//        while (row >= e) {
//            row = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
//            i++;
//            sum += row;
//        }
//        System.out.println(sum);
//    }

        // Task_6
//        for (int i = 65; i <= 90; i++) {
//            System.out.print("[" + i + "] = " + (char) i + "\t");
//        }

        // Task_7
//        System.out.println("Введите промежуток [m,n]: ");
//        System.out.print("m = ");
//        int m = scan.nextInt();
//        System.out.print("n = ");
//        int n = scan.nextInt();
//        int counter = 0; // счетчик количества делителей
//        for (int i = m; i <= n; i++) {
//            System.out.println("Число [" + i + "]");
//            System.out.print("Делители: ");
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    System.out.print(j + "\t");
//                    counter++;
//                }
//            }
//            if (counter == 0) {
//                System.out.print("нет делителей");
//            }
//            counter = 0;
//            System.out.println("\n");
//        }

        // Task_8
        System.out.println("Введите 2 числа: ");
        System.out.print("Первое число = ");
        int firstNumber = scan.nextInt();
        System.out.print("Второе число = ");
        int secondNumber = scan.nextInt();
        char[] myArray = new char[String.valueOf(firstNumber).length()]; // массив, размером с первое число, для нахождения дубилкатов чисел
        int arrayCounter = 0;
        int counter = 0; // счетчик, что определить, есть ли общие числа
        int finderDuplicate = 0; // счетчик повторных цифр в числе
        System.out.println("Общие числа: ");
        for (int i = 0; i < String.valueOf(firstNumber).length(); i++) {
            if (String.valueOf(secondNumber).contains(Character.toString(String.valueOf(firstNumber).charAt(i)))) { // проверка содержится ли текущая цифра первого числа во втором
                myArray[arrayCounter] = (String.valueOf(firstNumber).charAt(i)); // запись текущей цифры в соответствующую ячейку массива
                counter++; // счетчик, что определить, есть ли общие числа
                if (i == 0) { // если первая цифра содержится во втором слове
                    System.out.print(myArray[arrayCounter] + "\t");
                } else {
                    for (int j = 0; j < arrayCounter; j++) { // проверка была ли текущая цифра ранее
                        if (j != arrayCounter && myArray[j] == myArray[arrayCounter]) {
                            finderDuplicate++;
                        }
                    }
                    if (finderDuplicate == 0) {
                        System.out.print(myArray[arrayCounter] + "\t");
                    }
                }
            }
            finderDuplicate = 0;
            arrayCounter++;
        }
        if (counter == 0) {
            System.out.println("нет общих чисел");
        }


    }

    /**
     * Линейные программы - Task_5
     **/
    static String timeConverter(int time) {
        if (time / 10 < 1) {
            return "0" + time;
        } else {
            return "" + time;
        }
    }

    /**
     * Ветвления - Task_2
     **/
    static double min(double x, double y) {
        if (x > y) {
            return y;
        } else {
            return x;
        }
    }

    /**
     * Циклы - Task_4
     **/
    static void valueOf(long sum) {
        sum = 1;
        for (int i = 1; i <= 200; i++) {
            sum = sum * i * i;
        }
        System.out.println();
    }
}


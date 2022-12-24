import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class lab1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int N = n.nextInt();
        switch (N) {
            case (1):
                int b = n.nextInt() % 10;
                System.out.println(b);
                break;
            case (2):
                int d = n.nextInt();
                int sum = 0;
                if (d > 99 && d < 1000) {
                    for (int i = 0; i < 3; i++) {
                        sum += d % 10;
                        d /= 10;
                    }
                }
                else {
                    System.out.println("Ошибка: Введите трехчначное число");
                    break;
                }
                System.out.println(sum);
                break;
            case (3):
                int e = n.nextInt();
                if (e >= 0) {
                    System.out.println(e + 1);
                    break;
                }
                else {
                    System.out.println(e);
                    break;
                }
            case (4):
                int w = n.nextInt();
                if (w > 0) {
                    System.out.println(w + 1);
                    break;
                }
                else if (w < 0){
                    System.out.println(w - 2);
                    break;
                }
                else {
                    System.out.println(10);
                    break;
                }
            case 5:
                int a1 = n.nextInt();
                int a2 = n.nextInt();
                int a3 = n.nextInt();
                int min = Math.min(a1, a2);
                System.out.println(Math.min(min, a3));
                break;
            case 6:
                int s = n.nextInt();
                if (s == 0) {
                    System.out.println("Нулевое число");
                    break;
                }
                if (s > 0) {
                    System.out.print("Положительное ");
                }
                else {
                    System.out.print("Отрицательное ");
                }
                if (s % 2 == 0) {
                    System.out.print("четное число");
                    break;
                }
                else {
                    System.out.print("нечетное число");
                    break;
                }
            case (7):
                int m = n.nextInt();
                float M = 4.15f;
                float R = 1.98f;
                float K = 2.69f;
                float Ki = 5.00f;
                switch (m) {
                    case (905):
                        System.out.print("Москва. Стоимость разговора: " + M * 10);
                        break;
                    case (194):
                        System.out.print("Ростов. Стоимость разговора: " + R * 10);
                        break;
                    case (491):
                        System.out.print("Краснодар. Стоимость разговора: " + K * 10);
                        break;
                    case (800):
                        System.out.print("Киров. Стоимость разговора: " + Ki * 10);
                        break;
                }
            case (8):
                int[] Array = new int[] {1, -10, 5 , 6, 45, 23, 45, -34, 0, 32, 56, -1, 2, -2};
                int maxNum = Array[0];
                int SumPlus = 0;
                int l = 0;
                int Sum = 0;
                int SumChet = 0;
                int F = 0;
                for (int i = 0; i < Array.length; i++){
                    if (maxNum < Array[i]){
                        maxNum = Array[i];
                    }
                    if (Array[i] > 0) {
                        SumPlus += Array[i];
                        l ++;
                    }
                    else if (Array[i] < 0) {
                        Sum += Array[i];
                        F ++;
                        if (Array[i] % 2 == 0) {
                            SumChet += Array[i];
                        }
                    }

                }
                float Suma = Sum;
                float Fa = F;
                System.out.println("Максимальное значение: " + maxNum);
                System.out.println("Сумма положительных элементов: " + SumPlus);
                System.out.println("Сумма четных отрицательных элементов: " + SumChet);
                System.out.println("Количество положительных элементов: " + l);
                System.out.println("Среднее арифметическое отрицательных элементов: " + Suma / Fa);
                break;
            case (9):
                int[] Array1 = new int[] {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, 52};
                for (int i = 0; i < Array1.length / 2; i++) {
                    int Z = Array1[i];
                    Array1[i] = Array1[Array1.length - i -1];
                    Array1[Array1.length - i - 1] = Z;
                }
                System.out.println(Arrays.toString(Array1));
                break;
            case (10):
                int[] Array2 = new int[] {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, 52};
                for (int i = 0; i < Array2.length - 1; i++) {
                    if (Array2[i] == 0) {
                        for (int j = i; j < Array2.length - 1; j++) {
                            Array2[j] = Array2[j + 1];
                        }
                        Array2[Array2.length - 1] = 0;
                    }
                }
                System.out.print(Arrays.toString(Array2));
            break;
            }
        }
    }

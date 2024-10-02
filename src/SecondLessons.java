import java.util.Arrays;

public class SecondLessons {

    public static void main(String[] args) {
        checkSum();
        checkValue();
        checkNumber();
        printSomeNumberOfLines("Have a good day!", 4);
        whatYear();
        createMassive(4, 3);

        //6. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        //С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] oneZyro = {1, 0, 1, 1};
        for (int i = 0; i < oneZyro.length; i++) {
            if (oneZyro[i] == 0) {
                oneZyro[i] = 1;
            } else if (oneZyro[i] == 1) {
                oneZyro[i] = 0;
            }
        }
        System.out.println("Задача 6. Результат:" + Arrays.toString(oneZyro));

        //7. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
        int[] num = new int[100];
        for (int i = 0; i < 100; i++) {
            num[i] = i + 1;
        }
        System.out.println("Задача 7. Результат:" + Arrays.toString(num));

        //8. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2.
        int[] xyz = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < xyz.length; i++) {
            if (xyz[i] < 6) {
                xyz[i] = xyz[i] * 2;
            } else {
            }
        }
        System.out.println("Задача 8. Результат:" + Arrays.toString(xyz));

        //9.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        //и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        //Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
        int[][] table = new int[5][5];
        for (int gorizontal = 0; gorizontal < 5; gorizontal++) {
            for (int vertical = 0; vertical < 5; vertical++) {
                int sumIndex = gorizontal + vertical;
                boolean equals = gorizontal == vertical;
                boolean sumIndexFour = sumIndex == 4;
                if (sumIndexFour) {
                    table[gorizontal][vertical] = 1;
                } else if (equals) {
                    table[gorizontal][vertical] = 1;
                } else {
                }
            }
        }
        System.out.println("Задача 7. Результат:" + Arrays.deepToString(table));

    }

    //1. Написать метод, принимающий на вход два целых числа и проверяющий,
    //что их сумма лежит в пределах от 10 до 20 (включительно),
    //если да – вернуть true, в противном случае – false.
    static void checkSum() {
        int a = 1;
        int b = 35;
        int sum = (a + b);
        if (sum >= 10 && sum <= 20) {
            System.out.println("Задача 1. Результат:" + "true");
        } else {
            System.out.println("Задача 1. Результат:" + "false");
        }
    }

    //2. Написать метод, которому в качестве параметра передается целое число,
    //метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    //Замечание: ноль считаем положительным числом.
    static void checkValue() {
        int number = -10;
        if (number >= 0) {
            System.out.println("Задача 2. Результат:" + "Положительное");
        } else {
            System.out.println("Задача 2. Результат:" + "Отрицательное");
        }
    }

    //3. Написать метод, которому в качестве параметра передается целое число.
    //Метод должен вернуть true, если число отрицательное,
    //и вернуть false если положительное.
    static void checkNumber() {
        int number = 1;
        if (number < 0) {
            System.out.println("Задача 3. Результат:" + "true");
        } else {
            System.out.println("Задача 3. Результат:" + "false");
        }
    }

    //4. Написать метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз;
    static void printSomeNumberOfLines(String text, int n) {
        System.out.println("Задача 4. Результат:");
        for (int a = 0; a < n; a++) {
            System.out.println(text);
        }
    }

    //5. Написать метод, который определяет, является ли год високосным,
    //и возвращает boolean (високосный - true, не високосный - false).
    //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    static void whatYear() {
        int year = 2025;
        boolean condition1 = year % 4 == 0;
        boolean condition2 = year % 100 != 0;
        boolean condition3 = year % 400 == 0;
        if (condition1 && condition2) {
            System.out.println("Задача 5. Результат:" + true);
        } else if (condition3) {
            System.out.println("Задача 5. Результат:" + true);
        } else {
            System.out.println("Задача 5. Результат:" + false);
        }
    }

    //10. Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
    static void createMassive(int len, int initialValue) {
        int[] massive = new int[len];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = initialValue;
        }
        System.out.println("Задача 10. Результат:" + Arrays.toString(massive));
    }
}
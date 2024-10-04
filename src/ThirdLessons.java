import java.util.Arrays;

public class ThirdLessons {

    public static void main(String[] args) {
        checkSum(1, 35);
        checkValue(-10);
        System.out.println(checkNumber(1));
        printSomeNumberOfLines("Have a good day!", 4);
        whatYear(2025);

        //6. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        //С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] oneZyro = {1, 0, 1, 1};
        for (int i = 0; i < oneZyro.length; i++) {
            oneZyro[i] = oneZyro[i] == 0 ? 1 : 0;
        }
        System.out.println(Arrays.toString(oneZyro));

        //7. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
        int[] num = new int[100];
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }
        System.out.println(Arrays.toString(num));

        //8. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2.
        int[] xyz = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < xyz.length; i++) {
            if (xyz[i] < 6) {
                xyz[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(xyz));

        //9.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        //и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        int[][] table = new int[5][5];
        for (int i = 0; i < table.length; i++) {
            table[i][i] = 1;
            table[i][table.length - 1 - i] = 1;
        }
        System.out.println(Arrays.deepToString(table));

        //10. Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
        createMassive(4, 3);
    }

    //1. Написать метод, принимающий на вход два целых числа и проверяющий,
    //что их сумма лежит в пределах от 10 до 20 (включительно),
    //если да – вернуть true, в противном случае – false.
    static void checkSum(int a, int b) {
        int sum = (a + b);
        if (sum >= 10 && sum <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    //2. Написать метод, которому в качестве параметра передается целое число,
    //метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    //Замечание: ноль считаем положительным числом.
    static void checkValue(int c) {
        if (c >= 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }

    //3. Написать метод, которому в качестве параметра передается целое число.
    //Метод должен вернуть true, если число отрицательное,
    //и вернуть false если положительное.
    static boolean checkNumber(int d) {
        return d < 0;
    }

    //4. Написать метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз;
    static void printSomeNumberOfLines(String text, int e) {
        for (int a = 0; a < e; a++) {
            System.out.println(text);
        }
    }

    //5. Написать метод, который определяет, является ли год високосным,
    //и возвращает boolean (високосный - true, не високосный - false).
    //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    static void whatYear(int y) {
        boolean condition1 = y % 4 == 0;
        boolean condition2 = y % 100 != 0;
        boolean condition3 = y % 400 == 0;
        if (condition1 && condition2) {
            System.out.println(true);
        } else if (condition3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    //10. Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
    static void createMassive(int len, int initialValue) {
        int[] massive = new int[len];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = initialValue;
        }
        System.out.println(Arrays.toString(massive));
    }
}
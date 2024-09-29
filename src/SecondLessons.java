public class SecondLessons {
    //1. Написать метод, принимающий на вход два целых числа и проверяющий,
    //что их сумма лежит в пределах от 10 до 20 (включительно),
    //если да – вернуть true, в противном случае – false.
    public static void main(String[] args) {
        checkSum();
        checkValue();
        checkNumber();
        printNumberOfString(char hello, int h);
    }

    static void checkSum() {
        int a = 1;
        int b = 35;
        int sum = (a + b);
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    //2. Написать метод, которому в качестве параметра передается целое число,
    //метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    //Замечание: ноль считаем положительным числом.
    static void checkValue() {
        int number = -10;
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    //3. Написать метод, которому в качестве параметра передается целое число.
    //Метод должен вернуть true, если число отрицательное,
    //и вернуть false если положительное.
    static void checkNumber() {
        int number = 1;
        if (number < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    //4. Написать метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз;
    static void printNumberOfString(char hello, int h) {
        hello = "Hello reviewer";
        h = 1;
    }

}
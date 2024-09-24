public class Main {
    //1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
    }
    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
    //2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
    //и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные,
    //и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    static void checkSumSign() {
        int a;
        a = 2;
        int b;
        b = 3;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    //3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
    // Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
    // если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
    // если больше 100 (100 исключительно) - “Зеленый”;
    static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
}
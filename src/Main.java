public class Main {
    //1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
    }
    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
    //2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
    //и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные,
    //и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    static void checkSumSign() {
        int a;
        a = -23;
        int b;
        b = 10;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
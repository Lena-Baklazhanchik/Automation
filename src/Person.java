
/*
Создать массив из 5 сотрудников.
Пример:
вначале объявляем массив объектов
Person[] persArray = new Person[5];
потом для каждой ячейки массива задаем объект
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
*/

import java.util.Arrays;

public class Person {
    public String name;
    public String position;
    public String email;
    public String tel;
    public double salary;
    public int age;

    public Person(String name, String position, String email, String tel, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }


    public void printPersonInfo() {
        System.out.println("ФИО: " + name + "\n Должность: " + position + "\n Почта: " + email + "\n Телефон: " + tel + "\n Зарплата: " + salary + "\n Возраст: " + age);
    }


    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312000", 30000, 35);
        persArray[1] = new Person("Ivanova Mary", "AQA", "mary@mail.ru", "892312111", 80000, 43);
        persArray[2] = new Person("Filimonov Daniil", "Developer", "ilovejava@rumbler.net", "892312222", 120000, 32);
        persArray[3] = new Person("Kukaracha Inna", "Sales Manager", "cacheandcookies@gmail.com", "892312333", 35000, 61);
        persArray[4] = new Person("Solyanko Lyutozhor", "Boss", "yalyublyuborshch@mailbox.com", "892312444", 130000, 19);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) {
                persArray[i].printPersonInfo();
            }
        }

    }
}
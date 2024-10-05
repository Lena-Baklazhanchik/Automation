/* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
*/
public class Employee {
    String name;
    String position;
    String email;
    String tel;
    int age;

    public void displayInfo() {
        System.out.println("ФИО сотрудника: " + name + "\nДолжность: " + position + "\nПочта: " + email + "\nТелефон: " + tel + "\nВозраст: " + age);
    }

    public Employee(String name, String position, String email, String tel, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    public static void main(String[] args) {
        // Еще кусочек кода для проверки
        /*
        Employee ivan = new Employee("Иванов Иван Иванович", "инженер", "ivanov@mail.ru", "+375251122333", 34);
        ivan.displayInfo();
         */
    }
}


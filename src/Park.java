/*
Создать класс Park с внутренним классом, с помощью объектов которого
можно хранить информацию об
аттракционах,
времени их работы и
стоимости.
 */
public class Park {
    public String name;
    public String service;

    public Park(String name, String service) {
        this.name = name;
        this.service = service;
    }

    public static class Attraction {
        public String nameAttraction;
        public String timeWorking;
        public double cost;

        public Attraction(String nameAttraction, String timeWorking, double cost) {
            this.nameAttraction = nameAttraction;
            this.timeWorking = timeWorking;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        //Еще кусочек кода для проверки
        /*
        Park.Attraction mix = new Attraction("Микс", "с 9.00 до 23.00", 535.32);
        System.out.println("Добавлен новый атракцион!");
         */
    }
}

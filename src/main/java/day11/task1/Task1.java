package day11.task1;

public class Task1 {
    public static void main(String[] args) {
    Warehouse warehouse = new Warehouse();
    Picker picker = new Picker(warehouse);
    Courier courier = new Courier(warehouse);

    businessProcess(picker);

    System.out.println(picker);
    System.out.println(warehouse);

    businessProcess(courier);

    System.out.println(courier);
    System.out.println(warehouse);

        System.out.println();
    Warehouse warehouse1 = new Warehouse();
    Picker picker1 = new Picker(warehouse1);
    Courier courier1 = new Courier(warehouse1);

        picker.doWork();
        courier.doWork();

        System.out.println(courier1);
        System.out.println(picker1);

    }
    public static void businessProcess(Worker worker) {
        for (int i = 1; i <= 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}

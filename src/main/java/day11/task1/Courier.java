package day11.task1;

public class Courier implements Worker{
    private int salary;
    private static final int SALARY_PAY = 100;
    private Warehouse warehouse;
    private boolean isPayed;

    public String toString() {
        return salary + "," + isPayed;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
        this.salary = salary;
        this.isPayed = isPayed;
    }


    @Override
    public void doWork() {
        salary += SALARY_PAY;
        warehouse.upDelivered();
        return;
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }

        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 50000;
        isPayed = true;
    }
}

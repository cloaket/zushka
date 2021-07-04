package day11.task1;

public class Picker implements Worker {
    private int salary;
    private static final int SALARY_PAY = 80;
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

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;

    }

    @Override
    public void doWork() {
        salary += SALARY_PAY;
        warehouse.upPicked();
    }

    @Override
    public void bonus() {
       if (warehouse.getCountPickedOrders() < 10000) {
           System.out.println("Бонус пока не доступен");
           return;
       }

       if (isPayed) {
           System.out.println("Бонус уже был выплачен");
           return;
       }

       salary += 70000;
       isPayed = true;
    }
}

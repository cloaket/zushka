package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public String toString() {
        return countPickedOrders + "," + countDeliveredOrders;
    }

    public void upPicked() {
        countPickedOrders++;
    }

    public void upDelivered() {
        countDeliveredOrders++;
    }

}

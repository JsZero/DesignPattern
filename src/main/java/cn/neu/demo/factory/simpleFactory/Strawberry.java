package cn.neu.demo.factory.simpleFactory;

public class Strawberry implements Fruit {
    public static void log(String msg) {
        System.out.println(msg);
    }

    public void grow() {
        log("Strawberry is growing...");
    }

    public void harvest() {
        log("Strawberry has been harvested.");
    }

    public void plant() {
        log("Strawberry has been planted.");
    }
}

package cn.neu.demo.factory.simpleFactory;

public class Grape implements Fruit {
    private boolean seedless;

    public static void log(String msg) {
        System.out.println(msg);
    }

    public void grow() {
        log("Grape is growing...");
    }

    public void harvest() {
        log("Grape has been harvested.");
    }

    public void plant() {
        log("Grape has been planted.");
    }

    public boolean isSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }
}

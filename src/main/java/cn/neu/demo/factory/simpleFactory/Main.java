package cn.neu.demo.factory.simpleFactory;

public class Main {
    public static void main(String[] args) {
        try{
            FruitGardener.factory("grape");
            FruitGardener.factory("apple");
            FruitGardener.factory("strawberry");
        }catch (BadFruitException e){
            e.printStackTrace();
        }
    }
}

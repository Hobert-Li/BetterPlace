package Creational.Factory;

/**
 *
 * @author Hobert-Li
 * @description
 * @create 2020/2/5 12:06
 */

public class App {

    public static void main(String[] args) {

        //先选取合适的工厂。
        FoodFactory factory = new ChineseFoodFactory();

        //虽然都是调用makeFood("A"),但是不同工厂生产出来的完全不一样。
        Food food = factory.makeFood("A");
    }
}

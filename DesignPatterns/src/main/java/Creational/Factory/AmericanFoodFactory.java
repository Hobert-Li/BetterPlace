package Creational.Factory;

/**
 *
 * @author Hobert-Li
 * @description
 * @create 2020/2/5 12:04
 */

public class AmericanFoodFactory implements FoodFactory {

    public Food makeFood(String name) {
        if (name.equals("A")) {
            return new AmericanFoodA();
        } else if (name.equals("B")) {
            return new AmericanFoodB();
        } else {
            return null;
        }
    }
}

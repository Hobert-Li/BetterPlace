package Creational.Factory;

/**
 * <p>题目名字：</p>
 * <p>题目描述：</p>
 * <p>题目示例：</p>
 *
 * @author Hobert-Li
 * @description
 * @create 2020/2/5 12:00
 */

public class ChineseFoodFactory implements FoodFactory{

    public Food makeFood(String name) {
        if (name.equals("A")) {
            return new ChineseFoodA();
        } else if (name.equals("B")) {
            return new ChineseFoodB();
        } else {
            return null;
        }
    }
}

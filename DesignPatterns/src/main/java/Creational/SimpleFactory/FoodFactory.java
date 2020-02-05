package Creational.SimpleFactory;

/**
 * @description 简单工厂模式
 *
 * @author Hobert-Li
 * @create 2020/2/5 11:46
 */

//单一职责：一个类只提供一种功能，FoodFactory的功能就是负责生产各种Food。
public class FoodFactory {

    public static Food makeFood(String name) {
        if (name.equals("noodle")) {
            Food noodle = new LanZhouNoodele();
            noodle.addSpicy("more");
            return noodle;
        } else if (name.equals("chicken")) {
            Food chicken = new HuangMenChicken();
            chicken.addCondiment("potato");
            return chicken;
        } else {
            return null;
        }
    }
}

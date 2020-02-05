package Creational.Builder;

/**
 *
 * @author Hobert-Li
 * @description
 * @create 2020/2/5 20:11
 */

public class App {
    public static void main(String[] args) {
        User user = User.builder().name("foo").password("ABC").age(18).build();
    }
}

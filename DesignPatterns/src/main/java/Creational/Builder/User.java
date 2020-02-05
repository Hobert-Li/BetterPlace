package Creational.Builder;

/**
 *
 * @author Hobert-Li
 * @description
 * @create 2020/2/5 15:36
 */

public class User {

    private String name;
    private String password;
    private String nickname;
    private int age;

    //构造函数私有
    private User(String name, String password, String nickname, int age) {
        this.name = name;
        this.password = password;
        this.nickname = nickname;
        this.age = age;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }


    //核心是：先把所有的属性都设置给 Builder，然后 build() 方法的时候，将这些属性复制给实际产生的对象。
    public static class UserBuilder {

        private String name;
        private String password;
        private String nickname;
        private int age;

        private UserBuilder() {
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder nickName(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {

            //校验
            if (name == null || password == null) {
                throw new RuntimeException("用户名密码必填");
            }

            if (age <= 0 || age >= 150) {
                throw new RuntimeException("年龄不合法");
            }

            //赋默认值
            if (nickname == null) {
                nickname = name;
            }

            return new User(name, password, nickname, age);
        }

    }
}

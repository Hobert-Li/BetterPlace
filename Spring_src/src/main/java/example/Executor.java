package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Description:  运行一个Spring,其中有一个简单的id为MessageService的Bean</p>
 *
 * @author 李宏博
 * @version 1.0
 * @create 2020/1/14 14:18
 */


public class Executor {

    public static void main(String[] args) {

        //use application-example.xml launch a ApplicationContext.
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-example.xml");

        System.out.println("启动成功");

        //use Class to get bean from context(container), rather than new().
        MessageService messageService = context.getBean(MessageService.class);

        //use Bean name(id) to get bean
        //MessageService messageService = (MessageService) context.getBean("messageService");

        //print: hello world
        System.out.println(messageService.getMessage());

    }
}

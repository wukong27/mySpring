package org.springframework.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zy.Lee
 * 2019/2/1 17:37
 */

public class MainTest {
    public static void main(String[] args) {
        System.setProperty("test","spring_test");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"${test}.xml"});
        MessageService messageService = context.getBean(MessageService.class);
//        context.start();
        System.out.println(messageService.get());
//        CustomApplicationContext context = new CustomApplicationContext(new String[]{"spring_test.xml"});
//        MessageService messageService = context.getBean(MessageService.class);
////        context.start();
//        System.out.println(messageService.get());


    }
}

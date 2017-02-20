package org.sjtu.spitter.demo.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by luchukun on 17-2-20.
 */
public class IdolMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("idols.xml");
        Performer performer = (Performer) context.getBean("duke");
        performer.perform();
        performer = (Performer) context.getBean("poeticDuke");
        performer.perform();
        performer = (Performer) context.getBean("kenny");
        performer.perform();
        performer = (Performer) context.getBean("chuck");
        performer.perform();
    }
}

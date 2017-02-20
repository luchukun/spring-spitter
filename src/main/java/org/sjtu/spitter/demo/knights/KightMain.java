package org.sjtu.spitter.demo.knights;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by luchukun on 17-2-20.
 */

public class KightMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("knights.xml");
        Knight knight = (Knight)context.getBean("knight");
        knight.embarkOnQuest();

    }
}

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
        Stage theStage = (Stage) context.getBean("theStage");
        theStage.beginPerform();
    }
}

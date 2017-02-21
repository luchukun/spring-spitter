package org.sjtu.spitter.demo.minxmlconfigurationidol;

import org.sjtu.spitter.demo.springidol.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by luchukun on 17-2-21.
 */
public class minXmlConfigurationIdolMain {
        public static void main(String[] args) {
            ApplicationContext context =
                    new ClassPathXmlApplicationContext("minconfigurationidol.xml");
            Stage theStage = (Stage) context.getBean("theStage");
            theStage.beginPerform();
        }
}

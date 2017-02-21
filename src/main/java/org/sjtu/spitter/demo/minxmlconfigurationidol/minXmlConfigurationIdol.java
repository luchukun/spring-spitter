package org.sjtu.spitter.demo.minxmlconfigurationidol;

import org.sjtu.spitter.demo.springidol.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by luchukun on 17-2-21.
 */

@Configuration
public class minXmlConfigurationIdol {
    @Bean
    public Performer duke() {
        return new Juggler();
    }

    @Bean
    public PoemImp poemImp() {
        return new PoemImp();
    }

    @Bean
    public Performer poeticDuke() {
        return new PoeticJuggler(poemImp(), (int)Math.random()*10);
    }

    @Bean
    public Instrument saxophone() {
        return new Saxophone();
    }
    @Bean
    public Instrumentalist kenny() {
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("One tiger, two tigers...");
        kenny.setInstrument(saxophone());
        return kenny;
    }

    @Bean
    public Stage theStage() {
        Stage theStage  = Stage.getInstance();
        theStage.setPerformers(duke(), poeticDuke(), kenny());
        return theStage;
    }
}

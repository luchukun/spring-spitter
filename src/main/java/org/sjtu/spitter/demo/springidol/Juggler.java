package org.sjtu.spitter.demo.springidol;

/**
 * Created by luchukun on 17-2-20.
 */
public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler() {

    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() {
        System.out.println("Juggler " + beanBags + " Bean Bags");
    }
}

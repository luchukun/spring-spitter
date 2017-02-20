package org.sjtu.spitter.demo.springidol;

/**
 * Created by luchukun on 17-2-20.
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;
    public PoeticJuggler(Poem poem) {
        this.poem = poem;
    }

    public PoeticJuggler(Poem poem, int beanBags) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() {
        super.perform();
        System.out.println("while juggling...");
        poem.recite();
    }
}

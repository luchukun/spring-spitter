package org.sjtu.spitter.demo.springidol;

/**
 * Created by luchukun on 17-2-20.
 */
public class PoemImp implements Poem {
    private static String Line = "This is a brave knight";

    public PoemImp() {

    }
    @Override
    public void recite() {
       System.out.print(Line + "\n");
    }
}

package org.sjtu.spitter.demo.springidol;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by luchukun on 17-2-20.
 */
public class Stage {
    private List<Performer> performers;
    private Stage(){
    }

    private static class StageSingletonLazyHolder {
        public static Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageSingletonLazyHolder.instance;
    }

    public void setPerformers(Performer ... performers) {
        setPerformers(Arrays.asList(performers));
    }

    public void setPerformers(List<Performer> performers) {
        this.performers = performers;
    }
    public List<Performer> getPerformers() {
        return performers;
    }

}

package org.sjtu.spitter.demo.knights;

import org.sjtu.spitter.demo.knights.Quest;

/**
 * Created by luchukun on 17-2-20.
 */
public class SlayDragonQuest implements Quest {
    @Override
    public void embark() {
        System.out.println("Slay dragon, Slay dragon");
    }
}

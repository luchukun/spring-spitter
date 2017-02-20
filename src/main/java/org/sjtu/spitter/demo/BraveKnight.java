package org.sjtu.spitter.demo;

import org.sjtu.spitter.demo.Knight;

/**
 * Created by luchukun on 17-2-20.
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }

}

/**
 * Created by luchukun on 17-2-20.
 */
package org.sjtu.spitter.test;

import org.junit.Test;
import org.sjtu.spitter.demo.knights.BraveKnight;
import org.sjtu.spitter.demo.knights.Quest;

import static org.mockito.Mockito.*;


public class TestBraveKnight {
    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }

}

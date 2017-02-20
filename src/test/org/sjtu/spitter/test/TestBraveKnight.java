/**
 * Created by luchukun on 17-2-20.
 */
package org.sjtu.spitter.test;

import org.junit.Test;
import static org.mockito.Mockito.*;

import org.sjtu.spitter.demo.BraveKnight;
import org.sjtu.spitter.demo.Quest;

public class TestBraveKnight {
    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }

}

package org.sjtu.spitter.demo.springidol;


/**
 * Created by luchukun on 17-2-20.
 */
public class Instrumentalist implements Performer {
    private Instrument instrument;

    private String song;

    public Instrumentalist() {

    }

    @Override
    public void perform() {
        System.out.println(song);
        instrument.play();
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
    public Instrument getInstrument() {
        return instrument;
    }

    public void setSong(String song) {
        this.song = song;
    }
    public String getSong() {
        return song;
    }
}

package Chapter_9;

public class Tv {
    int channel = 1;
    int volumLevel = 1;
    boolean on = false;

    public Tv() {
    }

    public void turnON() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newchannel) {
        if (on && newchannel >= 1 && newchannel <= 120) ;
        channel = newchannel;
    }

    public int setVolum(int newvolum) {
        if (on && newvolum >= 1 && newvolum <= 7)
            volumLevel = newvolum;
    }

    public void channelUp() {
        if (on && channel <= 120)
            channel++;
    }

    public void channelDown() {
        if (on && channel > 1)
            channel __;
    }

    public void volumUP() {
        if (on && volumLevel < 7)
            volumLevel++;
    }

    public void volumDown() {
        if (on && volumLevel > 1)
            volumLevel __;
    }
}

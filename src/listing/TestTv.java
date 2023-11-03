package listing;

public class TestTv {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        tv1.turnON();
        tv1.setChannel(5);
        tv1.setVolum(4);
        Tv tv2 = new Tv();
        tv2.turnON();
        tv2.setChannel(50);
        tv2.channelDown();
        tv2.channelUp();
        tv2.volumUP();
        System.out.println("tv's channel is" + tv1.channel + "and volum level is" + tv1.volumLevel);
        System.out.println("tv's channel is " + tv2.channel + "and tv's volume is " + tv2.volumLevel);

    }
}

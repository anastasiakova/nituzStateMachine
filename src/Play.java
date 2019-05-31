import java.util.Random;

public class Play implements State {
    On on;
    boolean isCurrent;

    public Play(On on) {
        this.on = on;
    }

    @java.lang.Override
    public void turnOn() {

    }

    @java.lang.Override
    public void turnOff() {
        isCurrent = false;
    }

    @java.lang.Override
    public void internetOn() {

    }

    @java.lang.Override
    public void internetOff() {
        System.out.println("exit "+ this.getClass().getName() + " state");
        on.setPalyerCurrent(on.getPause());
        isCurrent = false;
    }

    @java.lang.Override
    public void fileRequest() {

    }

    @java.lang.Override
    public void downloadAborted() {
        System.out.println("exit "+ this.getClass().getName() + " state");
        on.setPalyerCurrent(on.getIdlePlayer());
        isCurrent = false;
    }

    @java.lang.Override
    public void downloadError() {
        //kill entry thrade
        System.out.println("exit "+ this.getClass().getName() + " state");
        on.setPalyerCurrent(on.getPause());
        isCurrent = false;
    }

    @java.lang.Override
    public void errorFixed() {

    }

    @java.lang.Override
    public void movieOn() {

    }

    @java.lang.Override
    public void restartMovie() {
        on.movieTime = 0;
    }

    @java.lang.Override
    public void holdMovie() {
        //kill entry thrade
        System.out.println("exit "+ this.getClass().getName() + " state");
        on.setPalyerCurrent(on.getPause());
        isCurrent = false;
    }

    @java.lang.Override
    public void movieOff() {
        //kill entry thrade
        System.out.println("exit "+ this.getClass().getName() + " state");
        on.setPalyerCurrent(on.getIdlePlayer());
        isCurrent = false;
    }

    @java.lang.Override
    public void resume() {

    }

    @java.lang.Override
    public void downloadFinished() {
        System.out.println("exit "+ this.getClass().getName() + " state");
        on.setPalyerCurrent(on.getIdlePlayer());
        isCurrent = false;
    }

    @Override
    public void entry() {
        System.out.println("enter "+ this.getClass().getName() + " state");
        for (int i = 0; i < 5000; i++) {
            On.movieTime++;
        }
        movieOff();
    }
}

public class Pause implements State {
    On on;

    public Pause(On on) {
        this.on = on;
    }

    @java.lang.Override
    public void turnOn() {

    }

    @java.lang.Override
    public void turnOff() {

    }

    @java.lang.Override
    public void internetOn() {
        State play = on.getPlay();
        System.out.println("exit "+ this.getClass().getName() + " state");
        on.setPalyerCurrent(play);
    }

    @java.lang.Override
    public void internetOff() {

    }

    @java.lang.Override
    public void fileRequest() {

    }

    @java.lang.Override
    public void downloadAborted() {
        System.out.println("exit "+ this.getClass().getName() + " state");
        on.setPalyerCurrent(on.getIdlePlayer());
    }

    @java.lang.Override
    public void downloadError() {

    }

    @java.lang.Override
    public void errorFixed() {
        State play = on.getPlay();
        System.out.println("exit "+ this.getClass().getName() + " state");
        on.setPalyerCurrent(play);
    }

    @java.lang.Override
    public void movieOn() {

    }

    @java.lang.Override
    public void restartMovie() {

    }

    @java.lang.Override
    public void holdMovie() {

    }

    @java.lang.Override
    public void movieOff() {
        System.out.println("exit "+ this.getClass().getName() + " state");
        on.setPalyerCurrent(on.getIdlePlayer());
    }

    @java.lang.Override
    public void resume() {
        State play = on.getPlay();
        System.out.println("exit "+ this.getClass().getName() + " state");
        on.setPalyerCurrent(play);
    }

    @java.lang.Override
    public void downloadFinished() {
        System.out.println("exit "+ this.getClass().getName() + " state");
        on.setPalyerCurrent(on.getIdlePlayer());
    }

    @Override
    public void entry() {
        System.out.println("enter "+ this.getClass().getName() + " state");
    }
}

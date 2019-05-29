public class Play implements State {
    On on;
    Thread playMovie;

    public Play(On on) {
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

    }

    @java.lang.Override
    public void internetOff() {
        //kill entry thrade
        on.setPalyerCurrent(on.getPause());
    }

    @java.lang.Override
    public void fileRequest() {

    }

    @java.lang.Override
    public void downloadAborted() {
        //kill entry thrade
        on.setPalyerCurrent(on.getIdlePlayer());
    }

    @java.lang.Override
    public void downloadError() {
        //kill entry thrade
        on.setPalyerCurrent(on.getPause());
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
        on.setPalyerCurrent(on.getPause());
    }

    @java.lang.Override
    public void movieOff() {
        //kill entry thrade
        on.setPalyerCurrent(on.getIdlePlayer());
    }

    @java.lang.Override
    public void resume() {

    }

    @java.lang.Override
    public void downloadFinished() {
        //kill entry thrade
        on.setPalyerCurrent(on.getIdlePlayer());
    }

    @Override
    public void entry() {
        // TO DO
        //{do update movie time
    }
}

public class DownloadProc implements State {
    On on;
    public State current;
    //states
    public State download;
    public State wait;
    public State recover;


    public DownloadProc(On on) {
        this.on = on;
        this.download = new Download(this);
        this.wait = new Wait(this);
        this.recover = new Wait(this);
        this.current = this.download;
    }

    public void setDownloadProcCurrent(State downloadProcCurrent) {
        this.current = downloadProcCurrent;
        this.current.entry();
    }

    public State getDownload() {
        return download;
    }

    public State getWait() {
        return wait;
    }

    public State getRecover() {
        return recover;
    }

    @java.lang.Override
    public void turnOn() {
        this.entry();
    }

    @java.lang.Override
    public void turnOff() {

    }

    @java.lang.Override
    public void internetOn() {

    }

    @java.lang.Override
    public void internetOff() {

    }

    @java.lang.Override
    public void fileRequest() {

    }

    @java.lang.Override
    public void downloadAborted() {
        on.setDownloadCurrent(on.getDownloadIdle());
        Context.updatePoints(-1);
        System.out.println("exit "+ this.getClass().getName() + " state");
    }

    @java.lang.Override
    public void downloadError() {

    }

    @java.lang.Override
    public void errorFixed() {

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

    }

    @java.lang.Override
    public void resume() {

    }

    @java.lang.Override
    public void downloadFinished() {

    }

    @Override
    public void entry() {
        System.out.println("enter "+ this.getClass().getName() + " state");
        this.current.entry();
    }
}

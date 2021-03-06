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
        this.recover = new Recover(this);
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
        System.out.println("exit "+ this.getClass().getName() + " state");
        on.setDownloadCurrent(on.getDownloadIdle());
        Context.updatePoints(-1);
        current.downloadAborted();
        current = download;
        Context.currDownloadStatus = 0;
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
        System.out.println("exit "+ this.getClass().getName() + " state");
        on.setDownloadCurrent(on.getDownloadIdle());
        on.downloadFinished();
        Context.updatePoints(1);
        Context.diskSize -= On.fileSize;
        Context.currDownloadStatus = 0;
    }

    @Override
    public void entry() {
        System.out.println("enter "+ this.getClass().getName() + " state");
        this.current.entry();
    }
}

public class Wait implements State {

    public DownloadProc downloadProc;

    public Wait(DownloadProc downloadProc){
        this.downloadProc = downloadProc;
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
        System.out.println("exit "+ this.getClass().getName() + " state");
        downloadProc.setDownloadProcCurrent(downloadProc.getDownload());
    }

    @java.lang.Override
    public void fileRequest() {

    }

    @java.lang.Override
    public void downloadAborted() {

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
    }
}

import java.util.Random;

public class Recover implements State {

    public DownloadProc downloadProc;
    private boolean isErrorFixed = false;
    public Recover(DownloadProc downloadProc){
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
        isErrorFixed = true;
        System.out.println("exit "+ this.getClass().getName() + " state");
        downloadProc.setDownloadProcCurrent(downloadProc.getDownload());
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
        isErrorFixed = false;
        Thread thread = new Thread(){
            public void run()
            {
                try {
                    Thread.sleep(3000);
                    if(!isErrorFixed && downloadProc.on.context.machineOn == downloadProc.on.context.machineCurrnetMode){
                        downloadProc.setDownloadProcCurrent(downloadProc.getDownload());
                        System.out.println("exit "+ downloadProc.getClass().getName() + " state");
                        downloadProc.on.setDownloadCurrent(downloadProc.on.getDownloadIdle());
                        Context.updatePoints(-1);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();
    }
}

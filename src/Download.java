public class Download implements State {

    public DownloadProc downloadProc;
    private boolean isDownloading = true;

    public Download(DownloadProc downloadProc){
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
        downloadProc.setDownloadProcCurrent(downloadProc.getWait());
    }

    @java.lang.Override
    public void fileRequest() {

    }

    @java.lang.Override
    public void downloadAborted() {
    }

    @java.lang.Override
    public void downloadError() {
        System.out.println("exit "+ this.getClass().getName() + " state");
        downloadProc.setDownloadProcCurrent(downloadProc.getRecover());
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
        downloadProc.downloadFinished();
    }

    @Override
    public void entry() {
        System.out.println("enter "+ this.getClass().getName() + " state");
        isDownloading = true;
        Thread thread = new Thread(){
            public void run()
            {
                while(isDownloading){
                    double downloadSpeed = 1;
                    if(Context.points >= 7){
                        downloadSpeed = 1.5;
                    }else if(Context.points >= 4){
                        downloadSpeed = 1.2;
                    }
                    try {
                        sleep( 2000/(long)downloadSpeed);
                        Context.currDownloadStatus += 10;
                        System.out.println(Context.currDownloadStatus);
                        if(Context.getCurrDownloadStatus()>= 100){
                            isDownloading = false;
                            downloadFinished();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        thread.start();

    }

}

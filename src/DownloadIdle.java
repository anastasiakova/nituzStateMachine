import java.util.Random;

public class DownloadIdle implements State {

    public On onState;
    private Thread thread;
    private boolean isInState;

    public DownloadIdle(On onState){
        this.onState = onState;
    }


    @java.lang.Override
    public void turnOn() {}

    @java.lang.Override
    public void turnOff() {  isInState = false; }

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
        isInState = true;
        thread = new Thread(){
            public void run()
            {
                Random r = new Random();
                onState.fileSize =  r.nextInt((10 - 1) + 1) + 1;
                while(isInState) { //while this is the current state.
                    if (On.queueSize > 0 && onState.context.getInternetOnline() == onState.context.currentInternetConnection) {
                        if (onState.fileSize > onState.context.diskSize) {
                            onState.setDownloadCurrent(onState.getOutOfDisk());
                        } else {
                            onState.setDownloadCurrent(onState.getDownloadProc());
                            On.queueSize--;
                        }
                        break;
                    }
                }
            }
        };

        thread.start();
    }
}

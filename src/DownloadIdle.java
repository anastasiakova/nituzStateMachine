import java.util.Random;

public class DownloadIdle implements State {

    public On onState;
    private Thread thread;

    public DownloadIdle(On onState){
        this.onState = onState;

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
         thread = new Thread(){
            public void run()
            {
                Random r = new Random();
                int fileSize =  r.nextInt((10 - 1) + 1) + 1;
                while(onState.getDownloadCurrent() == onState.getDownloadIdle()) { //while this is the current state. Changing the state in On will terminate this thread.
                    if(On.queueSize > 0 && onState.context.getInternetOnline() == onState.context.currentInternetConnection) {
                        if(fileSize > onState.context.diskSize){
                            onState.setDownloadCurrent(onState.getOutOfDisk());
                        }
                        else {
                            onState.setDownloadCurrent(onState.getDownloadProc());
                        }
                        break;
                    }
                }
            }
        };				//Anonymous class ends here

//Starting anonymous thread
        thread.start();

//Gets the name of main thead
        System.out.println("Name of main thread - "+ Thread.currentThread().getName());
    }
}

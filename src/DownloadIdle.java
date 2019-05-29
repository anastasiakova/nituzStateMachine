import sun.awt.Mutex;
import sun.awt.windows.ThemeReader;

import java.util.Random;

public class DownloadIdle implements State {

    public On onState;
    private boolean isInState;
    private static Thread t = new Thread();

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
        dequeue();
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

        System.out.println("exit "+ this.getClass().getName() + " state");
        Random r = new Random();
        onState.fileSize =  r.nextInt((10 - 1) + 1) + 1;
        dequeue();
        /*if(!isInState){
            isInState = true;
            System.out.println("exit "+ this.getClass().getName() + " state");
            Thread thread = new Thread(){
                public void run()
                {
                    Random r = new Random();
                    onState.fileSize =  r.nextInt((10 - 1) + 1) + 1;
                    while(isInState) { //while this is the current state.
                        System.out.println("nu");
                        if (On.queueSize > 0 && onState.context.getInternetOnline() == onState.context.currentInternetConnection) {
                            if (onState.fileSize > onState.context.diskSize) {
                                onState.setDownloadCurrent(onState.getOutOfDisk());
                            } else {
                                onState.setDownloadCurrent(onState.getDownloadProc());
                                On.queueSize--;
                            }
                            isInState = false;
                            break;
                        } else{
                            isInState = false;
                            break;
                        }
                    }
                }
            };

            thread.start();
        }*/

    }

    public void dequeue() {
        if (On.queueSize > 0 ) {
            if (onState.fileSize > onState.context.diskSize) {
                onState.setDownloadCurrent(onState.getOutOfDisk());
            } else {
                onState.setDownloadCurrent(onState.getDownloadProc());
                On.queueSize--;
            }
        }
    }
}

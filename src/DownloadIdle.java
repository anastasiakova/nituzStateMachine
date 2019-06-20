import sun.awt.Mutex;
import sun.awt.windows.ThemeReader;

import java.util.Random;

public class DownloadIdle implements State {

    public On onState;


    public DownloadIdle(On onState){
        this.onState = onState;
    }


    @java.lang.Override
    public void turnOn() {}

    @java.lang.Override
    public void turnOff() { }

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

        System.out.println("enter "+ this.getClass().getName() + " state");
        Random r = new Random();
        onState.fileSize =  r.nextInt((10 - 1) + 1) + 1;
        dequeue();
    }

    public void dequeue() {
        if (On.queueSize > 0 ) {
            if (onState.fileSize > onState.context.diskSize) {
                System.out.println("exit "+ this.getClass().getName() + " state");
                onState.setDownloadCurrent(onState.getOutOfDisk());
            } else {
                System.out.println("exit "+ this.getClass().getName() + " state");
                On.queueSize--;
                onState.setDownloadCurrent(onState.getDownloadProc());

            }
        }
    }
}

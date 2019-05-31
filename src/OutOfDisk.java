import java.util.Random;

public class OutOfDisk implements State {

    public On onState;

    public OutOfDisk(On onState){
        this.onState = onState;
    }


    @java.lang.Override
    public void turnOn() {
        entry();
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
        System.out.println("enter "+ this.getClass().getName() + " state");

        try {
            Thread.sleep(4000);
            if(onState.fileSize > onState.context.diskSize){
                On.queueSize--;
                Context.updatePoints(-1);
                System.out.println("exit "+ this.getClass().getName() + " state");
                onState.setDownloadCurrent(onState.getDownloadIdle());
            } else{
                if(onState.context.internetOnline == onState.context.currentInternetConnection){
                    System.out.println("exit "+ this.getClass().getName() + " state");
                    onState.setDownloadCurrent(onState.getDownloadProc());
                    On.queueSize--;
                }
                else{
                    System.out.println("exit "+ this.getClass().getName() + " state");
                    onState.setDownloadCurrent(onState.getDownloadIdle());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

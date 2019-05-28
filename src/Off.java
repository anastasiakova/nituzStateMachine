public class Off implements State {
    Context context;

    public Off(Context context) {
        this.context = context;
    }

    @java.lang.Override
    public void turnOn() {
        //State on = new InternetOnilne(this.context);
        //Boolean inOnline = context.currentInternetConnection instanceof Online;
       // if(inOnline) {
         //   on.setAsCurrent();
        //}
        if(context.currentInternetConnection instanceof InternetOnilne)
            context.setMachineCurrnetModeState(context.getMachineOn());
        else
            System.out.println("THERE IS NO CONNECTION!!! ");
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
}

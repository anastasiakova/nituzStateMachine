public class InternetOffline implements State {
    Context context;

    public InternetOffline(Context context) {
        this.context = context;
    }

    @java.lang.Override
    public void turnOn() {
        context.internetOn();
    }

    @java.lang.Override
    public void turnOff() {
        context.internetOn();
    }

    @java.lang.Override
    public void internetOn() {
        context.setInternetState(context.getInternetOnline());
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

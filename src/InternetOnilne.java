public class InternetOnilne implements State {
    Context context;

    public InternetOnilne(Context context){
        this.context = context;
    }

    @java.lang.Override
    public void turnOn() {
    }

    @java.lang.Override
    public void turnOff() {
        context.setInternetState(context.getInternetOffline());
    }

    @java.lang.Override
    public void internetOn() {

    }

    @java.lang.Override
    public void internetOff() {
        context.setInternetState(context.getInternetOffline());
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

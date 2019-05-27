public interface State {
    void turnOn();
    void turnOff();
    void internetOn();
    void internetOff();
    void fileRequest();
    void downloadAborted();
    void downloadError();
    void errorFixed();
    void movieOn();
    void restartMovie();
    void holdMovie();
    void movieOff();
    void resume();

    //Added events:
    void downloadFinished();

}

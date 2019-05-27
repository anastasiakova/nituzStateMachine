public class Context {

    public State currentInternetConnection;
    public State currentOffOn;

    public Context() {
        this.currentInternetConnection = new Offline(this);
        this.currentOffOn = new Off(this);
    }

    void turnOn() {
        currentOffOn.turnOn();
    }

    void turnOff() {
        currentOffOn.turnOff();
    }

    void internetOn() {
        currentInternetConnection.internetOn();
    }

    void internetOff() {
        currentInternetConnection.internetOff();
    }

    void fileRequest() {
        currentOffOn.fileRequest();
    }

    void downloadAborted() {
        currentOffOn.downloadAborted();
    }

    void downloadError() {
        currentOffOn.downloadError();
    }

    void errorFixed() {
        currentOffOn.errorFixed();
    }

    void movieOn() {
        currentOffOn.movieOn();
    }

    void restartMovie() {
        currentOffOn.restartMovie();
    }

    void holdMovie() {
        currentOffOn.holdMovie();
    }

    void movieOff() {
        currentOffOn.movieOff();
    }

    void resume() {
        currentOffOn.resume();
    }

    void downloadFinished() {
        currentOffOn.downloadFinished();
    }
}

//    //off
//    private Off off;
//
//    //on:
//    private On on;
//    //Connection region
//    private Online online;
//    private Offline offline;
//
//    //Download superstate
//    private Download download;
//    private Wait wait;
//    private DownloadProc downloadProc;
//    private Recover recover;
//
//    //download management region
//    private DownloadIdle downloadIdle;
//    private OutOfDisk outOfDisk;
//
//    //download requests management
//    private DownloadRequests downloadRequests;
//
//    //Movie player
//    private IdlePlayer idlePlayer;
//    private Play play;
//    private Pause pause;



//        this.off = new Off(this);
//        this.on = new On(this);
//        this.online = new Online(this);
//        this.offline = new Offline(this);
//        this.download = new Download(this);
//        this.wait = new Wait(this);
//        this.downloadProc = new DownloadProc(this);
//        this.recover = new Recover(this);
//        this.downloadIdle = new DownloadIdle(this);
//        this.outOfDisk = new OutOfDisk(this);
//        this.downloadRequests = new DownloadRequests(this);
//        this.idlePlayer = new IdlePlayer(this);
//        this.play = new Play(this);
//        this.pause = new Pause(this);


//    public Off getOff() {
//        return off;
//    }
//
//    public On getOn() {
//        return on;
//    }
//
//    public Online getOnline() {
//        return online;
//    }
//
//    public Offline getOffline() {
//        return offline;
//    }
//
//    public Download getDownload() {
//        return download;
//    }
//
//    public Wait getWait() {
//        return wait;
//    }
//
//    public DownloadProc getDownloadProc() {
//        return downloadProc;
//    }
//
//    public Recover getRecover() {
//        return recover;
//    }
//
//    public DownloadIdle getDownloadIdle() {
//        return downloadIdle;
//    }
//
//    public OutOfDisk getOutOfDisk() {
//        return outOfDisk;
//    }
//
//    public DownloadRequests getDownloadRequests() {
//        return downloadRequests;
//    }
//
//    public IdlePlayer getIdlePlayer() {
//        return idlePlayer;
//    }
//
//    public Play getPlay() {
//        return play;
//    }
//
//    public Pause getPause() {
//        return pause;
//    }

